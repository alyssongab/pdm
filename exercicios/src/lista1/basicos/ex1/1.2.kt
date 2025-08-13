package lista1.basicos.ex1

import java.util.Scanner

fun main() {
    print("Informe um valor inteiro: ")
    val num = Scanner(System.`in`).nextInt();
    println(when{
        num > 0 -> "positivo";
        num < 0 -> "negativo";
        else -> "zero"
    });
}
