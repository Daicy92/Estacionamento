/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  mateu
 * Created: 6 de out. de 2022
 */

CREATE DATABASE IF NOT EXISTS estacionamento;
USE estacionamento;
CREATE TABLE vaga (
idVaga int NOT NULL AUTO_INCREMENT,
numero int NOT NULL,
rua VARCHAR(100) NOT NULL,
obliqua boolean NOT NULL,
PRIMARY KEY (idVaga));


CREATE TABLE motorista (
idMotorista int NOT NULL AUTO_INCREMENT,
nomeCompleto VARCHAR(50) NOT NULL,
genero VARCHAR(20) NOT NULL,
RG int NOT NULL,
CPF int NOT NULL,
celular int NOT NULL,
email VARCHAR(50) NOT NULL,
senha VARCHAR(50) NOT NULL,
PRIMARY KEY (idMotorista));