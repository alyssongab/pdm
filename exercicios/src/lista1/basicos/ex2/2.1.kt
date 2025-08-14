package lista1.basicos.ex2

import java.util.Scanner

fun main() {
    println(ehPar());
}

fun ehPar(): Boolean {
    val num = Scanner(System.`in`).nextInt()
    return num % 2 == 0
}