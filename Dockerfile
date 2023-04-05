FROM maven:3.8.3-openjdk-17
RUN apk-get update        
RUN apk-get install -y git
RUN git clone https://github.com/BharadwajaC/DemoAPiTest.git
RUN chmod -R 777 DemoAPiTest
WORKDIR /DemoAPiTest
RUN mvn -v
RUN mvn clean test
