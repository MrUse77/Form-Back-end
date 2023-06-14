FROM amazoncorretto:17


COPY target/formulario-0.0.1-SNAPSHOT.jar formulario-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/formulario-0.0.1-SNAPSHOT.jar"]
