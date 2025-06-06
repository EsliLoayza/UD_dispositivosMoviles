/* 
----------------- Nulabilidad en Kotlin-------------

En Kotlin, las variables pueden ser **no nulas** o **nulas**. 
Por defecto, **todas las variables son no nulas**, lo que significa
que **no pueden contener `null`** a menos que se indique
explícitamente.

### 🔒 Variable no nula
*/

var nombre: String = "Lucía"
nombre = null // ❌ Error de compilación


//### ✅ Variable que puede ser nula

var nombres: String? = "Lucía"
nombres = null // ✔️ Válido

/* 
Para acceder a una variable que puede ser nula, usamos:

    - Elvis operator (`?:`)** para dar un valor por defecto.
    - Safe call (`?.`)** para evitar errores si es null.
    - Operador de aserción (`!!`)** si estás seguro de que
      no es null (¡peligroso si te equivocas!).



------EJERCICIO PROPUESTO Código con Errores: Detecta y Corrige---

Aquí tienes un código con errores relacionados con nulabilidad.
Debes leerlo, detectar los errores y corregirlos.
*/

fun imprimirLongitud(texto: String) {
    println("La longitud del texto es: ${texto.length}")
}

fun main() {
    var mensajito: String? = null

    imprimirLongitud(mensajito) // ❌ ¿Qué problema hay aquí?

    mensajito = "Hola Kotlin"
    println("Primera letra: ${mensajito[0]}") // ❌ ¿Y aquí?
}

/* 
### 🧠 ¿Qué debe detectar ????

1. Que `mensaje` es nullable (`String?`), pero se está pasando
   a una función que espera un `String` no nulo.
2. Que se accede directamente a `mensaje[0]` sin verificar
   si es `null`.



-Corrige el código anterior. Puedes usar:

 - `if (mensaje != null)`
 - `mensaje?.length`
 - `mensaje ?: "Texto por defecto"`
 - O crear una versión segura de la función `imprimirLongitud`.

