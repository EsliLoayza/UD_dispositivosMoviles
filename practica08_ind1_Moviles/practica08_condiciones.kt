/* 

Condicionales en Kotlin

En la vida diaria tomamos decisiones todo el tiempo:

- Si está lloviendo, llevo paraguas.
- Si tengo hambre, como algo.
- Si saco más de 10, apruebo el curso.

En programación, usamos estructuras condicionales 
para que el programa tome decisiones según ciertas condiciones.

Sintaxis básica en Kotlin


if (condición) {
    // Código si la condición es verdadera
} else {
    // Código si la condición es falsa
}


También puedes usar `else if` para múltiples condiciones:

if (nota >= 18) {
    println("Excelente")
} else if (nota >= 11) {
    println("Aprobado")
} else {
    println("Desaprobado")
}


---

------------------ Sistema de Evaluación de Estudiantes---------

Vamos a crear un programa que evalúe a un estudiante según su nota y le dé un mensaje personalizado.

*/

fun evaluarEstudiante(nombre: String, nota: Int) {
    println("📋 Evaluando a $nombre con nota $nota...")

    if (nota >= 18) {
        println("🎉 ¡Excelente trabajo, $nombre!")
    } else if (nota >= 11) {
        println("✅ Aprobado, sigue esforzándote.")
    } else {
        println("❌ Desaprobado. No te rindas, puedes mejorar.")
    }
}

fun main() {
    evaluarEstudiante("Lucía", 19)
    evaluarEstudiante("Carlos", 14)
    evaluarEstudiante("Ana", 8)
}

/* QUE HICISTE???

- Cómo usar `if`, `else if` y `else` para tomar decisiones.
- Cómo personalizar mensajes según condiciones.
- Cómo encapsular lógica en funciones reutilizables.

## 🧪 Ejercicio Propuesto: Clasificador de Edad


    -Crea un programa que reciba la edad de una persona
     y muestre un mensaje según su grupo etario:

        - Menor de 13 → "👶 Eres un niño/a"
        - Entre 13 y 17 → "🧒 Eres un adolescente"
        - Entre 18 y 59 → "🧑 Eres un adulto"
        - 60 o más → "👴 Eres un adulto mayor"

### 📝 Instrucciones

1. Crea una función llamada `clasificarEdad(edad: Int)`.
2. Usa condicionales para mostrar el mensaje correspondiente.
3. Llama a la función desde `main` con diferentes edades para probar.

*/