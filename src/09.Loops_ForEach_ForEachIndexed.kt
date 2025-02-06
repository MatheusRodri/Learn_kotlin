fun main(){
    val pessoas = listOf<String>("Matheus","Rodrigues") //Lista Imutáveis


    val filtro = pessoas.filter{it.startsWith('M', ignoreCase = true)}

    pessoas.forEach{
       // println(it)
    }

    pessoas.forEachIndexed{ index,pessoa ->
        //println("Posição: $index - Nome: $pessoa")
    }

    filtro.forEachIndexed{ index,pessoa ->
        println("Posição: $index - Nome: $pessoa")
    }

}