// unary operator overloading
class UnaryOperatorOverloading(var string : String){
    operator fun unaryMinus(){
        string = string.reversed()
    }
}

// increment and decrement operator
class IncDecOverload (var value :String){
    operator fun inc():IncDecOverload{
       val obj = IncDecOverload(this.value)
       obj.value = obj.value + 'a'
        return obj
    }
    operator fun dec():IncDecOverload{
        val obj = IncDecOverload(this.value)
        obj.value = obj.value.substring(0,obj.value.length-1)
        return obj
    }
    override fun toString(): String {
        return value
    }
}

class BinaryOperatorOverloading (var obj :String) {
    operator fun plus(value: Int):String{
        obj = "$obj is $value"
        return obj
    }

    override fun toString(): String {
        return obj
    }
}

fun main(){
    val obj = UnaryOperatorOverloading("reverse")
    println("before unary call :${obj.string}")

    // calling unaryMinus operator
    -obj
    println("after call : ${obj.string}")

    var obj2 = IncDecOverload("hello")
    println(obj2++)
    println(++obj2)
    println(obj2--)
    println(--obj2)

    val obj3 = BinaryOperatorOverloading("hey")
    obj3+45
    println(obj3)

}

