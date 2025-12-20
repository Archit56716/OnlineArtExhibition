CREATE DATABASE IF NOT EXISTS online_art_exhibition;
USE online_art_exhibition;

CREATE TABLE IF NOT EXISTS users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    password VARCHAR(255),
    role ENUM('admin', 'artist', 'enthusiast') DEFAULT 'enthusiast'
);

CREATE TABLE IF NOT EXISTS artworks (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(150) NOT NULL,
    description TEXT,
    image_url VARCHAR(255),
    artist_id INT,
    price DECIMAL(10,2),
    approved BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (artist_id) REFERENCES users(id) ON DELETE SET NULL
);

CREATE TABLE IF NOT EXISTS exhibitions (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(150) NOT NULL,
    description TEXT,
    start_date DATE,
    end_date DATE,
    published BOOLEAN DEFAULT FALSE
);

CREATE TABLE IF NOT EXISTS exhibition_artworks (
    exhibition_id INT,
    artwork_id INT,
    PRIMARY KEY (exhibition_id, artwork_id),
    FOREIGN KEY (exhibition_id) REFERENCES exhibitions(id) ON DELETE CASCADE,
    FOREIGN KEY (artwork_id) REFERENCES artworks(id) ON DELETE CASCADE
);
