fun main (args : Array<String>) {
    nomeCompleto("Matheus","Rodrigues")
    soma(1,15)

    val resultado = dividir(10,10)

    println("Resultado da divisão $resultado")
}

fun nomeCompleto(nome: String, sobrenome: String){
//    print(nome + " " + sobrenome)
    println("$nome $sobrenome")
}

fun soma(num1: Int, num2: Int){
    println("Resultado da soma: ${num1 + num2}")
}

fun dividir (num1: Int, num2: Int): Int{
    return num1 / num2
}

//fun dividir (num1: Int, num2: Int) = num1 / num2