# Demo Order Management System

A Spring Boot application demonstrating order management functionality with JPA entities, RESTful APIs, and MySQL database integration.

## Description

This demo project showcases a basic order management system built with Spring Boot. It includes entities for orders, order items, customers, products, and contact mechanisms. The application provides REST endpoints for creating, reading, updating, and managing orders and their associated items.

## Features

- **Order Management**: Create, retrieve, update, and list orders
- **Order Items**: Add items to orders and update their status
- **Entity Relationships**: Proper JPA mappings between orders, items, customers, and products
- **RESTful API**: HTTP endpoints for all CRUD operations
- **Database Integration**: MySQL database with JPA/Hibernate
- **Lombok Integration**: Reduced boilerplate code with annotations

## Technologies Used

- **Java 17**
- **Spring Boot 4.0.1**
- **Spring Data JPA**
- **Spring Web MVC**
- **MySQL Database**
- **Lombok**
- **Maven**

## Prerequisites

Before running this application, make sure you have the following installed:

- Java 17 or higher
- Maven 3.6+
- MySQL Server
- Git (optional, for cloning)

## Setup Instructions

1. **Clone the repository** (if applicable):
   ```bash
   git clone <repository-url>
   cd demo
   ```

2. **Configure Database**:
   - Create a MySQL database named `demo_db`
   - Update `src/main/resources/application.properties` with your database credentials:
     ```
     spring.datasource.url=jdbc:mysql://localhost:3306/demo_db
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Build the application**:
   ```bash
   mvn clean install
   ```

4. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```

The application will start on `http://localhost:8080`.

## API Endpoints

### Orders

- **POST** `/orders` - Create a new order
  - Request Body: OrderHeader JSON
  - Response: Created OrderHeader

- **GET** `/orders/{id}` - Get order by ID
  - Path Variable: `id` (Integer)
  - Response: OrderHeader JSON or error message

- **PUT** `/orders/{id}` - Update an existing order
  - Path Variable: `id` (Integer)
  - Request Body: OrderHeader JSON
  - Response: Updated OrderHeader or error message

- **GET** `/orders` - Get all orders
  - Response: List of OrderHeader JSON

### Order Items

- **POST** `/orders/items` - Add an item to an order
  - Request Body: OrderItem JSON
  - Response: Created OrderItem

- **PUT** `/orders/items/{itemId}/status` - Update item status
  - Path Variable: `itemId` (Integer)
  - Query Parameter: `status` (String)
  - Response: Updated OrderItem or error message

## Project Structure

```
demo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo/
│   │   │       ├── DemoApplication.java
│   │   │       ├── controller/
│   │   │       │   └── OrderController.java
│   │   │       ├── entity/
│   │   │       │   ├── ContactMech.java
│   │   │       │   ├── Customer.java
│   │   │       │   ├── OrderHeader.java
│   │   │       │   ├── OrderItem.java
│   │   │       │   └── Product.java
│   │   │       ├── repository/
│   │   │       │   ├── CustomerRepository.java
│   │   │       │   ├── OrderItemRepository.java
│   │   │       │   ├── OrderRepository.java
│   │   │       │   └── ProductRepository.java
│   │   │       └── service/
│   │   │           └── OrderService.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
│   └── test/
│       └── java/
│           └── com/example/demo/
│               └── DemoApplicationTests.java
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## Screenshots


### API Testing with Postman
![API Testing](Screenshots/add.png)
![API Testing](Screenshots/create.png)
![API Testing](Screenshots/delete.png)
![API Testing](Screenshots/deleteall.png)
![API Testing](Screenshots/get.png)
![API Testing](Screenshots/put.png)




*Note: Add your screenshots to the `screenshots/` directory and update the paths accordingly.*

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments

- Spring Boot Documentation
- JPA/Hibernate Documentation
- MySQL Documentation