package app.model

import scala.jdk.CollectionConverters._

case class User(name: String, password: String) {
  def getName: String = name

  override def toString: String = s"User{name='$name', password='$password'}"
}

object Model {
  val model = collection.mutable.ArrayBuffer[User]()

  def add(user: User): Unit = model.append(user)

  def userList: java.util.List[String] = model.map(_.name).asJava
}