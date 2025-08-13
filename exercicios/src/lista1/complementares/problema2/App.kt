package lista1.complementares.problema2

fun main() {

    val candidatos = listOf(
        Candidato(1, 25, 'F', true),
        Candidato(2, 30, 'F', false),
        Candidato(3, 22, 'F', true),
        Candidato(4, 40, 'M', true),
        Candidato(5, 50, 'M', false),
        Candidato(6, 35, 'M', true),
    )

    println("Total de candidatas femininas: ${calculaFemininas(candidatos)}")
    println("Total de candidatos masculinos: ${calculaMasculinos(candidatos)}")
    println("Idade média dos homens com experiência: ${calculaIdadeMediaHomensComExperiencia(candidatos)}")
    println("Porcentagem de homens com mais de 45 anos: ${calculaPorcentagemHomens46ouMais(candidatos)}%")
    println("Mulheres com menos de 35 anos e com experiência: ${calculaMulheres34ouMenosComExperiencia(candidatos)}")
    println("Menor idade entre mulheres com experiencia: ${calculaMenorIdadeMulheresExperientes(candidatos)}")
}