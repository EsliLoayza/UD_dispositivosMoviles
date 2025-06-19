
// Archivo: EjerciciosFuncionesLambdas.kt

fun main() {

    // Ejercicio 1: Función como tipo de dato
    // Creamos una lambda sin parámetros que imprime un saludo
    val sayHello: () -> Unit = { println("Hola desde Kotlin!") }
    sayHello() // Llamamos a la función

    // Ejercicio 2: Función con retorno
    // Lambda que retorna el año actual
    val getYear: () -> Int = { 2025 }
    println("Año actual: ${getYear()}") // Imprimimos el resultado

    // Ejercicio 3: Función con parámetros
    // Lambda que calcula el cuadrado de un número
    val square: (Int) -> Int = { it * it }
    println("El cuadrado de 4 es: ${square(4)}")

    // Ejercicio 4: Función que retorna otra función
    // Función que selecciona una operación según el parámetro
    fun operationSelector(op: String): (Int, Int) -> Int {
        return when (op) {
            "suma" -> { a, b -> a + b }
            "resta" -> { a, b -> a - b }
            else -> { a, b -> 0 }
        }
    }
    val suma = operationSelector("suma")
    println("Resultado de suma: ${suma(3, 2)}")

    // Ejercicio 5: Función como parámetro
    // Función que aplica una operación a dos números
    fun applyOperation(a: Int, b: Int, op: (Int, Int) -> Int): Int {
        return op(a, b)
    }
    val multiplicacion = applyOperation(4, 5) { x, y -> x * y }
    println("Multiplicación: $multiplicacion")

    // Ejercicio 6: Función anulable
    // Variable que puede contener una función o ser null
    val optionalMessage: (() -> String)? = { "Mensaje opcional" }
    // Verificamos si no es null y la llamamos
    optionalMessage?.let { println(it()) }

    // Ejercicio 7: Lambda con `it`
    // Lambda que duplica un número usando `it`
    val doubleIt: (Int) -> Int = { it * 2 }
    println("El doble de 6 es: ${doubleIt(6)}")

    // Ejercicio 8: Lambda inline
    // Usamos repeat con una lambda directamente
    repeat(2) {
        println("¡Repetido!")
    }

    // Ejercicio 9: Lambda como último parámetro
    // Función que recibe un mensaje y una acción
    fun runWithMessage(message: String, action: () -> Unit) {
        println("Mensaje: $message")
        action()
    }
    runWithMessage("Ejecutando acción") {
        println("¡Acción ejecutada!")
    }

    // Ejercicio 10: Combinación de conceptos
    // Función que aplica un formateador a un nombre
    fun customGreeting(name: String, formatter: (String) -> String) {
        println(formatter(name))
    }
    customGreeting("Carlos") { "Hola, $it!" }
}
