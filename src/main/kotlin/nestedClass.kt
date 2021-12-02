class outer{

    val outerClass = "OuterClass"

    inner class inner{
        val innerClass = "printing InnerCLass"
        fun display(){
            println(innerClass)
        }
        fun display2(){
            println("$innerClass and accessing the outer class member using the inner keyword  $outerClass ")
        }
    }
}
fun main(){
    val outerObj = outer()
    val innerObj = outer().inner()
    with(innerObj){
        display()
        display2()
    }
}