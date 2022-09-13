object Question0102 extends App {

  var r1= new Rational(3,4)
  val r2= new Rational(5,8)
  val r3= new Rational(2,7)
  var x=r1.neg
  var addition= r1-r2-r3
  println("Answer= "+x)
  println("Addition= "+addition)

}
class Rational(n:Int,d:Int) {
  require(d>0,"Denominator Must greater than 0")
  def numerator=n
  def denomerator=d

  def add(a:Rational)= new Rational(this.numerator*a.denomerator+this.denomerator*a.numerator,this.denomerator*a.denomerator)
  def neg=new Rational(-this.numerator,this.denomerator)
  def -(a:Rational)=this.add(a.neg)
  override def toString=numerator+"/"+denomerator
}
