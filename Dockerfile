FROM bellsoft/liberica-openjdk-alpine:11
# 描述
LABEL description="JDK"

RUN apk --no-cache add make maven
COPY ./settings.xml /root/.m2/settings.xml