Hospital Management System is developed using Spring Boot and MySQL database.
Follows microservice architecture.

Eureka Server (service registry) acts as the heart of the microservices, allowing service instances to register themselves and facilitating service discovery.
Client Registration: Instances of microservices automatically register themselves with Eureka Server.
Service Discovery: Eureka Server maintains a registry of all client applications running on different ports and IP addresses.
