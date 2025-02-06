fun main(){
    val matheus = Usuario(nome = "Matheus", altura = 1.50f )

    val lucas = Usuario(nome = "Lucas", altura = 1.60f)


    println(matheus.info())
    println(lucas.info())

}

class Usuario(nome: String,altura:Float){
    private var nome: String = nome
    private var altura: Float = altura

    fun info():String{
        return "Usuario $nome, sua altura é $altura"
    }
}