CREATE TABLE category (
    id              BIGSERIAL       NOT NULL,
    name            VARCHAR(20)     NOT NULL,
    created_by      VARCHAR(128)    NOT NULL DEFAULT 'SYSTEM',
    created_date    TIMESTAMP       NOT NULL DEFAULT CURRENT_TIMESTAMP,
    modified_by     VARCHAR(128)    NOT NULL DEFAULT 'SYSTEM',
    modified_date   TIMESTAMP       NOT NULL DEFAULT CURRENT_TIMESTAMP,

    PRIMARY KEY (id),
    UNIQUE (name)
);