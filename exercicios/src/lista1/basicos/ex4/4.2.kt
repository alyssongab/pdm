package lista1.basicos.ex4

class Retangulo(val largura: Double, val altura: Double) {

    fun calculaArea(): Double{
        return largura * altura;
    }

    fun calcularPerimetro(): Double {
        return (2*largura) + (2*altura);
    }

    fun verificaLados(): String {
        return if(largura.equals(altura)) "Quadrado" else "Retângulo";
    }
}

fun main() {
    val quadrilatero1 = Retangulo(largura = 4.0, altura = 4.0);
    val quadrilatero2 = Retangulo(largura = 5.5, altura = 8.5);

    println("Quadrilatero 4cm x 4cm: ");
    println("Area: ${quadrilatero1.calculaArea()}");
    println("Perimetro: ${quadrilatero1.calcularPerimetro()}");
    println("Tipo: ${quadrilatero1.verificaLados()}");

    println("*****************************************");

    println("Quadrilatero 5,5cm x 8,5cm: ");
    println("Area: ${quadrilatero2.calculaArea()}");
    println("Perimetro: ${quadrilatero2.calcularPerimetro()}");
    println("Tipo: ${quadrilatero2.verificaLados()}");
}