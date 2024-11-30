FROM apache/flink:1.20.0

RUN rm ./lib/flink-scala_2.12-1.20.0.jar
ADD https://repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.5/scala-library-2.13.5.jar ./lib

RUN mkdir -p ./usrlib
COPY ./build/libs/scala-flink-playground-*-all.jar ./usrlib/test_job.jar