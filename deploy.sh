<<<<<<< HEAD
#!/bin/bash

REPOSITORY=/home/ubuntu/back
BUILDREPO=/home/ubuntu/real_back
sudo cp $REPOSITORY/*.jar $BUILDREPO/

CURRENT_PID=$(pgrep -fl dm | awk '{print $1}')

if [ -z "$CURRENT_PID" ]; then
    echo "> 현재 구동중인 애플리케이션이 없으므로 종료하지 않습니다."
else
    echo "> kill -15 $CURRENT_PID"
    kill -15 $CURRENT_PID
    sleep 5
fi

JAR_NAME=$(ls -tr $BUILDREPO/*.jar | tail -n 1)

sudo chmod +x $JAR_NAME

=======
#!/bin/bash

REPOSITORY=/home/ubuntu/back
BUILDREPO=/home/ubuntu/real_back
sudo cp $REPOSITORY/*.jar $BUILDREPO/

CURRENT_PID=$(pgrep -fl dm | awk '{print $1}')

if [ -z "$CURRENT_PID" ]; then
    echo "> 현재 구동중인 애플리케이션이 없으므로 종료하지 않습니다."
else
    echo "> kill -15 $CURRENT_PID"
    kill -15 $CURRENT_PID
    sleep 5
fi

JAR_NAME=$(ls -tr $BUILDREPO/*.jar | tail -n 1)

sudo chmod +x $JAR_NAME

>>>>>>> branch 'develop' of https://github.com/douzone-PCHR/GoCo_BackEnd.git
nohup java -jar $JAR_NAME > $REPOSITORY/nohup.out 2>&1 &