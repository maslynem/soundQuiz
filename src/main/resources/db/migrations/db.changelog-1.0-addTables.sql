--liquibase formatted sql

--changeset maslynem:1
CREATE TABLE IF NOT EXISTS topic
(
    id            BIGSERIAL PRIMARY KEY,
    name          TEXT UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS transport
(
    id            BIGSERIAL PRIMARY KEY,
    name          TEXT UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS nature
(
    id            BIGSERIAL PRIMARY KEY,
    name          TEXT UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS profession
(
    id            BIGSERIAL PRIMARY KEY,
    name          TEXT UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS sport
(
    id            BIGSERIAL PRIMARY KEY,
    name          TEXT UNIQUE NOT NULL
);
