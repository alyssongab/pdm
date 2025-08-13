package lista1.basicos.ex2

import java.util.Scanner

fun main() {
    val palavraInvertida: String = Scanner(System.`in`).nextLine().inverte();
    println(palavraInvertida);
}

fun String.inverte(): String {
    return this.reversed();
}