package lista1.complementares.problema3

fun main() {
    val alunos = mutableListOf<Aluno>()

    for (i in 1..100) {
        println("Aluno $i:")

        print("Matrícula: ")
        val matricula = readln().toInt()

        val notas = mutableListOf<Int>()
        for (n in 1..3) {
            print("Nota $n: (0 a 100)")
            notas.add(readln().toInt())
        }

        print("Frequência: ")
        val frequencia = readln().toInt()

        alunos.add(Aluno(matricula, notas, frequencia))
        println()
    }

    println("Dados alunos:")
    for (aluno in alunos) {
        val status = if (aluno.notaFinal >= 60 && aluno.frequencia >= 40) "Aprovado" else "Reprovado"
        println("Matrícula: ${aluno.matricula}, Frequência: ${aluno.frequencia}, Nota Final: ${"%.2f".format(aluno.notaFinal)}, Status: $status")
    }

    println("Dados da turma:")
    println("""
Maior nota: ${"%.2f".format(calculaMaiorNota(alunos))}
Menor nota: ${"%.2f".format(calculaMenorNota(alunos))}
Média da turma: ${"%.2f".format(calculaMediaTurma(alunos))}
Total de alunos reprovados: ${calculaReprovadosTotal(alunos)}
Porcentagem de reprovados por falta: ${"%.2f".format(calculaPorcentagemReprovadosFalta(alunos))}%
    """)
}
