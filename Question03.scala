object Question03 extends App {
  val p1= new Acc("12345678V",3000,405562321)
  val p2= new Acc("23456789V",4000,405562322)
  println("Before Tranferring Money")
  println(p1)
  println(p2)
  println()
  println()
  println("After Transferring Money")
  p1.transfer(p2,2000)
  println(p1)
  println(p2)

}
class Acc(id:String,bala:Double,accNum:Int) {
  var nic:String=id
  var bal:Double=bala
  var acNum:Int=accNum

  def deposit(d:Double): Unit ={
    this.bal=this.bal+d
  }
  def withdraw(w:Double): Unit ={
    this.bal=this.bal-w
  }
  def transfer(a:Acc,b:Double): Unit ={
    this.withdraw(b)
    a.deposit(b)
  }
  override def toString= "["+"NIC= "+nic+" ACCNum= "+acNum+" Balance= "+bal+"]"
}
