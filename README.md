# ecommerce-spring


# 🛍️ sb-ecom — Spring Boot E-Commerce Backend

This repository contains the backend code for a basic **e-commerce application** built using **Spring Boot**. It’s my first Spring project and focuses on managing product categories using RESTful APIs.

---

## 📂 Project Directory Structure

```

sb-ecom/
├── .mvn/                      # Maven Wrapper files
├── mvnw, mvnw\.cmd             # Maven wrapper executables
├── pom.xml                    # Maven project file (dependencies, build)
├── HELP.md                    # Spring initializer help (auto-generated)
├── src/
│   ├── main/
│   │   ├── java/com/ecommerce/project/
│   │   │   ├── SbEcomApplication.java     # Main Spring Boot class
│   │   │   ├── controller/                # REST Controller
│   │   │   │   └── CategoryController.java
│   │   │   ├── model/                     # JPA Entity
│   │   │   │   └── Category.java
│   │   │   ├── repositories/              # Repository Interface
│   │   │   │   └── CategoryRepository.java
│   │   │   └── service/                   # Service Layer
│   │   │       ├── CategoryService.java
│   │   │       └── CategoryServiceImpl.java
│   │   └── resources/
│   │       ├── application.properties     # Spring Boot config
│   │       ├── static/                    # (Optional) for static files
│   │       └── templates/                 # (Optional) for Thymeleaf templates
│   └── test/                              # Unit tests (if any)
└── target/                                # Build output

````

---

## 🔧 Technologies & Tools

- **Java 17**
- **Spring Boot 3.5.0**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database (in-memory)**
- **Lombok**
- **Maven**

---

## ✅ Features

- **Create** a new category  
- **Read** all available categories  
- **Update** an existing category  
- **Delete** a category  
- Basic error handling using `ResponseStatusException`

---

## 📑 API Endpoints

| Method | Endpoint                   | Description            |
|--------|----------------------------|------------------------|
| GET    | `/api/public/categories`   | Fetch all categories   |
| POST   | `/api/admin/categories`    | Add a new category     |
| PUT    | `/api/admin/categories/{id}` | Update existing category |
| DELETE | `/api/admin/categories/{id}` | Delete a category      |

---

## 🛠️ Run Locally

1. **Clone the repository**

```bash
git clone https://github.com/r-harshita/sb-ecom.git
cd sb-ecom
````

2. **Run the application**

```bash
./mvnw spring-boot:run
```

Or, if you’re using an IDE like IntelliJ or VS Code, run `SbEcomApplication.java`.

3. **Access H2 Console**
   URL: `http://localhost:8080/h2-console`
   JDBC URL: `jdbc:h2:mem:test`


---

## 🧠 Learning Goals

This project helped me learn:

* The structure of a Spring Boot project
* Creating REST APIs using Spring MVC
* Working with JPA and H2 in-memory DB
* Using Lombok to simplify boilerplate code
* Maven build and project setup

---

## ✨ Author

**Harshita Raashi**
Aspiring Java Backend Developer
📍 Bangalore, India
🔗 [LinkedIn](https://linkedin.com/in/harshita-raashi-1a739120a) | [GitHub](https://github.com/r-harshita)

---
