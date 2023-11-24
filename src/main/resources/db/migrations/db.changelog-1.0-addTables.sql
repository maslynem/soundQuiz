--liquibase formatted sql

--changeset maslynem:1

CREATE TABLE IF NOT EXISTS topic_ru
(
    id            BIGSERIAL PRIMARY KEY,
    name          TEXT UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS transport_ru
(
    id            BIGSERIAL PRIMARY KEY,
    word          TEXT UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS nature_ru
(
    id            BIGSERIAL PRIMARY KEY,
    word          TEXT UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS profession_ru
(
    id            BIGSERIAL PRIMARY KEY,
    word          TEXT UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS sport_ru
(
    id            BIGSERIAL PRIMARY KEY,
    word          TEXT UNIQUE NOT NULL
);
