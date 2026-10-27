/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        // Crear lista
        ArrayList<Productos> productos = new ArrayList<>();

        // Colocar productos del entorno txt
        productos.add(new Productos(101, "Portátil", "Tecnología", 3200, 8));
        productos.add(new Productos(102, "Mouse", "Tecnología", 80, 25));
        productos.add(new Productos(103, "Teclado", "Tecnología", 120, 12));
        productos.add(new Productos(104, "Cuaderno", "Papelería", 15, 50));
        productos.add(new Productos(105, "Marcadores", "Papelería", 28, 30));
        productos.add(new Productos(106, "Impresora", "Tecnología", 950, 4));
        productos.add(new Productos(107, "Escritorio", "Muebles", 680, 6));
        productos.add(new Productos(108, "Silla", "Muebles", 450, 10));
        productos.add(new Productos(109, "Monitor", "Tecnología", 780, 9));
        productos.add(new Productos(110, "Disco SSD 1TB", "Tecnología", 350, 15));
        productos.add(new Productos(111, "Memoria USB 64GB", "Tecnología", 45, 40));
        productos.add(new Productos(112, "Router WiFi", "Tecnología", 220, 11));
        productos.add(new Productos(113, "Cable HDMI", "Tecnología", 35, 60));
        productos.add(new Productos(114, "Webcam", "Tecnología", 160, 13));
        productos.add(new Productos(115, "Audífonos", "Tecnología", 140, 20));
        productos.add(new Productos(116, "Micrófono", "Tecnología", 190, 7));
        productos.add(new Productos(117, "Calculadora Científica", "Papelería", 65, 18));
        productos.add(new Productos(118, "Resaltadores", "Papelería", 18, 35));
        productos.add(new Productos(119, "Carpeta", "Papelería", 12, 80));
        productos.add(new Productos(120, "Lápiz", "Papelería", 3, 200));
        productos.add(new Productos(121, "Bolígrafo", "Papelería", 5, 150));
        productos.add(new Productos(122, "Borrador", "Papelería", 2, 120));
        productos.add(new Productos(123, "Regla", "Papelería", 8, 45));
        productos.add(new Productos(124, "Archivador", "Papelería", 25, 20));
        productos.add(new Productos(125, "Mesa de Reuniones", "Muebles", 1500, 3));
        productos.add(new Productos(126, "Biblioteca", "Muebles", 1200, 5));
        productos.add(new Productos(127, "Archivador Metálico", "Muebles", 890, 4));
        productos.add(new Productos(128, "Sofá de Oficina", "Muebles", 2100, 2));
        productos.add(new Productos(129, "Lámpara de Escritorio", "Muebles", 95, 14));
        productos.add(new Productos(130, "Ventilador", "Electrodomésticos", 180, 8));
        productos.add(new Productos(131, "Cafetera", "Electrodomésticos", 320, 6));
        productos.add(new Productos(132, "Horno Microondas", "Electrodomésticos", 550, 4));
        productos.add(new Productos(133, "Nevera Ejecutiva", "Electrodomésticos", 980, 2));
        productos.add(new Productos(134, "Tablet", "Tecnología", 1300, 7));
        productos.add(new Productos(135, "Smartphone", "Tecnología", 2200, 5));

        // Punto 1
        int total = productos.size();                 
        double suma = 0;
        
        Productos masCostoso = productos.get(0);      
        Productos masBarato = productos.get(0);
        
        int stockBajo = 0;

        for (Productos p : productos) {
            suma += p.getPrecio();
            if (p.getPrecio() > masCostoso.getPrecio()) masCostoso = p;
            if (p.getPrecio() < masBarato.getPrecio()) masBarato = p;
            if (p.getStock() < 10) stockBajo++;
        }

        JOptionPane.showMessageDialog(null,"Punto 1: ");
        JOptionPane.showMessageDialog(null,"Total de productos: " + total );
        JOptionPane.showMessageDialog(null,"Precio promedio: " + (suma / total) );
        JOptionPane.showMessageDialog(null,"Producto mas costoso: " + masCostoso );
        JOptionPane.showMessageDialog(null,"Stock menor: " + stockBajo );
        
        
        // Punto 2
        // Listas nuevamente
        ArrayList<Productos> productosTecnologia = new ArrayList<>();
        ArrayList<Productos> productosEconomicos = new ArrayList<>();

        for (Productos p : productos) {
            if (p.getCategoria().equals("Tecnologia ")) productosTecnologia.add(p);
            if (p.getPrecio() < 200) productosEconomicos.add(p);
        }

        double valorTecnologia = 0;
        double valorEconomicos = 0;

        String textoTecnologia = "Productos de tecnologia: ";
        for (Productos p : productosTecnologia) {
            textoTecnologia += p + "\n";
            // Valor Inventario = precio × stock
            valorTecnologia += p.getPrecio()*p.getStock();
        }

        String textoEconomicos = "Productos economicos: ";
        for (Productos p : productosEconomicos) {
            textoEconomicos += p + "\n";
            valorEconomicos += p.getPrecio()*p.getStock();
        }
        
        //Mostrar resultados
        JOptionPane.showMessageDialog(null, "Punto 2: " + textoTecnologia);
        JOptionPane.showMessageDialog(null, "Valor inventario Tecnología: " + valorTecnologia);
        JOptionPane.showMessageDialog(null, "Punto 2: " + textoEconomicos);
        JOptionPane.showMessageDialog(null, "Valor inventario Económicos: " + valorEconomicos);
        
       
        // Punto 3
        int opcion;

        do {
            String entrada = JOptionPane.showInputDialog(
                    "1 Buscar producto por codigo\n"
                    + "2 Actualizar el precio\n"
                    + "3 Actualizar el stock\n"
                    + "4 Eliminar el producto\n"
                    + "5 Mostrar el inventario\n"
                    + "6 Mostrar los productos por categoría\n"
                    + "7 Salir");
            
            if (entrada == null) entrada = "7";       
            opcion = Integer.parseInt(entrada);       

            // ìndice o posiciòn
            int pos = -1;
            if (opcion >= 1 && opcion <= 4) {
                int codigo = Integer.parseInt(JOptionPane.showInputDialog("Còdigo del producto: "));
                for (int i = 0; i < productos.size(); i++) {
                    if (productos.get(i).getCodigo() == codigo) pos = i;
                }
                if (pos == -1) {
                    JOptionPane.showMessageDialog(null, "Producto no encontrado.");
                    continue;
                }
            }

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, productos.get(pos));   
                    break;
                    
                case 2:
                    double nuevoPrecio = Double.parseDouble(JOptionPane.showInputDialog("El nuevo precio: "));
                    productos.get(pos).setPrecio(nuevoPrecio);                 
                    JOptionPane.showMessageDialog(null, "El percio actualizado " + productos.get(pos));
                    break;
                    
                case 3:
                    int nuevoStock = Integer.parseInt(JOptionPane.showInputDialog("Nuevo stock: "));
                    productos.get(pos).setStock(nuevoStock);
                    JOptionPane.showMessageDialog(null, "El stock actualizado: " + productos.get(pos));
                    break;
                    
                case 4:
                    productos.remove(pos);                                     
                    JOptionPane.showMessageDialog(null, "El producto eliminado");
                    break;
                    
                case 5:
                    String inventario = "";
                    for (Productos p : productos) inventario += p + "\n";      
                    JOptionPane.showMessageDialog(null, inventario);
                    break;
                    
                case 6:
                    String categoria = JOptionPane.showInputDialog(
                            "Estas son las categorias: Tecnologia, Papeleria, Muebles y Electrodomesticos):");
                    String porCategoria = "";
                    for (Productos p : productos) {
                        if (p.getCategoria().equals(categoria)) porCategoria += p + "\n";
                    }
                    if (porCategoria.isEmpty()) porCategoria = "En esta categoria no hay productos";
                    JOptionPane.showMessageDialog(null, porCategoria);
                    break;
            }
        } while (opcion != 7);                                  
    }
}