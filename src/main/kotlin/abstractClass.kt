// abstract class define
abstract class AbstractCLass{
    abstract var num1 :Int
    abstract var num2 :Int
    var sum = 0
    abstract fun display()
    fun calculate(){
      sum = num1+num2
    }
}

// inheriting abstract class
class Calculate (cNum1 : Int , cNum2 :Int): AbstractCLass() {

    // overriding abstract class members
    override var num1 = cNum1
    override var num2 = cNum2

    // overriding abstract class methods
    override fun display() {

        // calling calculate function from display function body
        calculate()
        println(sum)
    }

}

// main function
fun main(){

    // creating the instance of Calculate class
    val obj = Calculate(34,75)

    // calling the display() function
    obj.display()

}