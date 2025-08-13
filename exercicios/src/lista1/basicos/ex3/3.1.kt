package lista1.basicos.ex3

import java.util.Scanner

fun main() {
    val str: String? = Scanner(System.`in`).nextLine();
    println(comprimentoOuZero(str));
}

fun comprimentoOuZero(entrada: String?): Int {
    return entrada?.length ?: 0
}