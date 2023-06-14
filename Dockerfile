FROM amazoncorretto:17

MAINTAINER agusdor

COPY target/formulario-0.0.1-SNAPSHOT formulario-0.0.1-SNAPSHOT.jar

=
ENTRYPOINT ["java","-jar","/formulario-0.0.1-SNAPSHOT.jar"]
