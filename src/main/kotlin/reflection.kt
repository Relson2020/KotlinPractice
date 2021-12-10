
// class
class ReflectionClass {
}

// function
fun functionReference(a:Int) : Boolean {
    return a%3==0
}

// property or variable
class PropertyReference (val a: Int){}


fun main(){

    // class reference
    val b = ReflectionClass::class
    println(b)
    val a = ReflectionClass()
    println(a::class)

    // function reference
    val functionRefer = ::functionReference
    val array = listOf(1,3,4,5,6,7,8)
    println(array.filter(functionRefer))

    // property reference
    val propertyReference = PropertyReference::a
    println(propertyReference.get(PropertyReference(45)))

    // constructor reference
    val constructorReference = ::PropertyReference
    println(constructorReference)

}