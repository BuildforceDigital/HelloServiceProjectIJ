package app.model

import java.util

import app.entities.User

import scala.jdk.CollectionConverters._

object Model {
  val model: util.ArrayList[User] = new util.ArrayList()

  def add(user: User): Unit = model.add(user)

  def list: util.List[String] = model.asScala.map(_.name).asJava
}