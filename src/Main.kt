fun main() {
    println("Данная преобразует введенное натуральное число из 10-ичной системы в двоичную.\n")
    while (true) {
        println("Введите натуральное число (введите 'exit' для выхода):")

        val input = readln().trim()

        if (input.equals("exit", ignoreCase = true)) {
            println("Программа завершена.")
            break
        }

        try {
            val numb = input.toInt()

            if (numb <= 0) {
                println("Ошибка: Введено не натуральное число")
                println()
                continue
            }

            val binaryString = Integer.toBinaryString(numb)

            println("Число $numb в двоичной системе: $binaryString")

        } catch (e: NumberFormatException) {
            println("Ошибка: введено некорректное число")
        }

        println()
    }
}