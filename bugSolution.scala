```scala
class MyClass(val name: String) {
  def greet(): Unit = {
    val safeName = Option(name).getOrElse("Unknown") // Handle null safely
    println(s"Hello, my name is $safeName")
  }
}

object Main extends App {
  val myObj = new MyClass("John")
  myObj.greet()

  val myObj2 = new MyClass(null)
  myObj2.greet() // Now prints "Hello, my name is Unknown"
}
```