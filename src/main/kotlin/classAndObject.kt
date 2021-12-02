// class define
class ClassAndObject {

    // class members
    var name = "gh"
    var age = 12

    // class function
    fun display(){
        println("Name is : $name \nAge is : $age")
    }
}
// main function
fun main(){

    // creating class object instance  (obj)
    val obj = ClassAndObject()
    // creating class object instance (obj2)
    val obj2 = ClassAndObject()

    // accessing the class member through (obj) object instance
    obj.name= "dalton"
    obj.age= 32

    // accessing the class member through (obj2) object instance
    obj2.name = "akn"
    obj2.age = 29

    println("\nexecuting the class function through first object ")
    // accessing the class function through (obj)
    obj.display()

    println("\nexecuting the class function through second object")
    // accessing the class function through (obj2)
    obj2.display()

}
