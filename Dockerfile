FROM registry.cn-hangzhou.aliyuncs.com/acs-sample/slave-java8:63b99a20

MAINTAINER 345249961@qq.com

COPY target/*.jar /app.jar

EXPOSE 8811

ENTRYPOINT ["java","-jar","/app.jar"]
