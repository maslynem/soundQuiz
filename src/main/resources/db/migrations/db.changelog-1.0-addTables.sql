--liquibase formatted sql

--changeset maslynem:1

CREATE TABLE IF NOT EXISTS transport
(
    id            BIGSERIAL PRIMARY KEY,
    word          TEXT UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS nature
(
    id            BIGSERIAL PRIMARY KEY,
    word          TEXT UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS profession
(
    id            BIGSERIAL PRIMARY KEY,
    word          TEXT UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS sport
(
    id            BIGSERIAL PRIMARY KEY,
    word          TEXT UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS damir
(
    id            BIGSERIAL PRIMARY KEY,
    word          TEXT UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS item
(
    id            BIGSERIAL PRIMARY KEY,
    word          TEXT UNIQUE NOT NULL
);
