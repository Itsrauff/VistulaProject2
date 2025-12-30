Product Backend Project 🛒

This project is designed to implement basic CRUD operations that allow creating, retrieving, updating, and deleting products.

The project demonstrates the fundamentals of REST API development and exception handling. Java is used as the main programming language together with the Spring Boot framework. The H2 database is applied for data storage purposes. Swagger UI is utilized to visualize and test the API endpoints.

Tech Stack 💻

I. Java 17+
II. Spring Boot
III. Spring Web
IV. Spring Data JPA
V. H2 Database
VI. Swagger / Springdoc OpenAPI

🔗 Features - API Endpoints

Create - POST "/"
Used to create a new product using the createProduct method. It accepts request data from the request body and returns a new response if no issues occur.

<img width="1421" height="306" alt="Screenshot 2025-12-08 at 01 14 52" src="https://github.com/user-attachments/assets/9a6ff7bd-67be-4a3a-b1cb-51ac583a42af" />

Get - GET "/{id}"
Used to retrieve a specific product by its id. If a product with the given id does not exist, a ProductNotFoundException is thrown.

<img width="1422" height="931" alt="Screenshot 2025-12-08 at 01 15 49" src="https://github.com/user-attachments/assets/ee2795ae-d959-40ec-80aa-6be5f988bd22" />

Update - PUT "{id}"
This endpoint retrieves an existing product and updates it. The updated product information is received as JSON from the request body.

<img width="1276" height="1007" alt="Screenshot 2025-12-08 at 01 16 29" src="https://github.com/user-attachments/assets/dda86180-3727-48a8-bb82-098b40077e1d" /> <img width="1275" height="520" alt="Screenshot 2025-12-08 at 01 16 54" src="https://github.com/user-attachments/assets/46ab81ce-949f-40d6-b2ed-11fce8bb938c" />

Get - GET "/"
Returns a list of all products stored in the database.

Delete - DELETE "/{id}"
Retrieves a specific product by id and deletes it from the database.

<img width="1275" height="520" alt="Screenshot 2025-12-08 at 01 16 54" src="https://github.com/user-attachments/assets/9e74611d-a249-4815-bf64-705b53f033df" />

Delete - DELETE "/{id}"
Deletes the specified product by id. If the product does not exist, a ProductNotFoundException is returned.

<img width="1273" height="562" alt="Screenshot 2025-12-08 at 01 17 12" src="https://github.com/user-attachments/assets/e9b42bbc-89f7-46d7-9f7d-4c7fdde645c5" /> <img width="1272" height="445" alt="Screenshot 2025-12-08 at 01 17 26" src="https://github.com/user-attachments/assets/d9d315ea-a8f6-48ed-b2c2-36b336509de0" />

❌ Exception Handling

If a product with the specified identifier is not found, the application throws a ProductNotFoundException.

<img width="1412" height="922" alt="Screenshot 2025-12-08 at 01 15 38" src="https://github.com/user-attachments/assets/16f24476-7858-4782-a828-659639298a03" />

📄 Example JSON Request Bodies

Create - POST

{
"name": "Example Product Name"
}

<img width="1421" height="306" alt="Screenshot 2025-12-08 at 01 14 52" src="https://github.com/user-attachments/assets/9a6ff7bd-67be-4a3a-b1cb-51ac583a42af" />

Update - PUT

{
"name": "New Product Name",
"id": productID
}

<img width="1276" height="1007" alt="Screenshot 2025-12-08 at 01 16 29" src="https://github.com/user-attachments/assets/dda86180-3727-48a8-bb82-098b40077e1d" /> <img width="1275" height="520" alt="Screenshot 2025-12-08 at 01 16 54" src="https://github.com/user-attachments/assets/46ab81ce-949f-40d6-b2ed-11fce8bb938c" />

How to Clone the Project

i) Clone the repository using the following command:

git clone https://github.com/Itsrauff/VistulaProject2