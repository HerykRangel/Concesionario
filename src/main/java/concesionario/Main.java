package concesionario;

public class Main {
    
    public static void main (String[] args){
        
        ColeccionVehiculo cv = new ColeccionVehiculo();
        
        cv.agregar(new Auto(4, "Peugeot", "206", 200000));
        cv.agregar(new Moto(125,"Honda", "Titan", 60000));
        cv.agregar(new Moto(145,"Honda", "Titan 2", 70000));
        cv.agregar(new Auto(5, "Peugeot", "208", 250000));
        cv.agregar(new Moto(160, "Yamaha", "YBR", 805000));
        
        cv.getLista().forEach(System.out::println);
        
        System.out.println("\n============================\n");
        System.out.println("Vehiculos mas caros: ");
        cv.getMayorPrecio().forEach(v -> System.out.println(v.getMarca()+" "+v.getModelo()));
        
        System.out.println("Vehiculos mas baratos: ");
        cv.getMenorPrecio().forEach(v -> System.out.println(v.getMarca()+" "+v.getModelo()));
        
        System.out.println("\n============================\n");
        System.out.println("Vehiculos que contiene en el modelo la letra 'Y': ");
        cv.getModeloContiene("y").forEach(v -> System.out.println(v.getMarca()+" "+v.getModelo()));
        
        System.out.println("\n============================\n");
        System.out.println("Vehiculos ordenados por precio de mayor a menor: ");
        cv.getListaOrdenadaPorPrecio().forEach(v -> System.out.println(v.getMarca()+" "+v.getModelo()+" "+v.getPrecio()));
    
        System.out.println("\n============================\n");
        System.out.println("Vehiculos ordenados por orden natural: ");
        cv.getListaOrdenada().forEach(System.out::println);
    
    }  
}
