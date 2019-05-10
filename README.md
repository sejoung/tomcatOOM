# tomcatOOM

톰켓 OOM 테스트용

```
java -server -Xms256m -Xmx512m -jar tomcatOOM.jar


curl -X GET "http://localhost:8080/apis/test"

```
-Xms=N - 최소 힙사이즈

-Xmx=N - 최대 힙사이즈

-XX:MetaspaceSize=N  - 메타 공간의 초기 크기 (및 최소 크기)를 설정합니다.

-XX:MaxMetaspaceSize=N  - 메타 공간의 최대 크기를 설정합니다.


위에처럼 힙사이즈를 설정하면 해당 사이즈만큼 실행된다.

jdk11으로 빌드함
