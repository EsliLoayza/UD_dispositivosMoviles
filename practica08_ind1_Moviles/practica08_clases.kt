/******************************************************
-----------------------SISTEMA DE PERSONAJES--------------

### OBJETIVO
Crear una clase `Personaje` con propiedades y métodos que
simulen una interacción entre personajes de un videojuego.

### CÓDIGO
*/

// Definimos la clase Personaje
class Personaje(val nombre: String, var vida: Int) {

    // Método para atacar a otro personaje
    fun atacar(objetivo: Personaje) {
        println("$nombre ataca a ${objetivo.nombre} y le quita 10 puntos de vida.")
        objetivo.vida -= 10
    }

    // Método para mostrar el estado actual del personaje
    fun mostrarEstado() {
        println("🧍 $nombre tiene $vida puntos de vida.")
    }
}

// Función principal donde se crean los objetos y se simula la interacción
fun main() {
    // Creamos dos personajes
    val mago = Personaje("Merlín", 100)
    val guerrero = Personaje("Arthas", 120)

    // Mostramos su estado inicial
    println("🔰 Estado inicial:")
    mago.mostrarEstado()
    guerrero.mostrarEstado()

    // El mago ataca al guerrero
    println("\n⚔️ Acción:")
    mago.atacar(guerrero)

    // Mostramos el estado después del ataque
    println("\n📊 Estado después del ataque:")
    mago.mostrarEstado()
    guerrero.mostrarEstado()
}
/* QUE HICISTE???

- Cómo se define una clase: con propiedades (`nombre`, `vida`) y métodos (`atacar`, `mostrarEstado`).
- Cómo se crean objetos: a partir de esa clase (`val mago = Personaje(...)`).
- Cómo interactúan los objetos entre sí: modificando su estado interno.
- Cómo se imprime información útil para visualizar el comportamiento del programa.


# 📝 EJERCICIO PROPUESTO E INSTRUCCIONES
    -Crea una clase llamada Mascota
     que tenga las siguientes propiedades:

        nombre (String)
        tipo (String) — por ejemplo: "perro", "gato"
        energia (Int)

    -Y los siguientes métodos:

        jugar() → reduce la energía en 20 unidades.
        comer() → aumenta la energía en 30 unidades.
        estado() → imprime el nombre, tipo y energía actual.

    Actividad
    -En la función main, realiza lo siguiente:

        Crea dos mascotas diferentes.
        Haz que una de ellas juegue dos veces y coma una vez.
        Muestra su estado final.

    ###PISTA 1 - COMO PUEDE IR LA CLASE 
        
    class Mascota(val nombre: String, val tipo: String, var energia: Int) {
    // Aquí irán los métodos como jugar(), comer() y estado()
    }

    ###PISTA 2 - EJEMPLO DE UN METODO
    
    fun jugar() {
    energia -= 20
    println("$nombre está jugando. Energía actual: $energia")
    }


*/