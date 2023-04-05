FROM maven:3.8.3-amazoncorretto-17
RUN yum update -y  
RUN yum install git -y
RUN git clone https://github.com/BharadwajaC/DemoAPiTest.git
RUN chmod -R 777 DemoAPiTest
WORKDIR /DemoAPiTest
RUN mvn -v
RUN mvn clean test
