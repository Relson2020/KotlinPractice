fun main(){

    // pair access with .
    val pair = Pair("String","Int")
    println("pair.1 : ${pair.first} \npair.2 : ${pair.second}")

    // initializing two variable in a single line using the pair
    val (name, age ) = Pair("daven ", 14)
    println("name : $name \nage : $age")

    // pair toString()
    println("toString : ${pair.toString()}")

    // pair toList()
    println("toList : ${pair.toList()}")
}