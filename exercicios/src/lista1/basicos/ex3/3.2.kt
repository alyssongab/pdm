package lista1.basicos.ex3

fun main() {
    print("rua: ");
    val rua: String? = readlnOrNull();

    print("numero: ");
    val numero: Int? = readln().toIntOrNull();

    print("cidade: ");
    val cidade: String? = readlnOrNull();

    println(descreveEndereco(rua, numero, cidade));
}

fun descreveEndereco(rua: String?, numero: Int?, cidade: String?): String {
    val r = if (!rua.isNullOrBlank()) rua else "Não informado";
    val num = numero ?: "Não informado";
    val cid = if(!cidade.isNullOrBlank()) cidade else "Não informado";

    return "Rua $r, N°$num, $cid";
}