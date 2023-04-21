CREATE TABLE Customer (
  Cust_id VARCHAR(5) NOT NULL,
  Fname VARCHAR(20) NOT NULL,
  Lname VARCHAR(20) NOT NULL,
  Area VARCHAR(20),
  Phone VARCHAR(10),
  PRIMARY KEY (Cust_id)
);

INSERT INTO Customer (Cust_id, Fname, Lname, Area, Phone)
VALUES 
  ('A01', 'Ivan', 'Ross', 'SA', '6125467'),
  ('A02', 'Vandana', 'Ray', 'MU', '5560379'),
  ('A03', 'Pramada', 'Jauguste', 'DA', '4560389'),
  ('A04', 'Basu', 'Navindi', 'BA', '6125401'),
  ('A05', 'Ravi', 'Shridhar', 'NA', NULL),
  ('A06', 'Rukmini', 'Aiyer', 'GH', '5125274');

CREATE TABLE Movie (
  Mv_no INT NOT NULL,
  Cust_id VARCHAR(5),
  Title VARCHAR(20) NOT NULL,
  Star VARCHAR(5) NOT NULL,
  Price DECIMAL(6,2) NOT NULL,
  PRIMARY KEY (Mv_no),
  FOREIGN KEY (Cust_id) REFERENCES Customer(Cust_id)
);

INSERT INTO Movie (Mv_no, Cust_id, Title, Star, Price)
VALUES
  (1, 'A01', 'Pretty Woman', 'RG', 151),
  (2, 'A02', 'Bloody JC', '181', 100),
  (3, 'A01', 'Coma', 'MD', 100),
  (4, 'A06', 'Home Alone', 'MC', 150),
  (5, 'A05', 'The Fugitive', 'MF', 200),
  (6, 'A03', 'Gone with the Wind', 'CB', 200),
  (7, 'A02', 'Dracula', 'GO', 150),
  (8, 'A06', 'Quick Change', 'BM', 100),
  (9, 'A03', 'The Firm', 'TC', 200),
  (10, 'A05', 'Carry on Doctor', 'LP', 100);

-- 5
SELECT Title FROM Movie WHERE Price > 100 AND Price < 200;

-- 6
SELECT Cust_id FROM Customer WHERE Mv_no IN 
(SELECT Mv_no FROM Movie WHERE Star IN ('JC', 'TC', 'MC'));

-- 7
SELECT * FROM Customer WHERE Area LIKE '%A%';

-- 8
SELECT Title FROM Movie WHERE Price = 180 AND CHAR_LENGTH(Title) = 6;

-- 9
SELECT Title, Price, Price*1.1 AS Incremented_Price FROM Movie;

-- 10
SELECT CONCAT(Fname, ' ', Lname, ' stays in ', Area, ' and his phone number is ', Phone, '.') AS Customer_Details FROM Customer;

-- 11
ALTER TABLE Customer MODIFY Lname VARCHAR(255) NOT NULL;

-- 12
SELECT CONCAT(Fname, ' ', Lname) AS Customer_Name FROM Customer WHERE Phone IS NULL;

-- 13
UPDATE Customer SET Phone = '1234567' WHERE Fname = 'Ravi' AND Lname = 'Shridhar';

-- 14
SELECT DISTINCT Cust_id FROM Customer JOIN Movie ON Customer.Cust_id = Movie.Cust_id;

-- 15
ALTER TABLE Movie MODIFY Star VARCHAR(255);

-- 16
DELETE FROM Customer WHERE Cust_id = 1;

-- 17
DELETE FROM Movie WHERE Mv_no = 1;

-- 18
DROP TABLE IF EXISTS Customer;

-- 19
DROP TABLE IF EXISTS Movie;

-- 20
ALTER TABLE Movie DROP FOREIGN KEY Cust_id;

