## Spring Framework Concepts Practice

A comprehensive collection of Spring Boot projects demonstrating core Spring concepts including dependency injection, component scanning, and bean management through progressive learning modules.

### 📚 Overview

This repository contains multiple Spring Boot modules designed to help developers understand and practice fundamental Spring framework concepts through hands-on examples. Each module builds upon previous concepts, creating a structured learning path.

### 🏗️ Modules

#### FirstSpring
- **Focus**: Basic Spring Boot setup and component scanning
- **Concepts**: `@Component` annotation, bean registration, Spring container basics
- **Entity**: Student class with Spring-managed beans
- **Learning Outcome**: Understand how Spring discovers and manages beans

#### SecondSpring
- **Focus**: Inter-module dependencies and Maven relationships
- **Concepts**: Maven dependencies, bean wiring between modules
- **Entities**: Student and Address with relationship mapping
- **Learning Outcome**: Learn dependency management in multi-module projects

#### ThirdSpring
- **Focus**: Advanced dependency injection patterns
- **Concepts**: Constructor injection, interface-based programming, polymorphism
- **Entities**: Employee with Department interface (ITDepartment, SalesDepartment)
- **Learning Outcome**: Master dependency injection with interfaces and implementations

#### Demo Projects (demo1, demo2, demo3)
- **Focus**: Reinforcement and practice exercises
- **Concepts**: Progressive complexity in dependency management
- **Entities**: Laptop and OS relationships with varying injection patterns
- **Learning Outcome**: Apply learned concepts through practical exercises

### 🛠️ Technology Stack

- **Java**: 17
- **Spring Boot**: 4.0.1
- **Build Tool**: Maven
- **Core Framework**: Spring Framework
- **Architecture**: Multi-module Maven project

### 🚀 Getting Started

#### Prerequisites
- Java 17 or higher installed
- Maven 3.6 or higher
- IDE (IntelliJ IDEA, Eclipse, or VS Code)

#### Quick Start

Each module is independently runnable:

```bash
# Navigate to desired module
cd FirstSpring

# Run the Spring Boot application
mvn spring-boot:run

# Or build and run
mvn clean package
java -jar target/FirstSpring-0.0.1-SNAPSHOT.jar
```

#### Build All Modules

```bash
# Build all modules from root directory
mvn clean install

# Run tests across all modules
mvn test
```

### 🎯 Learning Path

#### Beginner Level
1. Start with **FirstSpring** to understand basic Spring Boot setup
2. Learn component scanning and bean lifecycle

#### Intermediate Level
3. Move to **SecondSpring** for dependency management
4. Understand Maven multi-module projects

#### Advanced Level
5. Study **ThirdSpring** for advanced DI patterns
6. Master interface-based programming with Spring

#### Practice
7. Complete **demo1, demo2, demo3** for reinforcement
8. Experiment with custom implementations

### 📁 Project Structure

```
spring-concepts-practice/
├── FirstSpring/          # Entry point - Basic Spring concepts
├── SecondSpring/         # Step 2 - Dependency management
├── ThirdSpring/          # Step 3 - Advanced DI patterns
├── demo1/               # Practice - Basic relationships
├── demo2/               # Practice - Complex dependencies
├── demo3/               # Practice - Custom implementations
└── README.md            # This file
```

### 🔍 Key Concepts Covered

- **Dependency Injection**: Constructor and field injection
- **Component Scanning**: Automatic bean discovery
- **Bean Lifecycle**: Creation, initialization, and destruction
- **Interface Programming**: Abstraction and polymorphism
- **Multi-module Projects**: Maven project organization
- **Spring Boot Configuration**: Application properties and auto-configuration

### 💡 Usage Tips

- Run modules in sequence for optimal learning
- Examine the source code to understand annotations
- Use IDE debugging to trace bean creation
- Modify entities to experiment with different configurations
- Check Spring Boot logs for bean registration details

### 🤝 Contributing

This is a learning repository. Feel free to:
- Use the code for educational purposes
- Modify examples to experiment with Spring concepts
- Suggest improvements through issues
- Add new practice modules following the established pattern

**Note**: This repository is designed for educational purposes to help developers learn Spring Framework concepts progressively.
