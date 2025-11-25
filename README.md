🖼 Online Art Exhibition Platform

A Java + JDBC based mini-project designed to simulate a virtual art exhibition environment.
It enables Admins, Artists, and Art Enthusiasts to collaborate on uploading, approving, and exploring digital artworks.

👥 Team Members

Archit Agnihotri

Ayush Singh

Prince Dwivedi

College Name-
Galgotias University – B.Tech

📌 Project Overview

The Online Art Exhibition Platform provides a virtual space where:

Artists upload artwork

Admins approve/reject submissions

Users/Enthusiasts explore galleries, exhibitions, and purchase artwork

This project demonstrates:

✔ Core Java
✔ Object-Oriented Programming
✔ JDBC (MySQL connectivity)
✔ DAO (Data Access Object) Pattern
✔ 3-Layer Architecture

🚀 Key Features:

==👨‍💼 Admin
Manage users

Approve / reject artworks

Manage exhibitions

System level configuration

🎨 Artist:

Upload artwork

Participate in exhibitions

Interact with users

👥 Art Enthusiast:

Explore galleries

Join exhibitions

Purchase artwork

Give feedback

🛠 Technology Stack
Layer	Technology
Language	Java (Core + JDBC)
Database	MySQL 8.0
Architecture	Model → DAO → Application
Tools	VS Code, MySQL Shell, GitHub

📁 Project Folder Structure:

OnlineArtExhibition/
│── lib/
│   └── mysql-connector-j-9.5.0.jar
│
│── src/
│   ├── app/
│   │   └── Main.java
│   ├── dao/
│   │   ├── DBConnection.java
│   │   ├── UserDAO.java
│   │   ├── ArtworkDAO.java
│   │   └── ExhibitionDAO.java
│   ├── model/
│   │   ├── User.java
│   │   ├── Artwork.java
│   │   └── Exhibition.java
│
│── database.sql
│── README.md
└── .gitignore

⚙️ How to Compile & Run
Compile:
javac -d out -cp "lib/mysql-connector-j-9.5.0.jar" src\dao\*.java src\model\*.java src\app\*.java

Run:
java -cp "out;lib/mysql-connector-j-9.5.0.jar" app.Main

🔗 GitHub Repository

👉 https://github.com/Archit56716/OnlineArtExhibition

