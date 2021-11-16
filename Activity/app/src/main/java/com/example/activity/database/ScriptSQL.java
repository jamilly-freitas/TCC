package com.example.activity.database;

public class ScriptSQL {

    public static  String getCreateTableUsuario(){
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE Usuario (\n" +
                "    id   INTEGER      PRIMARY KEY AUTOINCREMENT\n" +
                "                      UNIQUE,\n" +
                "    nome STRING (255) NOT NULL\n" +
                ");");
        return sql.toString();
    }

    public static  String getCreateTablePropriedade(){
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE Propriedades (\n" +
                "                Id        INTEGER           PRIMARY KEY AUTOINCREMENT\n" +
                "                UNIQUE\n" +
                "                NOT NULL,\n" +
                "                nomePro   STRING (255)      NOT NULL,\n" +
                "                area      DOUBLE (10000, 2) NOT NULL,\n" +
                "                amazonia  BOOLEAN           NOT NULL,\n" +
                "                agua      BOOLEAN           NOT NULL,\n" +
                "                lagoNat   BOOLEAN           NOT NULL,\n" +
                "                lagoArt   BOOLEAN           NOT NULL,\n" +
                "                idUsuario INTEGER           REFERENCES Usuario (id)\n" +
                "                NOT NULL\n" +
                "        );");
        return sql.toString();
    }

    public static  String getCreateTableBioma(){
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE Bioma (\n" +
                "    id   INTEGER PRIMARY KEY AUTOINCREMENT\n" +
                "                 NOT NULL\n" +
                "                 UNIQUE,\n" +
                "    nome STRING  NOT NULL\n" +
                ");");
        return sql.toString();
    }

    public static  String getCreateTablePlantas(){
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE Plantas (\n" +
                "    id        INTEGER        PRIMARY KEY AUTOINCREMENT\n" +
                "                             UNIQUE\n" +
                "                             NOT NULL,\n" +
                "    nomeCie   STRING (255)   NOT NULL,\n" +
                "    nome      STRING (255)   NOT NULL,\n" +
                "    descricao STRING (10000) NOT NULL\n" +
                ");");
        return sql.toString();
    }

    public static  String getCreateTablePlanta_Bioma(){
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE Plantas_Bioma (\n" +
                "    idBioma   INTEGER NOT NULL\n" +
                "                      REFERENCES Bioma (id),\n" +
                "    idPlantas INTEGER NOT NULL\n" +
                "                      REFERENCES Plantas (id),\n" +
                "    PRIMARY KEY (\n" +
                "        idBioma,\n" +
                "        idPlantas\n" +
                "    )\n" +
                ");");
        return sql.toString();
    }

    public static  String getInsertIntoUsuario(){
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO Usuario (\n" +
                "    nome = ? \n" +
                ");");
        return sql.toString();
    }
}
