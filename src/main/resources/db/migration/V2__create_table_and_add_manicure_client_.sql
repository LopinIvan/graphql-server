CREATE TABLE IF NOT EXISTS manicure_client (
    clt_id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    clt_name VARCHAR(255) NOT NULL ,
    clt_surname VARCHAR(255) NOT NULL ,
    clt_phone_number VARCHAR(255) NOT NULL UNIQUE,
    clt_email VARCHAR(255),
    clt_customer_review VARCHAR(255),
    clt_amount_spent INT,
    clt_discount INT
);
--------------------
INSERT INTO manicure_client (clt_name, clt_surname, clt_phone_number, clt_email,
                             clt_customer_review, clt_amount_spent, clt_discount)
VALUES ('Анн', 'Кузнецов', '85554447777', 'ketsova@example.com',
        'Очень ответственная', 2000, 20)
ON CONFLICT (clt_phone_number) DO NOTHING;
--------------------
INSERT INTO manicure_client (clt_name, clt_surname, clt_phone_number, clt_email,
                             clt_customer_review, clt_amount_spent, clt_discount)
VALUES ('Анна', 'Кузнецова', '85558887777', 'kuznetsova@example.com',
        'Очень ответственная и пунктуальная', 2000, 20)
ON CONFLICT (clt_phone_number) DO NOTHING;
--------------------
INSERT INTO manicure_client (clt_name, clt_surname, clt_phone_number, clt_email,
                             clt_customer_review, clt_amount_spent, clt_discount)
VALUES ('Иван', 'Иванов', '89999999996', 'ivanov@example.com',
        'Всегда доволен обслуживанием', 1500, 10)
ON CONFLICT (clt_phone_number) DO NOTHING;
--------------------
INSERT INTO manicure_client (clt_name, clt_surname, clt_phone_number, clt_email,
                             clt_customer_review, clt_amount_spent, clt_discount)
VALUES ('Мария', 'Смирнова', '87776665544', 'smirnova@example.com',
        'Очень внимательная к деталям', 3000, 25)
ON CONFLICT (clt_phone_number) DO NOTHING;
--------------------
INSERT INTO manicure_client (clt_name, clt_surname, clt_phone_number, clt_email,
                             clt_customer_review, clt_amount_spent, clt_discount)
VALUES ('Дмитрий', 'Петров', '81112223344', 'petrov@example.com',
        'Рекомендует нас друзьям', 2500, 15)
ON CONFLICT (clt_phone_number) DO NOTHING;
--------------------
INSERT INTO manicure_client (clt_name, clt_surname, clt_phone_number, clt_email,
                             clt_customer_review, clt_amount_spent, clt_discount)
VALUES ('Антон', 'Смайлов', '89992223344', 'smile@example.com',
        'Рекомендует', 25070, 12)
ON CONFLICT (clt_phone_number) DO NOTHING;
--------------------