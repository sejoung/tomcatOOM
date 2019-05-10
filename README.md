# tomcatOOM

톰켓 OOM 테스트용

```
java -server -Xms256m -Xmx512m -jar tomcatOOM.jar


curl -X GET "http://localhost:8080/apis/test"

```

위에처럼 힙사이즈를 설정하면 해당 사이즈만큼 실행된다.

jdk11으로 빌드함
