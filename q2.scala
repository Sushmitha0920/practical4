import scala.io.StdIn
object CheckNumber {

  def main(args: Array[String]): Unit = {

    println("Enter a number : ")
    var num=StdIn.readLine().toInt

    if(num==0){
      println("Number is zero")
    }

    else if(num<0){
      println("Negative number")
    }
    else if(num%2 == 0){
      println("Even number")
    }else{
      println("odd number")
    }
    
  }
}
