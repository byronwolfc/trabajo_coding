package com.talento.java.proyecto9;

public class Project {
String nombre;
String descripcion;
public String elevatorPitch() {
	return nombre +" : "+ descripcion;
}
public Project() {
}
public Project(String nombre) {
	this.nombre = nombre;
}
public Project(String nombre, String descripcion) {
	this.nombre = nombre;
	this.descripcion = descripcion;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

}
