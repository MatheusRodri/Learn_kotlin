fun main(){
    val pessoas = listOf<String>("Matheus","Rodrigues") //Lista Imutáveis

    for((posicao,pessoa) in pessoas.withIndex()){
        println("Posição: $posicao - Nome: $pessoa")
    }
}