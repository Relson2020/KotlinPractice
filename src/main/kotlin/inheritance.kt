// parent class
open class ParentClass( name : String) {

    open val int = 23
    fun display1(){
        println("displaying the function in parent class ")
    }
    init {
        println("parent class name : $name")
    }
    open fun displayParent(){
        println("parentClass")
    }

}
// child class inherit the parentClass
class ChildClass(cName :String):ParentClass(cName) {
    override val int = 34
    fun display2(){
        println("displaying the function in child class :$int")
        super.display1()
    }
    init {
        println("child class name : $cName")
    }
    override fun displayParent(){
        println("childClass ")
    }
}

// main function
fun main(){

     val childClassObj = ChildClass("names it is")
     childClassObj.display2()
     childClassObj.display1()
    childClassObj.displayParent()

}

