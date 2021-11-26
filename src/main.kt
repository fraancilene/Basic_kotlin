fun main(args : Array<String>){
    // DECLARANDO VARIÁVEIS
    var usuario = "Francilene" // var declara variáveis mutáveis
    val pi = 3.14 // val declara variáveis imutáveis

    var valor1 = 5
    var valor2 = 4
    var total = valor1 + valor2

    // imprimindo valores
    println(usuario)
    println(pi)
    println(total)
    // imprimindo valor da variável dentro de uma string
    print("o total da soma é: $total")

    // TIPOS DE VARIÁVEIS
    // kotlin é dinamicamente tipada, não precisa definir o tipo da variável
    var numero: Double = 3.5;
    var numeroFloat: Float = 5.3f
    var number: Int; // especifique o tipo caso a variável não for inicializada
    var texto: String;
    var numeroLong: Long = 10L
    var result: Boolean = true

    texto  = "Francilene é uma estudante"

    println()

}