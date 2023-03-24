package com.guzman.departamentos;

public class Subdireccion extends Direccion{
 String tipo;
 int numSubareas;

 public Subdireccion() {
 }

 public Subdireccion(String tipo, int numSubareas) {
  this.tipo = tipo;
  this.numSubareas = numSubareas;
 }

 public String getTipo() {
  return tipo;
 }

 public void setTipo(String tipo) {
  this.tipo = tipo;
 }

 public int getNumSubareas() {
  return numSubareas;
 }

 public void setNumSubareas(int numSubareas) {
  this.numSubareas = numSubareas;
 }
}

