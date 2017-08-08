FROM openjdk:8-jre-alpine
LABEL maintainer "Synoa GmbH <we@synoa.de>"

ENV _JAVA_OPTIONS="-Xms64m -Xmx128m"

ENTRYPOINT ["/usr/bin/java", "-jar", "/helloworld.jar"]

ADD target/helloworld.jar /
ADD application.properties /