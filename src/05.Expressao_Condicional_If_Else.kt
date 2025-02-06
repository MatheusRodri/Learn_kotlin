fun main(args: Array<String>) {

    val num1 = 10
    val num2 = 20

    val resultado = if(num1 == num2){
        "10==20"
    } else if(num1 < num2){
        "10 < 20"
    }
    else{
        "10 != 20"
    }

    println(resultado)
    val resultado2 = operacao(10,10)
    println(resultado2)
}


fun operacao(num1: Int, num2: Int): String {
    return if(num1 == num2){
        "10==20"
    } else if(num1 < num2){
        "10 < 20"
    }
    else{
        "10 != 20"
    }
}