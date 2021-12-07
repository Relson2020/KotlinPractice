fun main(){

    println(" ---- (..) range ")

    // (..) range

    for (i in 1..5){
        print("$i ")
    }

    println("\n\n ---- rangeTo()")

    // rangeTo()

    for (i in 1.rangeTo(6)){
        print("$i ")
    }

    // downTo()

    println("\n\n ---- downTo() ")
    for (i in 6.downTo(1)){
        print("$i ")
    }

    // range with forEach loop

    println("\n ---- range with forEach loop ")
    (4.downTo(1)).forEach{
        print("$it ")
    }

    // step
    println("\n ---- step ")
    for (i in 1..6  step 2){
        print("$i ")
    }

    println("\n ---- step and down with forEach loop ")
    // step and down with forEach loop
    (6.downTo(1 ) step 2).forEach{
        print("$it ")
    }

    println("\n ---- reverse()")

    // range reverse() function

    val range = 1..5
    for (i in range.reversed()){
        print("$i ")
    }

    println("\n ---- checking range ")
    // checking the range
    val check = 3
    if(check in 1..6){
        println("$check is in range (1..6)")
    }
    else{
        println("$check is not in range (1..6 )")
    }

 }