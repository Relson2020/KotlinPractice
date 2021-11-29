fun main(){

    println("------Enter the three numbers to check which one is greater-------")
    print("Enter the first number : ")
    var temp = readLine()!!
    val number1 = temp.toInt()

    print("Enter the second number : ")
    temp = readLine()!!
    val number2 = temp.toInt()

    print("Enter the third number : ")
    temp = readLine()!!
    val number3 = temp.toInt()

     // if else expression
     if (number1 > number2){

         // nested if else
         if (number1 > number3) {
            println("number $number1 is greater")
         } else {
             println("number $number3 is greater")
         }
     }

     // else if expression
     else if (number1 < number2){

         // nested if else
         if (number2 > number3){
           println("number $number2 is greater")
         }else{
             println("number $number3 is greater")
         }
     }

    println("Enter the number to see the day ")
    val temp2 = readLine()!!

    // when
    when (temp2.toInt()) {
        1-> {
            println("Monday")
        }
        2 -> {
            println("Tuesday")
        }
        3 -> {
            println("Wednesday")
        }
        4 -> {
            println("Thursday")
        }
        5 -> {
            println("Friday")
        }
        6 -> {
            println("Saturday")
        }
        7 -> {
            println("Sunday")
        }
        else -> {
            println("Enter the number between 1 to 7 ")
        }
    }

}