package lista1.basicos.ex4

data class Aluno(val nome: String, val matricula: String, val notas: List<Double>) {

    init{
        println("Aluno $nome criado");
    }

    fun calculaMedia(): Double {
        return notas.sum().div(notas.size);
    }
}

fun main() {
    val alysson = Aluno(
        nome = "Alyson",
        matricula = "2024003155",
        notas = listOf(10.0, 8.8, 7.5, 6.8, 10.0, 8.5)
    );

    println(alysson.calculaMedia());
}