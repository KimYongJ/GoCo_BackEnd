# GoCo_BackEnd

## Version
- Java8 (JDK 1.8)
- Spring Boot (2.7.0)
- Maven 4.0.0

- SECURITY(JWT)
	- JJWT-API : 0.11.2
	- JJWT-IMPL : 0.11.2
	- JJWT-JACKSON : 0.11.2
	
	
	<div align="center">
  <br />
  <img src="./readme_assets/drawingdream_logo.png" alt="DrawingDream" />
  <br />
  <h1> Go Company </h1>
  <br />
</div>

## 목차

1. [**서비스 소개**](#1)
2. [**기술 스택**](#2)
3. [**시스템 아키텍처**](#3)
4. [**주요기능 및 데모영상**](#4)
5. [**협업 관리**](#5)
6. [**개발 멤버 소개**](#6)
7. [**프로젝트 기간**](#7)
8. [**프로젝트 관련 문서**](#8)


<br/>


<div id="1"></div>

## 💡 서비스 소개

### 근태와 업무, 결재 관리를 한번에! 

> 이번 달 내 근무 시간은 얼마나 될까? 이번 주에 누가 출장이지? 내 휴가 신청이 승인됐을까? <br />
GoCo는 근태와 내 일정관리, 같은 팀원의 출장 / 휴가 / 사내업무 일정확인 , 결재 관리를 캘린더를 통해 한번에 확인 할 수 있습니다.<br />
>
#### 모두에게 편리한 GoCo, Go Company! 출근부터 퇴근까지 함께 하세요! 

<br/>

<div id="2"></div>

## 🛠️ 기술 스택

<img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=Java&logoColor=#007396" style="height : auto; margin-left : 10px; margin-right : 10px;"/> <img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=for-the-badge&logo=Spring Boot&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/> <img src="https://img.shields.io/badge/JSON Web Tokens-000000?style=for-the-badge&logo=JSON Web Tokens&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/> <img src="https://img.shields.io/badge/Spring Security-6DB33F?style=for-the-badge&logo=Spring Security&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/> <img src="https://img.shields.io/badge/Amazon S3-569A31?style=for-the-badge&logo=Amazon S3&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/><br>
<img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=Gradle&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/> <img src="https://img.shields.io/badge/Nginx-009639?style=for-the-badge&logo=NGINX&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/> <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=Docker&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/> <img src="https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=Jenkins&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/> <img src="https://img.shields.io/badge/Ubuntu-E95420?style=for-the-badge&logo=Ubuntu&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/><br>
<img src="https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=React&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/> <img src="https://img.shields.io/badge/Redux-764ABC?style=for-the-badge&logo=Redux&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/> <img src="https://img.shields.io/badge/Node.js-339939?style=for-the-badge&logo=Node.js&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/> <br>
<img src="https://img.shields.io/badge/Jira-0052CC?style=for-the-badge&logo=Jira&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/> <img src="https://img.shields.io/badge/GitLab-FCA121?style=for-the-badge&logo=GitLab&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/> <br/>

<details><summary> <b> 상세 기술스택 및 버전</b> </summary>

| 구분       | 기술스택                    | 상세내용                 | 버전          |
| -------- | ----------------------- | -------------------- | ----------- |
| 공통     | 형상관리                    | Github               | \-          |
|          | 이슈관리                   | Notion               | \-          |
|          | 커뮤니케이션                | Notion, Slack        | \-          |
| BackEnd  | DB                      | MySQL                | 8.0.28      |
|          |                         | JPA                  | \-          |
|          |                         | QueryDSL             | \-          |
|          | Java                    | JDK                  | 8           |
|          | Spring                  | Spring Boot          | 2.7.0       |
|          | IDE                     | STS                  | 3.9.15      |
|          | Cloud Storage           | AWS S3               | \-          |
|          | Build                   | Maven                | 4.0.0       |
| FrontEnd | HTML5                   |                      | \-          |
|          | CSS3                    |                      | \-          |
|          | JavaScript(ES8)         |                      | \-          |
|          | 		             | Axios                | 0.27.2      |
|          | React                   | React                | 18.2.0      |
|          | 	                     | React-Router-Dom	    | 6.3.0       |	
|          |                         | Meterial UI          | 5.10.2      |
|          |                         | SweetAlert2          | 11.4.26     |
|          |                         | FullCalendar         | 5.11.2      |
|          | IDE                     | Visual Studio Code   | 1.66.2      |
| Server   | 서버                     | AWS EC2              | \-          |
|          | 플랫폼                    | Ubuntu               | 22.04       |
|          | 배포                     | Travis ci            | \-          |
|          |                         | Ruby                 | 3.0.2       |
|          |                         | AWS CodeDeploy       | \-          |

</details>

<br />

<div id="3"></div>

## 🗂️ 시스템 아키텍처

|                              시스템 구성                           |
| :------------------------------------------------------------------------------: |
| ![image](https://user-images.githubusercontent.com/8343301/154484342-36cff26d-a96b-4d52-8be0-4383aad54510.png) |


|                              CI/CD 배포 흐름도                           |
| :------------------------------------------------------------------------------: |
| ![image](https://user-images.githubusercontent.com/8343301/154471327-63b80f5d-b724-4365-b30b-0dfe04b7f4f8.png) |

|                              디렉토리 구조                       |
| :------------------------------------------------------------------------------: |
| ![image](https://user-images.githubusercontent.com/8343301/154848775-fc6afad1-816a-44b9-bc07-e1ce2af2c5b4.png) |

<br />

<div id="4"></div>

## 🖥️ 주요기능

### 근태 관리
- 로그인 후 출근 버튼을 누르면 출근 상태로 전환 되고, 퇴근을 누르면 퇴근 상태로 전환 됩니다.
- 현재 출/퇴근 , 지각,  휴가 , 출장 여부는 헤더에서 확인 할 수 있습니다.
- 사원은 .
- 선생님은 원활한 수업진행을 위해 화면공유를 할 수 있습니다. 

### 수업 알림
- 교사가 시간표에 맞춰 온라인 수업을 개설하면, 해당 수업을 수강하는 학생의 화면에 수업알림 모달창이 나타납니다.
- 또한, 수업 자료(첨부파일)를 확인할 수 있으며, [지금 들어가기] 버튼을 통해 해당 온라인수업에 입장할 수 있습니다.

|                              온라인 수업 및 수업알림                       |
| :---------------------------------------------------------------------------: |
|  <img src="./readme_assets/onlineclass.gif" alt="온라인수업" />  |

### 채팅
- 학생, 선생님과 채팅이 가능하며, 지난 채팅 기록도 확인 가능합니다.
- 다른 유저가 채팅을 보내면 채팅 아이콘(말풍선)에 알림 표시가 나타납니다.

|                              채팅                       |
| :---------------------------------------------------------------------------: |
|  <img src="./readme_assets/chat.gif" alt="채팅" />  |

### 알림장
- 교사는 알림장(공지)을 작성할 수 있습니다.
- 카테고리 설정으로, 원하는 학생(학교 전체, 학년, 반)에게 보여지도록 설정합니다.
- toast-ui 에디터를 사용해서 글을 쉽게 편집할 수 있으며, Drag&Drop 으로 편리하게 첨부파일을 추가할 수 있습니다.  

|                              알림장(선생님)                  |
| :---------------------------------------------------------------------------: |
|  <img src="./readme_assets/notice_teacher.gif" alt="알림장(선생님) " />  |

|                              알림장(학생)                  |
| :---------------------------------------------------------------------------: |
|  <img src="./readme_assets/notice_student.gif" alt="알림장(학생) " />  |
    
### 홈 화면(위젯) 설정 
- 메인 페이지에서 [설정 > 홈 화면 설정] 을 클릭하면 홈 화면에 배치되는 위젯들을 관리할 수 있습니다.
- 배치를 원하는 위젯을 원하는 순서로 구성할 수 있습니다.

|                              홈 화면 설정                      |
| :---------------------------------------------------------------------------: |
|  <img src="./readme_assets/widget.gif" alt="홈 화면 설정" />  |

### 다크모드 지원
- 사용자의 눈 건강 및 취향을 고려하여 다크모드를 지원합니다.
- 메인 페이지에서 [설정 > 다크모드 on/off] 를 클릭하면 다크모드를 적용할 수 있습니다. 

|                              다크모드                     |
| :---------------------------------------------------------------------------: |
|  <img src="./readme_assets/dark_mode.gif" alt="다크모드" />  |

<br/>

<div id="5"></div>

## 🎥 [UCC 보러가기](https://youtu.be/Rg4kOlrdI78) 

<br />

<div id="6"></div>

## 👥 협업 관리 

|                            Jira BurnDown Chart                      |
| :---------------------------------------------------------------------------: |
|  <img src="./readme_assets/a607_Jira.png" alt="Jira BurnDown Chart" />  |

|                            Notion                      |
| :---------------------------------------------------------------------------: |
|  <img src="./readme_assets/a607_Notion.png" alt="Notion" />  |

<br />

<div id="7"></div>

## 👪 개발 멤버 소개 
<table>
    <tr>
        <td height="140px" align="center"> <a href="https://github.com/Jubi-in">
<!--             <img src="https://avatars.githubusercontent.com/Jubi-in" width="140px" /> <br><br> 👑 인주비 <br>(Front-End) </a> <br></td> -->
        <td height="140px" align="center"> <a href="https://github.com/unilion">
<!--             <img src="https://avatars.githubusercontent.com/unilion" width="140px" /> <br><br> 🙂 장준범 <br>(Front-End) </a> <br></td> -->
        <td height="140px" align="center"> <a href="https://github.com/jejinmyeong">
<!--             <img src="https://avatars.githubusercontent.com/jejinmyeong" width="140px" /> <br><br> 😆 제진명 <br>(Front-End) </a> <br></td> -->
        <td height="140px" align="center"> <a href="https://github.com/kibum414">
<!--             <img src="https://avatars.githubusercontent.com/kibum414" width="140px" /> <br><br> 😁 박기범 <br>(Back-End) </a> <br></td> -->
        <td height="140px" align="center"> <a href="https://github.com/changhyuns">
<!--             <img src="https://avatars.githubusercontent.com/changhyuns" width="140px" /> <br><br> 🙄 손창현 <br>(Back-End) </a> <br></td> -->
        <td height="140px" align="center"> <a href="https://github.com/dayaeLee777">
<!--             <img src="https://avatars.githubusercontent.com/dayaeLee777" width="140px" /> <br><br> 😶 이다예 <br>(Back-End) </a> <br></td> -->
    </tr>
    <tr>
        <td align="center">UI/UX<br/>React<br/>WebRTC<br/>WebSocket</td>
        <td align="center">UI/UX<br/>React</td>
        <td align="center">UI/UX<br/>React</td>
        <td align="center">REST API<br/>WebRTC<br/>WebSocket</td>
        <td align="center">REST API<br/>CI/CD<br/>Infra<br/></td>
        <td align="center">REST API<br/>Database<br/>S3<br/></td>
    </tr>
</table>

<br />

<div id="8"></div>

## 📆 프로젝트 기간
### 22.1.10 ~ 22.2.18
- 기획 및 설계 : 22.1.10 ~ 19
- 프로젝트 구현 : 22.1.20 ~ 22.2.15
- 버그 수정 및 산출물 정리 : 22.2.16 ~ 18

<br />

<div id="9"></div>

## 📋 프로젝트 관련 문서
|  구분  |  링크  |
| :--------------- | :---------------: |
| 공통코드 | [공통코드 바로가기](/docs/공통코드.md) |
| 와이어프레임 | [와이어프레임 바로가기](/docs/와이어프레임.md) |
| 컨벤션목록 | [컨벤션목록 바로가기](/docs/컨벤션목록.md) |
| 테스트데이터 | [테스트데이터 바로가기](/docs/테스트데이터.md) |
| ERD | [ERD 바로가기](/docs/ERD.md) |
| 빌드/배포 | [빌드/배포 바로가기](/exec/01_서울_6반_A607_빌드및배포.pdf) |
| 외부서비스 정보 | [외부서비스 정보 바로가기](/exec/02_서울_6반_A607_외부서비스_정보.pdf) |
| 시연 시나리오 | [시연 시나리오 바로가기](/exec/04_서울_6반_A607_시연시나리오.pdf) |
| 발표자료 | [발표자료 바로가기](/docs/서울_6반_A607_발표자료.pdf) |
