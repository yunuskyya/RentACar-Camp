## RentACar Application
# Overview
**This Java Spring Boot application manages a car rental system, providing RESTful APIs for CRUD operations on brands, models, and customers. It uses Spring Data JPA for data persistence and Jakarta Bean Validation for validation. The application includes exception handling for business-specific errors.**

# Table of Contents
- Brand Service
- Model Service
- Brand Manager
- Model Manager
- Request and Response Classes
- Exception Handling
- Controllers
- How to Run
- Dependencies
- Contributing
# Brand Service
**The BrandService interface defines operations for brands, including retrieving all, getting by ID, adding, updating, and deleting brands.**

# Model Service
**The ModelService interface defines operations for models, including retrieving all and adding new models.**

# Brand Manager
**The BrandManager class implements BrandService, providing logic for brand operations. Brand-specific rules are in BrandBusinessRules**.

# Model Manager
**The ModelManager class implements ModelService, providing logic for model operations.**

# Request and Response Classes
**Various classes define data structures for communication between client and server.**

# Exception Handling
**The GlobalExceptionHandler class handles business exceptions and validation errors, returning detailed responses.**

# Controllers
# Brands Controller
**Handles HTTP requests related to brands: retrieving all, getting by ID, adding, updating, and deleting.**

# Models Controller
**Handles HTTP requests related to models: retrieving all and adding new models.**

# How to Run
**Run the application using the main method in RentACarApplication. Ensure dependencies and a compatible Java runtime are installed.**

# Dependencies
- Spring Boot
- Spring Data JPA
- Jakarta Bean Validation
- ModelMapper

