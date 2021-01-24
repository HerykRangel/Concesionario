package concesionario;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ColeccionVehiculo {
    
    private List<Vehiculo> lista;
    
    // CONSTRUCTOR DE LA COLECCION
    public ColeccionVehiculo(){
        lista = new ArrayList();
    }
    
    // AGREGA UN ELEMENTO A LA LISTA
    public void agregar (Vehiculo vehiculo){
        lista.add(vehiculo);
    }
    
    //ELIMINA UN ELEMENTO DE LA LISTA
    public void eliminar (Vehiculo vehiculo){
        lista.remove(vehiculo);
    }
    
    //OBTIENE UNA LISTA DE VEHICULOS CUYA MARCA CONTIENE UN CARACTER ESPECIFICO
    public List<Vehiculo>getMarcaContiene(String marca){
        return lista
                .stream()
                .filter(v -> v.getMarca()
                .toLowerCase()
                .contains(marca.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    //OBTIENE UNA LISTA DE VEHICULOS CUYO MODELO CONTIENE UN CARACTER ESPECIFICO 
    public List<Vehiculo>getModeloContiene(String modelo){
        return lista
                .stream()
                .filter(v -> v.getModelo()
                .toLowerCase()
                .contains(modelo.toLowerCase()))
                .collect(Collectors.toList());
    }
   
    //OBTIENE UNA LISTA DE VEHICULOS CON EL MAYOR PRECIO
    public List<Vehiculo>getMayorPrecio(){
        // SE OBTIENE EL VALOR DEL PRECIO MAXIMO
        double precioMax =
            lista
                .stream()
                .max(Comparator.comparingDouble(Vehiculo::getPrecio))
                .get()
                .getPrecio();
        
        // SE RETORNA LA LISTA DE VEHICULOS CUYOS PRECIOS SEAN IGUAL AL PRECIO MAYOR
        return lista
                .stream()
                .filter(v -> v.getPrecio()== precioMax)
                .collect(Collectors.toList());
    }
    
    //OBTIENE UNA LISTA DE VEHICULOS CON EL MENOR PRECIO
    public List<Vehiculo>getMenorPrecio(){
        // SE OBTIENE EL VALOR DEL PRECIO MINIMO
        double precioMin =
            lista
                .stream()
                .min(Comparator.comparingDouble(Vehiculo::getPrecio))
                .get()
                .getPrecio();
        
        // SE RETORNA LA LISTA DE VEHICULOS CUYOS PRECIOS SEAN IGUAL AL PRECIO MINIMO
        return lista
                .stream()
                .filter(v -> v.getPrecio()== precioMin)
                .collect(Collectors.toList());
    }
    
    // LISTA ORDENADA POR ORDEN NATURAL, SEGUN EL METODO Comparable DE LA CLASE EN CUESTION (MOTO O AUTO)
    public List<Vehiculo> getListaOrdenada(){
        return lista
                .stream()
                .sorted()
                .collect(Collectors.toList());
    }
    
    // LISTA ORDENADA POR PRECIO DE MAYOR A MENOR (DESCENDENTE), LUEGO POR MARCA Y MODELO.
    public List<Vehiculo> getListaOrdenadaPorPrecio(){
        return lista
                .stream()
                .sorted(Comparator.comparing(Vehiculo::getPrecio).reversed()
                .thenComparing(Vehiculo::getMarca)
                .thenComparing(Vehiculo :: getModelo))
                .collect(Collectors.toList());
    }
    
    // SETTERS
    public void setLista(List<Vehiculo> lista) {
        this.lista = lista;
    }

    // GETTERS
    public List<Vehiculo> getLista() {
        return lista;
    }    
}
