FROM eclipse-temurin:17
COPY target/chumma.jar chumma.jar
CMD ["java","-jar","chumma.jar"]