# Kafka Basics

This project provides a basic introduction to working with Apache Kafka using Java and Spring Boot. It covers fundamental concepts, sample producer and consumer code, and basic configuration to help you get started with Kafka in a real-world Java environment.

---

## Project Structure

```
kafka-basics/
│
├── .idea/                  # IDE configuration files
├── .mvn/                   # Maven wrapper files
├── .vscode/                # VS Code settings
├── src/
│   ├── main/
│   │   ├── java/com/omarjuma/kafka/
│   │   │   ├── config/         # Kafka config classes (Consumer, Producer, Topic)
│   │   │   ├── controllers/    # Controller for message endpoints
│   │   │   ├── dto/            # Data transfer objects
│   │   │   ├── utils/          # Utility classes for Kafka listeners
│   │   │   └── KafkaApplication.java  # Spring Boot main application
│   │   └── resources/
│   │       ├── application.properties # App configuration
│   │       ├── static/
│   │       └── templates/
│   └── test/
│       └── java/com/omarjuma/kafka/
│           └── KafkaApplicationTests.java
├── target/                  # Compiled output
├── .gitattributes
├── .gitignore
├── HELP.md                  # Spring Boot help/reference
├── mvnw, mvnw.cmd           # Maven wrapper scripts
├── pom.xml                  # Maven project config
└── README.md
```

---

## Key Features

- **Spring Boot integration** for rapid development
- **Kafka Producer** and **Consumer** configuration
- RESTful **controller** for sending messages
- DTOs for message structure
- Listener utilities for consuming Kafka topics

---

## Getting Started

### Prerequisites

- Java 8 or newer
- Maven 3.6+
- Apache Kafka (local server or Docker)

### Setup

1. **Clone the repository:**
   ```sh
   git clone https://github.com/OmariJuma/kafka-basics.git
   cd kafka-basics
   ```

2. **Start Kafka & Zookeeper**
   - Follow the [Kafka Quickstart](https://kafka.apache.org/quickstart) for local setup, or use Docker:
     ```sh
     docker-compose up -d
     ```

3. **Configure application.properties**
   - Edit `src/main/resources/application.properties` if you need to match your local Kafka settings.

4. **Build and run the application:**
   ```sh
   ./mvnw spring-boot:run
   ```

---

## Usage

- Use the REST API via `MessageController` to produce messages to Kafka.
- Consumers are configured to listen and process messages (see `KafkaListeners.java`).
- Custom configurations are provided in the `config` package.

---

## Documentation

- See [HELP.md](HELP.md) for detailed Spring Boot and project usage help.
- See configuration classes (e.g., `KafkaProducerConfig.java`, `KafkaConsumerConfig.java`) for Kafka setup details.

---

## Resources

- [Apache Kafka Documentation](https://kafka.apache.org/documentation/)
- [Spring for Apache Kafka Reference](https://docs.spring.io/spring-kafka/docs/current/reference/html/)

---

## License

MIT License

---

© 2025 [Omari Juma](https://github.com/OmariJuma)
