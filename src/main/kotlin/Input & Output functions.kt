fun main(){
   /* var temp2 : String?
    temp2 = "Friend"
    temp2 = null
    println("${temp2!!}")*/

    println("----------Output function----------")
    // print() function displaying in the same line
    print("hello its - ")
    print("print() function \n")

    // println() function displaying in the next line
    println("hello its -")
    println("println() function")

    println("------------Input function-------------")
    print("Enter your name ")

    // Taking String input
    val name = readLine()!!

    //displaying the String input value
    println("your name : $name")

    print("Enter your age :")

    // Taking the integer input value
    var temp = readLine()!!
    val age = temp.toInt()

    // displaying the Int value
    println("your age is : $age ")

    print("Enter the decimal number : ")

    // Taking the Double input value
    temp = readLine()!!
    val double = temp.toDouble()

    // displaying the Double value
    println("Entered decimal number : $double")

    // Basic calculator using operators and input and output

    println("\n-----------------Basic Calculator using Input/Output functions and operator--------------- \nEnter the two numbers ")

    // input of the first number
    print("Enter the first number : ")
    var scanner : String = readLine()!!
    val number1 = scanner.toDouble()

    // input of the second number
    print("Enter the second number : ")
    scanner = readLine()!!
    val number2 = scanner.toDouble()

    // Addition of the number1 and number2
    println("\nAddition of $number1 and $number2 : ${number1.plus(number2)}")

    // Subtraction of the number1 and number2
    println("Subtraction of $number1 and $number2 : ${number1.minus(number2)}")

    // Multiplication of the number1 and number2
    println("Multiplication of $number1 and $number2 : ${number1.times(number2)}")

    // Division of the number1 and number2
    println("Division of $number1 and $number2 : ${number1.div(number2)}")

    // Reminder of the number1 and number2
    println("Reminder of $number1 and $number2 : ${number1.rem(number2)}")

}