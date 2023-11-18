FROM maven:3.8.2-openjdk-17

WORKDIR /app

# Copy only the POM file first
COPY pom.xml .

# Download dependencies. This layer will be cached unless the pom.xml file changes.
RUN mvn dependency:go-offline

# Copy the rest of the application files
COPY src ./src

# Build the application
RUN mvn clean install

CMD ["mvn", "spring-boot:run"]
