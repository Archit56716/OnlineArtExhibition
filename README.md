🖼 Online Art Exhibition Platform

A Java + JDBC based mini-project designed to simulate a virtual art exhibition environment.
It enables Admins, Artists, and Art Enthusiasts to collaborate on uploading, approving, and exploring digital artworks.

👥 Team Members

Archit Agnihotri

Ayush Singh

Prince Dwivedi

College Name-
Galgotias University – B.Tech

# Online Art Exhibition – Java Web Application

## 📌 Project Overview
The Online Art Exhibition is a Java-based web application that allows users to register, manage artworks, and participate in exhibitions. The project demonstrates core Java web development concepts including Servlets, JSP, JDBC, and MVC architecture.

## 🛠 Technologies Used
- Java 17
- Apache Tomcat 10.1
- MySQL 8
- JDBC
- Maven
- JSP & Servlets (Jakarta EE)

## 📂 Project Structure
src/main/java/
├── dao/ # Database access layer
├── model/ # Entity classes
├── servlet/ # Controllers
src/main/webapp/
├── WEB-INF/
├── signup.jsp
└── index.jsp


## ⚙️ Setup Instructions
1. Install Java 17 and Apache Tomcat 10.
2. Create MySQL database using `database.sql`.
3. Update DB credentials in `DBConnection.java`.
4. Build the project:
5. Deploy `OnlineArtExhibition.war` to Tomcat `webapps` folder.
6. Start Tomcat and open:
http://localhost:8080/OnlineArtExhibition


## 🚀 Core Features
- User Registration with validation
- Duplicate email prevention
- MySQL database integration
- MVC architecture
- Robust error handling

## 🛡 Data Validation & Security
- Server-side validation using Servlets
- SQL Injection prevention using PreparedStatements
- Input validation on forms

## 🎯 Learning Outcomes
- Java Web Development using MVC
- JDBC and database connectivity
- Servlet lifecycle and request handling
- Clean code and modular design

## 👤 Author
**Archit Agnihotri**  
B.Tech CSE  

