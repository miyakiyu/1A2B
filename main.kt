import java.util.Scanner

fun main()
{
    //first pick a random number from 1111 to 9999
    val random_numbers = listOf(0,1,2,3,4,5,6,7,8,9)
    val none_repeat_number = random_numbers.shuffled().take(4)
    println("The number is ready! Let's have fun!(｢･ω･)｢")

    //get answer and store it to a List<Int> type
    println("Enter your answer:")
    val read = Scanner(System.`in`)
    val your_answer:List<Int> = mutableListOf()

    val input = readLine()
    your_answer.add(input)    


    //check your answer for measure "A" and "B" and print it out
    check_ab(none_repeat_number,your_answer)
    val (count_a,count_b) = check_ab(none_repeat_number,your_answer)
    println("You got ${count_a}A ${count_b}B")

}

fun check_ab(number:List<Int>,your_number:List<Int>):Pair<Int,Int>
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
