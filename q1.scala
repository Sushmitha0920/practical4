import scala.io.StdIn
object RetailStore {

  val item = Array("soap", "fruit juice", "books", "pen", "pencil", "eraser")
  val quantity = Array(10, 5, 20, 25, 25, 40)

  def displayInventory(): Unit = {
    println("List of the inventory items names and quantity ")
    for(i <- item.indices){
      println(item(i) +" "+ quantity(i) + "\n")
    }
  }

  def restockItem(name: String , quant: Int): Unit = {
    var count=0
    for(i<- item.indices){

      if(item(i) == name){
        quantity(i) = quantity(i) + quant
        count=count+1
      }
    }

    if(count<1){
      println("Your item is not sale or restore in our store.")
    }

    println("Now available items and quantity are : ")
    displayInventory()
  }

  def sellItem(name: String, quant: Int): Unit = {
    var count = 0
    for (i <- item.indices){
      if (item(i) == name) {
        quantity(i) = quantity(i) - quant
        count = count - 1
      }
    }

    if (count < 1){
      println("Your item is not sale or restore in our store")
    }

    println("Now available items and quantity are : ")
    displayInventory()
  }


  def main(args: Array[String]) : Unit = {

    displayInventory()

    println("Enter the item which you want to add : ")
    var result1 = StdIn.readLine().toString

    println("Enter the quantity this item which you want to add : ")
    var result2 = StdIn.readLine().toInt
    restockItem(result1,result2)

    println("Enter the item which you want to buy : ")
    var result3 = StdIn.readLine().toString

    println("Enter the quantity this item which you want to buy : ")
    var result4 = StdIn.readLine().toInt
    sellItem(result3, result4)

  }
}
