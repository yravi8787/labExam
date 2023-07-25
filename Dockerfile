FROM openjdk:latest
WORKDIR /app
COPY .   /app
RUN javac LargestNumberSum.java
CMD ["java", "LargestNumberSum"]