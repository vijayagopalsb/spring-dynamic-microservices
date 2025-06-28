<p align="center">
  <a href="https://www.oracle.com/java/">
    <img src="https://img.shields.io/badge/Java-17-blue?logo=java" />
  </a>
  <a href="https://spring.io/projects/spring-boot">
    <img src="https://img.shields.io/badge/Spring%20Boot-3.2.5-brightgreen?logo=spring-boot" />
  </a>
  <a href="https://spring.io/projects/spring-cloud-gateway">
    <img src="https://img.shields.io/badge/Spring%20Cloud-Gateway-green?logo=spring" />
  </a>
  <a href="https://spring.io/projects/spring-cloud-netflix">
    <img src="https://img.shields.io/badge/Eureka-Service%20Discovery-blueviolet?logo=spring" />
  </a>
  <a href="https://maven.apache.org/">
    <img src="https://img.shields.io/badge/Maven-Build%20Tool-orange?logo=apache-maven" />
  </a>
  <a href="https://www.docker.com/">
    <img src="https://img.shields.io/badge/Docker-Containerized-blue?logo=docker" />
  </a>
  <a href="https://docs.docker.com/compose/">
    <img src="https://img.shields.io/badge/Docker--Compose-Microservices-lightgrey?logo=docker" />
  </a>
  <a href="https://swagger.io/docs/specification/about/">
    <img src="https://img.shields.io/badge/REST%20API-Design%20Pattern-critical?logo=swagger" />
  </a>
  <a href="https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html">
    <img src="https://img.shields.io/badge/Clean%20Architecture-Enabled-yellowgreen?logo=architecture" />
  </a>
  <a href="https://github.com/vijayagopalsb/spring-dynamic-microservices/blob/main/LICENSE">
    <img src="https://img.shields.io/github/license/vijayagopalsb/spring-dynamic-microservices?color=blue" />
  </a>
  
<a href="https://sonarcloud.io/summary/new_code?id=vijayagopalsb_spring-dynamic-microservices">
  <img src="https://sonarcloud.io/api/project_badges/measure?project=vijayagopalsb_spring-dynamic-microservices&metric=alert_status" alt="Quality Gate Status"/>
</a>


<a href="https://sonarcloud.io/summary/new_code?id=vijayagopalsb_spring-dynamic-microservices">
  <img src="https://sonarcloud.io/api/project_badges/measure?project=vijayagopalsb_spring-dynamic-microservices&metric=sqale_rating" alt="Maintainability"/>
</a>


<a href="https://sonarcloud.io/summary/new_code?id=vijayagopalsb_spring-dynamic-microservices">
  <img src="https://sonarcloud.io/api/project_badges/measure?project=vijayagopalsb_spring-dynamic-microservices&metric=reliability_rating" alt="Reliability"/>
</a>


<a href="https://sonarcloud.io/summary/new_code?id=vijayagopalsb_spring-dynamic-microservices">
  <img src="https://sonarcloud.io/api/project_badges/measure?project=vijayagopalsb_spring-dynamic-microservices&metric=security_rating" alt="Security"/>
</a>

<a href="https://sonarcloud.io/summary/overall?id=vijayagopalsb_spring-dynamic-microservices">
  <img src="https://sonarcloud.io/api/project_badges/measure?project=vijayagopalsb_spring-dynamic-microservices&metric=coverage" alt="Coverage Badge"/>
</a>

</p>

# Spring Dynamic Microservices
This is a comprehensive **Java-based microservices system** built with Spring Boot 3.x and Spring Cloud. It demonstrates dynamic service registration, routing, and payment processing using a modular architecture. The project includes CI integration with GitHub Actions and code quality checks with SonarCloud and JaCoCo.

#### Architecture Overview
- **eureka-server**: Acts as the service registry for all microservices.
- **gateway-service**: A Spring Cloud Gateway-based API Gateway that routes requests dynamically to microservices.
- **payment-service-paypal**: A microservice simulating PayPal payment logic, registered with Eureka.
- **payment-service-stripe**: A microservice simulating Stripe payment logic, registered with Eureka.
- **docker-compose.yml**: Boots up all services with required ports and network for full-stack integration.

All services are **auto-discovered via Eureka** and routed through **Spring Cloud Gateway** without hardcoded endpoints.

#### Modules
- `common-api` – Shared domain objects, constants, and utilities.
- `eureka-server` – Service discovery server powered by Netflix Eureka.
- `gateway-service` – Spring Cloud Gateway for dynamic routing and API exposure.
- `payment-service-paypal` – PayPal-specific payment microservice.
- `payment-service-stripe` – Stripe-specific payment microservice.

#### DevOps, CI/CD & Quality Tools
```
| Tool          | Purpose                        |
|---------------|--------------------------------|
| GitHub Actions| CI/CD pipeline                 |
| Docker        | Containerization               |
| Docker Compose| Multi-container orchestration  |
| JaCoCo        | Test coverage reports          |
| SonarCloud    | Code quality, static analysis  |
```

#### Testing
- Unit testing with JUnit 5
- Controller testing using Spring’s `MockMvc`
- Code coverage with JaCoCo (`target/site/jacoco/index.html`)
- Test reports pushed to SonarCloud

#### Run Locally with Docker Compose

##### Tech Stack
- Java 17
- Spring Boot 3.2.5
- Spring Cloud Gateway
- Eureka Server (Netflix OSS)
- RESTful APIs
- Maven
- Docker & Docker Compose

##### Running with Docker Compose

```bash
git clone https://github.com/vijayagopalsb/spring-dynamic-microservices.git
cd spring-dynamic-microservices
mvn clean package -DskipTests
docker-compose up --build
```

#### Service Access URLs

Here are the main endpoints for accessing services in this dynamic microservices project:

```
| Purpose                          | URL                                                              |
|----------------------------------|------------------------------------------------------------------|
| Eureka Dashboard                 | [http://localhost:8761](http://localhost:8761)                   |
| PayPal Service (Direct Access)   | [http://localhost:8082/hello](http://localhost:8082/hello)       |
| PayPal via Gateway               | [http://localhost:8090/payment-service-paypal/hello]             |
|                                  |             (http://localhost:8090/payment-service-paypal/hello) |
| Stripe Service (Direct Access)   | [http://localhost:8083/hello](http://localhost:8083/hello)       |
| Stripe via Gateway               | [http://localhost:8090/payment-service-stripe/hello]             |
|                                  |             (http://localhost:8090/payment-service-stripe/hello) |
| Gateway Test Route               | [http://localhost:8090/test/get](http://localhost:8090/test/get) |
```

#### CI Workflow

CI is triggered on push to `main`:
- Builds all modules
- Runs tests
- Sends coverage to SonarCloud
- Builds Docker images
- Pushes to DockerHub (if configured)

CI file: `.github/workflows/ci-all.yml`

#### SonarCloud Dashboard

View real-time static analysis and code coverage:

- [Coverage Report](https://sonarcloud.io/summary/overall?id=vijayagopalsb_spring-dynamic-microservices)
- [Code Quality](https://sonarcloud.io/summary/overall?id=vijayagopalsb_spring-dynamic-microservices)

#### Author

**Vijayagopal S**  
[GitHub](https://github.com/vijayagopalsb)

#### License

This project is licensed under the [MIT License](LICENSE).

