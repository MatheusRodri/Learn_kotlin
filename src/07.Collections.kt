fun main(){
    val nomes = listOf<String>("Matheus","Rodrigues") //Lista Imutáveis

    val pessoas = mutableListOf("Matheus","Pedro") // Lista Mutáveis
    println("Lista Inicial $pessoas")

    pessoas.add("Rodrigues")
    println("Lista depois $pessoas")
}