# syntax=docker/dockerfile:1

FROM maven:3.9-amazoncorretto-8-debian-bullseye

WORKDIR .

RUN mvn dependency:resolve

COPY src ./src

CMD ["mvn", "spring-boot:run"]
