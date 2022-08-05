import java.util.Scanner

fun main()
{
    //first pick a random number from 0 - 9 
    val random_numbers = listOf("0","1","2","3","4","5","6","7","8","9")
    val none_repeat_number = random_numbers.shuffled().take(4)
    println("The number is ready! Let's have fun!(｢･ω ･)｢")

    //counting your plat times
    var count_num:Int = 0

    //count your play times,if smaller than 5 times, you can continue
    while(count_num < 10)
    {
        //get answer and store it to a List<Int> type
        println("Enter your answer:")
        val input = readLine()!!.split(" ") //your input
        val your_answer:MutableList<String> = mutableListOf() //create a list to store your input
        input.forEach() //put it inside the list
        {
            your_answer.add(it)
        }

        /* TEST BLOCK!!!
        println(none_repeat_number)
        println(your_answer)
        */


        //check your answer for measure "A" and "B" and print it out
        val (count_a,count_b) = check_ab(none_repeat_number,your_answer)
        println("You got ${count_a}A ${count_b}B")
        if(count_a == 4)
        {
            println("YOU WIN !!! (b･w ･)b")
            break
        }
        count_num+=1
    }
    if(count_num == 10)
    {
        println("GAME OVER !!! (｢-ω -)｢")
        println("The correct answer is:${none_repeat_number}")
    }
}

fun check_ab(number:List<String>,your_number:List<String>):Pair<Int,Int>
{
    var count_a:Int = 0
    var count_b:Int = 0

    for(i in number.indices)
    {
        for(j in number.indices)
        {
            if(i ==j && number[i]==your_number[j])
            {
                count_a+=1
            }
            else if(number[i]==your_number[j])
            {
                count_b+=1
            }
        }
    }

    return Pair(count_a,count_b)
}
