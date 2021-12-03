// interface1 define
interface Interface1 {
   fun display(){
       println("interface display 1 ")
   }
   val someValue:String
      get() = "hello"
}

// interface2 define
interface  Interface2{
    fun display(){
        println("interface display 2 ")
    }
}

// defining class which is implementing interface1, interface2
class Try :Interface1, Interface2{

    // overriding the properties(variable)
    override val someValue = "interface variable"

    // overriding the method
    override fun display() {

        // calling interface1 display method using super keyword
        super<Interface1>.display()

        // calling interface2 display method using super keyword
        super<Interface2>.display()

        // accessing the interface1 variable using super keyword
        println(super.someValue)
    }
}
// main function
fun main(){

    // creating try class instance
    val tryObj = Try()

    // calling try class display method using try class isntance 
    tryObj.display()
}
