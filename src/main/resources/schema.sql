CREATE SCHEMA IF NOT EXISTS inventory_schema;

CREATE TABLE IF NOT EXISTS inventory_schema.inventory(
    id bigserial,
    name character varying(255) ,
    brand character varying(255) ,
    price integer,
    quantity integer,
    CONSTRAINT inventory_pkey PRIMARY KEY (id)
)