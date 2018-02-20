FROM openjdk:8-jre-alpine
LABEL maintainer="Synoa GmbH <we@synoa.de>"

# This can be overriden and used configure the amount of Memory used by this Service
ENV _JAVA_OPTIONS="-Xms64m -Xmx128m"

# Start it this way, so Spring can access Environment Variables
ENTRYPOINT ["/usr/bin/java", "-jar", "/helloworld.jar"]

# Set the Timezone to CET/CEST
RUN apk update
RUN apk add tzdata
RUN cp /usr/share/zoneinfo/Europe/Berlin /etc/localtime
RUN echo "Europe/Berlin" > /etc/timezone
RUN apk del tzdata
RUN rm -rf /var/cache/apk/*

# Add the compiled Jar and the default Properties
ADD target/helloworld.jar /
ADD application.properties /
