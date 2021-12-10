fun main(){

    // triple using triple. operator to access the value
    val triple = Triple("here","there","where")

    println("triple.1 : ${triple.first} \ntriple.2 : ${triple.second} \ntriple.3 : ${triple.third}")

    // assigning 3 variables using triple
    val (here , there , where) = Triple("are you here","are you there","where then")
    println("here : $here \nthere : $there \nwhere : $where")

    // triple toString()
    println("toString : ${triple.toString()}")

    // triple toList()
    println("toList : ${triple.toList()}")

}