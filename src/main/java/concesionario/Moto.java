package concesionario;

import java.text.DecimalFormat;

public class Moto extends Vehiculo implements Comparable<Vehiculo> {
    
    private int cilindros;

    //CONSTRUCTOR VACIO
    public Moto() {
    
    }
    
    // CONSTRUCTOR PARAMETRICO
    public Moto(int cilindros, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.cilindros = cilindros;
    }
    
    // SOBRE-ESCRITURA DEL toString 
    @Override
    public String toString() {
        return "Auto - Marca: " + super.getMarca() 
                + "// Modelo: " + super.getModelo() 
                + " Cilindros :" + cilindros 
                + " // Precio : $" + new DecimalFormat("###,###.00").format(super.getPrecio());
    }
    
    // SOBRE-ESCRITURA DEL compare PARA TENER EL MISMO CRITERIO DE ORDENAMIENTO DADO POR ORDEN NATURAL.
    @Override
    public String compare() {
       return "marca: " + super.getMarca() 
               + "// modelo: " + super.getModelo() 
               + " cilindros: " + new DecimalFormat("000").format(cilindros) 
               + "// precio : " + new DecimalFormat("000").format(super.getPrecio());            
    }
    
    // SETTERS
    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }
    
    // GETTERS
    public int getCilindros() {
        return cilindros;
    } 
}
