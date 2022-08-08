package com.pchr.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3Client;
import com.pchr.dto.FileDTO;

import software.amazon.awssdk.awscore.exception.AwsServiceException;
import software.amazon.awssdk.core.exception.SdkClientException;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.core.waiters.WaiterResponse;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.DeleteObjectRequest;
import software.amazon.awssdk.services.s3.model.HeadObjectRequest;
import software.amazon.awssdk.services.s3.model.HeadObjectResponse;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.services.s3.model.S3Exception;
import software.amazon.awssdk.services.s3.waiters.S3Waiter;

public class S3Util {

	private static final String BUCKET = "pchr-goco";

	// S3 업로드
	public static void uploadFile(String fileName, InputStream inputStream)
			throws S3Exception, AwsServiceException, SdkClientException, IOException {
		S3Client client = S3Client.builder().build();

		PutObjectRequest request = PutObjectRequest.builder().bucket(BUCKET).key(fileName).build();

		client.putObject(request, RequestBody.fromInputStream(inputStream, inputStream.available()));

		S3Waiter waiter = client.waiter();
		HeadObjectRequest waitRequest = HeadObjectRequest.builder().bucket(BUCKET).key(fileName).build();
		WaiterResponse<HeadObjectResponse> waiterResponse = waiter.waitUntilObjectExists(waitRequest);

		waiterResponse.matched().response().ifPresent(x -> {
			System.out.println("The file " + fileName + " is now ready");
		});
	}

	// S3 파일 삭제
	public static void deleteFile(String fileName) {
		S3Client client = S3Client.builder().build();

		DeleteObjectRequest deleteRequest = DeleteObjectRequest.builder().bucket(BUCKET).key(fileName).build();

		client.deleteObject(deleteRequest);
	}

	// URL 받아오기
	private static String getFileUrl(String fileName) {
		AmazonS3Client amazonS3Client = (AmazonS3Client) AmazonS3Client.builder().build();
		return amazonS3Client.getResourceUrl(BUCKET, fileName);
	}

	// S3 업로드 적용
	public static FileDTO S3Upload(MultipartFile multipart)
			throws S3Exception, AwsServiceException, SdkClientException, IOException {
		String originalFileName = multipart.getOriginalFilename();

		// 파일을 같이 업로드하지 않았을 경우 s3에 저장되지 않고 null을 반환
		if (originalFileName.length() != 0) {
			String fileName = UUID.randomUUID().toString() + "_" + originalFileName;
			try {

				S3Util.uploadFile(fileName, multipart.getInputStream()); // S3 File Upload 부분 신경 안써도 됨.
				String filePath = S3Util.getFileUrl(fileName); // S3 url 값 받아오기
				FileDTO fileDTO = FileDTO.builder().fileName(fileName).originalName(originalFileName).filePath(filePath)
						.build();
				return fileDTO;
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return null;

	}

}
