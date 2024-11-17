CREATE TABLE if not exists master (
    id SERIAL,
    text varchar(250),
    PRIMARY KEY (id)
);

CREATE TABLE if not exists detail (
    id integer,
    PRIMARY KEY (id)
);