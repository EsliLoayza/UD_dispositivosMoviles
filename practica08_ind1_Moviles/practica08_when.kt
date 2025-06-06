/*

Condicionales con `when` en un contexto diferente

    Esta vez, en lugar de clasificar edades o notas,
    vamos a simular un **sistema de control de tráfico 
    que indica qué hacer según el color de un semáforo.



    ##Semáforo Inteligente

    -Crear una función que reciba un color de semáforo
     y devuelva una acción correspondiente.

###Código Kotlin con `when`

*/

fun accionSegunSemaforo(color: String) {
    println("🚦 Color del semáforo: $color")

    when (color.lowercase()) {
        "rojo" -> println("🛑 Detente")
        "amarillo" -> println("⚠️  Prepárate para detenerte")
        "verde" -> println("✅ Avanza")
        else -> println("❓ Color no reconocido")
    }
}

fun main() {
    accionSegunSemaforo("Rojo")
    accionSegunSemaforo("Amarillo")
    accionSegunSemaforo("Verde")
    accionSegunSemaforo("Azul")
}

/*

###QUE HICISTE???

    - Cómo usar `when` con **valores de texto** (`String`).
    - Cómo manejar entradas no válidas con `else`.
    - Cómo hacer que el programa sea **insensible a 
    mayúsculas/minúsculas** usando `.lowercase()`.


--------##Ejercicio Propuesto: Selector de Día Laboral------------


Crea una función llamada `tipoDeDia(dia: String)` que 
use `when` para mostrar un mensaje según el día de la semana:

- Lunes a viernes → "📅 Día laboral"
- Sábado → "🎉 Fin de semana"
- Domingo → "😌 Día de descanso"
- Cualquier otro valor → "❌ Día no válido"

*/