# Concesionario
El siguiente proyecto está orientado a una concesionaria de autos y motos donde el punto de entrada es un “main” el cual, a ejecutarse se visualiza por consola diferentes búsquedas especificas tales como vehículo más caro, vehículo más barato, vehículos que contienen una letra especifica dentro de su modelo, vehículos ordenados por precio de forma creciente o decreciente según su precio, entre otras. Para ello y como base fundamental de este proyecto, se manipula la colección creada a partir de secuencias de elementos que soportan operaciones de agregación secuencial y paralela (Interfaz Stream)

Se posee una clase padre llamada “Vehículo” la cual implementa la interfaz “Comparable <Vehiculo>” donde se definen los atributos en común a heredar. Se realiza la sobre-escritura de los métodos “hashCode()” y “equals()” definiendo la igualdad de dos objetos con el mismo estado y la definición de un método abstracto “compare()” el cual será implementado por sus clases hijas.

Se posee dos clases hijas llamadas “Auto” y “Moto” que extienden de la clase padre “Vehículo” y que implementan la interfaz “Comparable <Vehiculo>”, en ellas se definen los atributos particulares de cada clase (Puertas - Cilindros), se sobre-escribe el método “toString” y el método abstracto de la clase padre “compare()” con el objetivo de tener el mismo criterio de ordenamiento.

La clase denominada “ColeccionVehiculos” define en su constructor un “ArrayList” y como métodos todas las acciones y consultas a realizar sobre la colección a partir de su transformación a un “stream” accediendo a sus métodos estándares de consulta tales como “filter()”, “max()”, “min()”, “sorted()”, entre otros.

En el main se define la colección y se agregan todos los elementos a recorrer mediante el método “agregar” definido en la clase “ColeccionVehiculos” y se realizan las consultas especificas dado los métodos creados en la mencionada clase y recorriendo la colección mediante un bucle “foreach()”. 


Heryk Rangel

