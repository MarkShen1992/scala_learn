package demo.part01

class Cat {
  // Public is Scala's default access level.
  var furColor = "°×É«"
  private var age = 0
  private var height = 0
  
  def setAge(age: Int): Unit = this.age = age
  
  def getAge(): Int = this.age
  
  def setHeight(height: Int) {
    this.height = height
  }
  
  def getHeight(): Int = {
    this.height
  }
  
  def getHeight2() = this.height
}