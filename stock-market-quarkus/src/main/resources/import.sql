-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- Users
INSERT INTO users (username, email, password, role) VALUES ('admin', 'admin@example.com', 'hashedpassword', 'ADMIN');
INSERT INTO users (username, email, password, role) VALUES ('user', 'user@example.com', 'hashedpassword', 'USER');

-- Market Data
INSERT INTO market_data (company, month, open, high, low, close, volume) VALUES ('IBM', 'January', 150.00, 155.00, 149.00, 153.00, 2000000);
INSERT INTO market_data (company, month, open, high, low, close, volume) VALUES ('Microsoft', 'January', 200.00, 210.00, 195.00, 205.00, 3000000);
