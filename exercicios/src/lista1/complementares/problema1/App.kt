package lista1.complementares.problema1

fun main() {
    println(" -----Calculo Comerciario ----- ");
    println("Informe:")
    print("Salario minimo: R$ ");
    val salMin: Double = readln().toDouble();

    print("Valor limite de insencao IRPF: R$ ");
    val isencao: Double = readln().toDouble();

    print("Preço dos televisores PRETO E BRANCO: R$ ");
    val tvPbValor: Double = readln().toDouble();

    print("Preço dos televisores COLORIDOS: R$ ");
    val tvCoresValor: Double = readln().toDouble();

    val valores = Valores(salMin, isencao, tvPbValor, tvCoresValor);
    val comerciarios = mutableListOf<Comerciario>();

    for(i in 1 .. 20){
        println(" -> Comerciario $i:");
        print("Inscrição: ");
        val inscricao: Int = readln().toInt();
        print("Televisores a cores vendidos: ");
        val tcores: Int = readln().toInt();
        print("Televisores preto e branco vendidos: ");
        val tpretobranco: Int = readln().toInt();

        val comerciario = Comerciario(
            inscricao,
            tcores,
            tpretobranco,
            valores
        );
        comerciarios.add(comerciario)
    }

    println("\nComerciarios:");
    comerciarios.forEach { println(it) }
}