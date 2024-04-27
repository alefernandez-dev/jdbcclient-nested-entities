-- Create category table
CREATE TABLE category (
    id INT PRIMARY KEY,
    name VARCHAR(100)
);

-- Create product table
CREATE TABLE product (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    price DECIMAL(10, 2),
    category_id INT,
    FOREIGN KEY (category_id) REFERENCES category(id)
);
