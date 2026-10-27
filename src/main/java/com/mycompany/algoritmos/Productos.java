/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmos;

/**
 *
 * @author Paula Ximena Vesga Paez
 */
public class Productos {
    
    private int codigo;
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

    public Productos(int codigo, String nombre, String categoria, double precio, int stock){
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }
    
    public int getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCategoria(){
        return categoria;
    }

    public double getPrecio(){
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setStock(int stock){
        this.stock = stock;
    }
    
        public String toString(){
        return codigo + " " + nombre + " " + categoria + "$" + precio + "Stock: " + stock;
    }
}