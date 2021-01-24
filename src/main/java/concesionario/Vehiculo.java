package concesionario;

// CLASE PADRE 
public abstract class Vehiculo implements Comparable<Vehiculo>{
    
    // ATRIBUTOS
    private String marca;
    private String modelo;
    private double precio;

    // CONSTRUCTOR VACIO 
    public Vehiculo() {
    }
    
    // CONSTRUCTOR PARAMETRICO
    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    // SOBRE-ESCRITURA DEL "hashCode()" Y "equals" YA QUE, SE DESEA CONSDIERAR QUE DOS OBJETOS CON EL MISMO ESTADO SEAN DEL MISMO ESTADO.
    @Override
    public int hashCode(){
        return toString().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Vehiculo)) return false;
        return this.hashCode()==obj.hashCode();
    }
    
    // EL METODO "compare" ES "ABSTRACTO" PORQUE VA A IMPLIMENTARSE EN LAS CLASES HIJAS.
    public abstract String compare();

    @Override
    public int compareTo(Vehiculo t) {                              
        return this.compare().compareTo(t.compare());
    }
    
    // GETTERS
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    // SETTERS
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
