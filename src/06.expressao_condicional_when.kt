fun main(args : Array<String>) {

    val numero = 10

    when (numero) {
        10 -> {
            println(numero)
        }
        20 ->{
            println(numero)
        }
        else ->{
            println("numero está fora")
        }
    }

   val resultado = compara(10,10)
    println(resultado)
}


fun compara (num1 : Int, num2 : Int) : String{
    return when{
        num1 < num2 -> {
            "$num1 < $num2"
        }
        num1 > num2 -> {
            "$num1 > $num2"
        }
        else -> {
            "$num2 == $num1"
        }
    }
}