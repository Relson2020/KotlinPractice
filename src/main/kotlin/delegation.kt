import kotlin.properties.Delegates

interface Base {
    fun display()
}

class TryDelegation (private val value : Int ): Base {
    override fun display (){
        println("executing the display function via delegation and number is : $value")
    }
}

class TryDelegation2 (private val value : Int ): Base {
    override fun display (){
        println("executing the display function via delegation and number is : $value")
    }
}

class DelegationClass2 (b:Base )  :Base  by b

class DelegationClass {
    init {
        println("Delegation class ")
    }
}
class LazyClass{
    val obj by lazy { DelegationClass()  }
    var num : Int by Delegates.observable(10) { _, oldNum, newNum ->

        println("oldNum :$oldNum and newNum :$newNum")

    }

}
fun main(){

    LazyClass().obj
    LazyClass().num = 23

    val b = TryDelegation(10)
    val a = TryDelegation2(23)
    DelegationClass2(b).display()
    DelegationClass2(a).display()
}