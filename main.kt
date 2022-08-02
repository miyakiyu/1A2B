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


    //check your answer for measure "B"
    check_b(none_repeat_number,your_answer)


    //check your answer for measure "A" and print it out
    println(check_a(none_repeat_number,your_answer))
    


}

fun check_b(number:List<Int>,your_number:List<Int>)
{
    //answer = 9527 , your_answer = 1234 , you got 1B

}

fun check_a(number:List<Int>,your_number:List<Int>)
{
    //answer = 9527 , your_answer = 9510 , you got 2A
    var count:Int = 0
    for(i in number)
    {
        if(number[i]==your_number[i])
        {
            count+=1
        }
    }

    return count
}