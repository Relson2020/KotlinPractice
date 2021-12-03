// primary constructor
class PrimaryConstructor constructor(val1 : Int , val2 : Int){
    private var num1 = 0
    private var num2 = 0

    // init block is used because primaryConstructor don't have a code block
    init {

        // initializing the num1 and num2 with the primaryConstructor values
        num1 = val1
        num2 = val2

        println("sum is : ${num1+num2}")
    }
}
open class SecondaryConstructor {

    var name = ""
    var id = ""
    var salary = 0.0

    constructor(pCName : String , pCId : String , pCSalary : Double){
        name = pCName
        id = pCId
        salary = pCSalary

        println("parentClass name : $name")
        println("parentClass id : $id")
        println("parentCLass salary : $salary")
    }
}
class SecondaryConstructor2:SecondaryConstructor {

    constructor(cName : String , cId : String ):super(cName,cId,15000.0){
        name = cName
        id = cId

        println("\nchildClass name : $name")
        println("childClass id : $id")
    }
}


fun main(){

    // class PrimaryConstructor object and passing parameter to primary constructor
    PrimaryConstructor(23,54)
    println("")
    SecondaryConstructor2("alli","ad23")
}

