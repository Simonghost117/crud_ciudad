package com.sebas.ejempo.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class Constantes  {
    public static String NAME_BD ="ejemplobd";
    public static  int NUM_VERSION = 1;
    public static String SENTENCIA_TABLA = "create table Ciudad(codigo integer, nombre text)";
    public static String SENTENCIA_TABLA2 = "create table Departamento(codigo integer, nombre text)";
    public static String SENTENCIA_TABLA12 = "create table Historia Clinica(codigo integer, titulo text, contenido text)";


    public static String SENTENCIA_TABLA3 = "create table Usuario(codigo integer, nombre text, apellido text, edad integer)";

    public static String SENTENCIA_TABLA6 = "create table Paciente(idpaciente integer, nombre text, correo varchar, dirección varchar)";

    public static String SENTENCIA_TABLA7 = "create table Nota(codigo integer, titulo text)";
    public static String SENTENCIA_CUENTABANCARIA = "create table cuentaBancaria(id INT NOT NULL AUTO_INCREMENT, ingresos INT, egresos INT)";
    public static String SENTENCIA_TABLA10 = "create table Entidad(codigo integer, nombre text)";
    public static String SENTENCIA_TABLA5 = "create table Empresas(codigo interger, nombre text");
    public static String SENTENCIA_TABLA11 = "create table Cuidador(codigo integer, nombre text)";

}
