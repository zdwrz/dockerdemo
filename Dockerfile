FROM java:8
VOLUME /tmp
ADD dockerdemo-0.0.1-SNAPSHOT.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]