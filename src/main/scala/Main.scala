object Main extends App {
  var x = 0L
  println("Hello, World!")
  while ({
    val number = io.StdIn.readInt()
    val prev = x
    val shouldAdd = number != 0
    if(shouldAdd){
      x += number
      println(s"$prev -> $x")
    }
    shouldAdd
  }) ()
  println("total: " + x)
}
