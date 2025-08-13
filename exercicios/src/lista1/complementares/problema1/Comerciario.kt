package lista1.complementares.problema1

import java.text.NumberFormat
import java.util.Locale


/*
* salario = minimo + comissao - inss (8% em cima do salario bruto)
* se o salario for maior que o limite do irpf (3036), desconta
* 15% em cima do valor que passar esse limite.
* */

data class Comerciario(
    val inscricao: Int,
    val tvsColoridosVendidos: Int,
    val tvsPretoBrancoVendidos: Int,
    val valores: Valores
){
    private val salarioBruto: Double;
    private val salarioLiquido: Double;
    private val descontoIsencao: Double;
    private val comissao: Double;
    private val descontoInss: Double;

    init{
        this.comissao = calculaComissao();
        this.salarioBruto = valores.salarioMinimo + comissao;
        this.descontoInss = calculaDescontoInss();
        this.descontoIsencao = calculaDescontoIsencao(salarioBruto, descontoInss);
        this.salarioLiquido = salarioBruto - descontoInss - descontoIsencao
    }

    override fun toString(): String {
        val formato = NumberFormat.getCurrencyInstance(Locale("pt", "BR"));
        return """
            --------------------------------------------
            Numero de inscricao: $inscricao
            Comissao: ${formato.format(comissao)}
            Salario bruto: ${formato.format(salarioBruto)}
            Salario liquido: ${formato.format(salarioLiquido)}
            Descontos:
                - INSS: ${formato.format(descontoInss)}
                ${if(descontoIsencao > 0.0) "- IRPF: ${formato.format(descontoIsencao)}" else ""}
            ---------------------------------------------
        """.trimIndent();
    }

    private fun calculaComissao(): Double {

        val comissaoPretoBranco: Double = when {
            (tvsPretoBrancoVendidos >= 20) -> (0.13*valores.precoTvPretoBranco) * tvsPretoBrancoVendidos;
            else -> (0.12*valores.precoTvPretoBranco) * tvsPretoBrancoVendidos;
        }

        val comissaoColoridas: Double = when {
            (tvsColoridosVendidos >= 10) -> (0.14*valores.precoTvColorida) * tvsColoridosVendidos;
            else -> (0.13*valores.precoTvColorida) * tvsColoridosVendidos;
        }

        return comissaoColoridas + comissaoPretoBranco;
    }

    private fun calculaDescontoInss(): Double {
        return valores.inss * salarioBruto;
    }

    private fun calculaDescontoIsencao(salarioBruto: Double, inss: Double): Double {
        val total = salarioBruto - inss;
        if(total > valores.isencaoLimite){
            val diferenca = total - valores.isencaoLimite;
            return (0.15 * diferenca);
        }
        else return 0.0
    }

}