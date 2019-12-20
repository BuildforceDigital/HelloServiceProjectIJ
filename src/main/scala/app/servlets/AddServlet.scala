package app.servlets

import java.io.IOException

import app.entities.User
import app.model.Model
import javax.servlet.ServletException
import javax.servlet.http.{HttpServlet, HttpServletRequest, HttpServletResponse}


class AddServlet extends HttpServlet {
  @throws[ServletException]
  @throws[IOException]
  override protected def doGet(req: HttpServletRequest, resp: HttpServletResponse): Unit = {
    val requestDispatcher = req.getRequestDispatcher("views/add.jsp")
    requestDispatcher.forward(req, resp)
  }

  @throws[ServletException]
  @throws[IOException]
  override protected def doPost(req: HttpServletRequest, resp: HttpServletResponse): Unit = {
    val name = req.getParameter("name")
    def user = new User(name, req.getParameter("pass"))
    Model.add(user)
    req.setAttribute("userName", name)
    doGet(req, resp)
  }
}