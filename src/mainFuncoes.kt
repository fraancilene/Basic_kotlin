fun main(args : Array<String>){

    exibirMensagem()
    calculaIdade(2021, 1994)
    var resultado = somar(5, 5)
    println(resultado)

}

fun exibirMensagem(){
    // código
    println("Hello World")
}

// função com parametros
fun calculaIdade(anoAtual: Int, anoNascimento: Int ){
    var idade: Int = anoAtual - anoNascimento;
    println("Sua idade é $idade")
}

// função com retorno
fun somar(x : Int, y : Int) : Int{
    var total = x + y
    return total
}