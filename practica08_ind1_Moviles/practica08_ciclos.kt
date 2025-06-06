/* 

## 🧠  Ciclos `for` en Kotlin

    Un ciclo `for` se usa cuando queremos
    repetir una acción varias veces, especialmente 
    cuando sabemos cuántas veces queremos hacerlo.

### Analogía

    Imagina que tienes una lista de tareas y quieres
    leerlas una por una. En lugar de escribir:


    println(tarea1)
    println(tarea2)
    println(tarea3)

    Usas un ciclo `for` para recorrerlas automáticamente.

 ###Sintaxis básica


for (i in 1..5) {
    println("Repetición número $i")
}
```

Esto imprimirá 5 veces el mensaje, con el número de repetición.

También puedes recorrer listas:

val frutas = listOf("Manzana", "Banana", "Naranja")
for (fruta in frutas) {
    println("Me gusta la $fruta")
}

-----------------Contador de pasos-----------------------------

Vamos a simular que un personaje da pasos y los contamos uno por uno.

*/

fun main() {
    println("🚶 Iniciando caminata...")

    for (paso in 1..5) {
        println("Paso número $paso")
    }

    println("✅ Caminata completada.")
}

/* QUÉ HICISTE?

- Cómo usar `for` con rangos (`1..5`)
- Cómo repetir acciones de forma controlada
- Cómo recorrer listas o secuencias



## Ejercicio Propuesto: Lista de compras

Crea un programa que:

    1. Tenga una lista de compras con al menos 5 productos.
    2. Use un ciclo `for` para imprimir cada producto con el mensaje:  
   `"🛒 Tienes que comprar: <producto>"`

*/