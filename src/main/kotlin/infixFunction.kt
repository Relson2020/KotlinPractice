class Infix {

    // infix function
    infix fun infixFunction(num: Int): Int {
        return num * num
    }
}
fun main(){
     val obj = Infix()

    // infix function call
    println("${obj infixFunction 7}")
}