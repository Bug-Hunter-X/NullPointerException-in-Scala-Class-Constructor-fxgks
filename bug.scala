```scala
class MyClass(val name: String) {
  def greet(): Unit = {
    println(s"Hello, my name is $name")
  }
}

object Main extends App {
  val myObj = new MyClass("John")
  myObj.greet() // This will print correctly

  val myObj2 = new MyClass(null)
  myObj2.greet() // This will throw a NullPointerException
}
```