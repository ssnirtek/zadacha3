fun main() {
    println("Данная преобразует введенное натуральное число из 10-ичной системы в двоичную.")

        println("Введите натуральное число:")

        val input = readln().trim()

        try {
            val numb = input.toInt()

            if (numb <= 0) {
                println("Ошибка: Введено не натуральное число")
                println()
            }

            val binaryString = Integer.toBinaryString(numb)

            println("Число $numb в двоичной системе: $binaryString")

        } catch (e: NumberFormatException) {
            println("Ошибка: введено некорректное число")
        }

        println()
    }
