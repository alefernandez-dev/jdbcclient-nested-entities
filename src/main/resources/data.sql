-- Insert sample data into category table
INSERT INTO category (id, name) VALUES
(1, 'Electronics'),
(2, 'Clothing'),
(3, 'Home'),
(4, 'Books'),
(5, 'Toys'),
(6, 'Sports'),
(7, 'Beauty'),
(8, 'Furniture'),
(9, 'Food'),
(10, 'Pets');

-- Insert sample data into product table
INSERT INTO product (id, name, price, category_id) VALUES
(1, 'TV', 499.99, 1),
(2, 'Shirt', 29.99, 2),
(3, 'Pan', 19.99, 3),
(4, 'Smartphone', 699.99, 1),
(5, 'Jeans', 39.99, 2),
(6, 'Bedding Set', 49.99, 3),
(7, 'Book: Harry Potter', 12.99, 4),
(8, 'Action Figure', 9.99, 5),
(9, 'Soccer Ball', 19.99, 6),
(10, 'Lipstick', 7.99, 7),
(11, 'Chair', 79.99, 8),
(12, 'Rice', 5.99, 9),
(13, 'Dog Food', 14.99, 10),
(14, 'Laptop', 899.99, 1),
(15, 'Dress', 49.99, 2);
