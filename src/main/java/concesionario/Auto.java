package concesionario;

import java.text.DecimalFormat;


public class Auto extends Vehiculo implements Comparable<Vehiculo> {
    
    private int puertas;

    // CONSTRUCTOR VACIO
    public Auto() {
        
    }

    // CONSTRUCTOR PARAMETRICO
    public Auto(int puertas, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    // SOBRE-ESCRITURA DEL toString 
    @Override
    public String toString() {
        return "Auto - Marca: " + super.getMarca() 
                + "// Modelo: " + super.getModelo() 
                + " Puertas : " + puertas
                + " // Precio: $" + new DecimalFormat("###,###.00").format(super.getPrecio());
    }
    
    // SOBRE-ESCRITURA DEL compare PARA TENER EL MISMO CRITERIO DE ORDENAMIENTO DADO POR ORDEN NATURAL.
    @Override
    public String compare() {
       return "marca: " + super.getMarca() 
               + "// modelo: " + super.getModelo() 
               + " puertas: " + new DecimalFormat("000").format(puertas) 
               + "// precio: " + new DecimalFormat("000").format(super.getPrecio());            
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    } 
}
