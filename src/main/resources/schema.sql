create table if not exists product(
    productId INT PRIMARY KEY AUTO_INCREMENT,
    productName varchar(200),
    price double
);

create table if not exists review(
    reviewId INT PRIMARY KEY AUTO_INCREMENT,
    reviewContent varchar(200),
    rating INT,
    productId INT,
    FOREIGN KEY (productId) references product(productId)
);