fun main() {
     val str = "12.3"

    val floatValue = str.toFloat()
    println("Число с плавающей точкой: $floatValue")

    val intValue = floatValue.toInt()
    println("Целое число: $intValue")

    val binaryString = Integer.toBinaryString(intValue)
    println("Двоичное представление: $binaryString")

    fun checkType(input: Any) {
        when (input) {
            is String -> println("Это строка")
            is Int -> println("Это целое число")
            is Float -> println("Это число с плавающей точкой")
            is Char -> println("Это символ")
            else -> println("Неизвестный тип")
        }
    }

    // Проверка типов
    checkType("Это строка")
    checkType(10)
    checkType(10.5f)
    checkType('A')

    fun processInput(input: Any) {
        when (input) {
            is Int -> println("Сумма числа и единицы: ${input + 1}")
            is String -> println("Сумма длины строки и единицы: ${input.length + 1}")
            is IntArray -> println("Сумма элементов массива: ${input.sum()}")
            else -> println("Неизвестный тип для обработки")
        }
    }

    // Обработка различных типов
    processInput(5)
    processInput("Hello")
    processInput(intArrayOf(1, 2, 3, 4, 5))
}