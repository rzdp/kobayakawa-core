CREATE TABLE product (
    id              BIGSERIAL       NOT NULL,
    category_id     BIGINT          NOT NULL,
    name            VARCHAR(128)    NOT NULL,
    description     TEXT            DEFAULT NULL,
    price           DECIMAL         NOT NULL,
    image_url       VARCHAR(2048)   NOT NULL,
    created_by      VARCHAR(128)    NOT NULL DEFAULT 'SYSTEM',
    created_date    TIMESTAMP       NOT NULL DEFAULT CURRENT_TIMESTAMP,
    modified_by     VARCHAR(128)    NOT NULL DEFAULT 'SYSTEM',
    modified_date   TIMESTAMP       NOT NULL DEFAULT CURRENT_TIMESTAMP,

    PRIMARY KEY (id),
    FOREIGN KEY (category_id) REFERENCES category (id),
    UNIQUE (name)
);