package lista1.complementares.problema2

data class Candidato(
    val numInscricao: Int,
    val idade: Int,
    val sexo: Char,
    val temExperiencia: Boolean,
) {
}

fun calculaFemininas(candidatos: List<Candidato>): Int {
    return candidatos.count { it.sexo == 'F'};
}

fun calculaMasculinos(candidatos: List<Candidato>): Int {
    return candidatos.count { it.sexo == 'M'};
}

fun calculaIdadeMediaHomensComExperiencia(candidatos: List<Candidato>): Double {
    val homensComExp = candidatos.filter { it.sexo == 'M' && it.temExperiencia };
    val somaIdade = homensComExp.sumOf { it.idade }.toDouble();
    return (somaIdade/(homensComExp.size));
}

fun calculaPorcentagemHomens46ouMais(candidatos: List<Candidato>): Double{
    val somaHomens46ouMais = candidatos.count { it.sexo == 'M' && it.idade > 45 }.toDouble();
    val totalHomens = candidatos.count { it.sexo == 'M'}.toDouble();
    return (somaHomens46ouMais/totalHomens)*100;
}

fun calculaMulheres34ouMenosComExperiencia(candidatos: List<Candidato>): Int{
    return candidatos
        .count { it.sexo == 'F' && it.idade < 35 && it.temExperiencia }
}

fun calculaMenorIdadeMulheresExperientes(candidatos: List<Candidato>): Int{
    return candidatos
        .filter { it.sexo == 'F' && it.temExperiencia }
        .map { it.idade }
        .minOrNull() ?: 0
}