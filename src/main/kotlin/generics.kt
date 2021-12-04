fun main(){
    val int = 10
    display(int)
    val string = "hello"
    display(string)
    val double = 123.32
    display(double)
    val boolean = true
    display(boolean)
}
fun <T> display(value: T){
    println(value)
}