/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  mateu
 * Created: 6 de out. de 2022
 */

CREAT DATABASE IF NOT EXISTS estacionamento;
USE estacionamento;
CREATE TABLE vaga (
idVaga int NOT NULL ALTO_INCREMENT,
numero int NOT NULL,
rua VARCHAR(100) NOT NULL,
obliqua booleam NOT NULL,
PRIMARY KEY (idVaga));