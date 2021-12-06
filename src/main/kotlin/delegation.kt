import kotlin.properties.Delegates

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
    var vetoNum : Int by Delegates.vetoable(0){ property, oldNum, newNum ->

       newNum >= 0
    }
}
fun main(){

    LazyClass().obj
    LazyClass().num = 23

    println(LazyClass().vetoNum)
    LazyClass().vetoNum = 7
    println(LazyClass().vetoNum)

}