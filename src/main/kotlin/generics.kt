class Generics2 <in T> {
    fun display(value : T) {
        println(value)
    }
}
fun main() {
    val int = 10
    display(int)
    val string = "hello"
    display(string)
    val double = 123.32
    display(double)
    val boolean = true
    display(boolean)
    println(Generics("hey").display())
    //Generics2().display("hey")
}
fun <T> display(value: T){
    println(value)
}

class Generics <out T>(val value : T){

    fun display(){
        println(value)
    }
}
