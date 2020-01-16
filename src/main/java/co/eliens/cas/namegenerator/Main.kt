package co.eliens.cas.namegenerator

import java.io.Console

object Main {
    val vowels = arrayOf("a", "e", "i", "o", "u")
    val consonants = arrayOf("b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z")
    @JvmStatic
    fun main(args: Array<String>) {
        generate()
    }

    private fun generate() {
        print("Length?  ")
        val length = readLine()!!.toIntOrNull()

        if (length == null) {
            println("Wrong format")
            generate()
        }

        if (length!! == 0) {
            return
        }

        var odd = false
        var result = ""

        (0 until length).forEach { _ ->
            result += if (odd) {
                consonants.random()
            } else {
                vowels.random()
            }

            odd = !odd
        }

        println("Result: $result")
        println()

        generate()
    }
}