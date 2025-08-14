package lista1.complementares.problema3

data class Aluno(
    val matricula: Int,
    val notas: List<Int>,
    val frequencia: Int
){
    val notaFinal: Double = calculaNotaFinal();

     private fun calculaNotaFinal(): Double {
        return (notas.sum() / 3).toDouble();
    }
}

fun calculaMaiorNota(alunos: List<Aluno>): Double {
    return alunos.maxOf { aluno -> aluno.notaFinal }
}

fun calculaMenorNota(alunos: List<Aluno>): Double {
    return alunos.minOf { aluno -> aluno.notaFinal }
}

fun calculaMediaTurma(alunos: List<Aluno>): Double {
    return alunos.sumOf { aluno -> aluno.notaFinal }.div(alunos.size);
}

fun calculaReprovadosTotal(alunos: List<Aluno>): Int {
    return alunos
        .count { aluno -> aluno.notaFinal < 60 || aluno.frequencia < 40 }
}

fun calculaPorcentagemReprovadosFalta(alunos: List<Aluno>): Double {
    val reprovadosFalta = alunos.count { aluno -> aluno.frequencia < 40 };
    return ((reprovadosFalta/(alunos.size.toDouble())) * 100);
}