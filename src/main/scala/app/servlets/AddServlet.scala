package app.servlets

import java.io.IOException

import app.model.{Model, User}
import javax.servlet.ServletException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.{HttpServlet, HttpServletRequest, HttpServletResponse}

@WebServlet(Array("/add"))
class AddServlet extends HttpServlet {

  @throws[IOException]
  @throws[ServletException]
  override protected def doPost(req: HttpServletRequest, resp: HttpServletResponse): Unit = {
    val name = req.getParameter("name")

    Model.add(User(name, req.getParameter("pass")))
    req.setAttribute("userName", name)
    doGet(req, resp)
  }

  @throws[IOException]
  @throws[ServletException]
  override protected def doGet(req: HttpServletRequest, resp: HttpServletResponse): Unit = {
    val requestDispatcher = req.getRequestDispatcher("views/add.jsp")
    requestDispatcher.forward(req, resp)
  }
}