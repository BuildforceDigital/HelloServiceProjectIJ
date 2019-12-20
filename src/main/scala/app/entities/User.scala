package app.entities

class User(val name: String, val password: String) {
  def getName: String = name

  override def toString: String = s"User{name='$name', password='$password'}"
}