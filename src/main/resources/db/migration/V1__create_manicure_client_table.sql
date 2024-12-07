CREATE TABLE manicure_client (
    clt_id INT GENERATED ALWAYS AS IDENTITY,
    clt_name VARCHAR(255) NOT NULL,
    clt_surname VARCHAR(255) NOT NULL,
    clt_phone_number BIGINT NOT NULL,
    clt_email VARCHAR(255),
    clt_customer_review varchar(255),
    clt_amount_spent INT,
    clt_discount INT,
    PRIMARY KEY (clt_id)
);