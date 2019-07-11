FROM maven as builder

ADD / /source
WORKDIR /source
RUN mvn package -DskipTests

FROM navikt/java:8-appdynamics
COPY --from=builder /source/target/veilarbdemo /app