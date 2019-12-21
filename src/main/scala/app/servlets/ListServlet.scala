package app.servlets

import java.io.IOException

import app.model.Model
import javax.servlet.ServletException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.{HttpServlet, HttpServletRequest, HttpServletResponse}

@WebServlet(Array("/list"))
class ListServlet extends HttpServlet {

  @throws[IOException]
  @throws[ServletException]
  override protected def doGet(req: HttpServletRequest, resp: HttpServletResponse): Unit = {
    req.setAttribute("userNames", Model.userList)
    val requestDispatcher = req.getRequestDispatcher("views/list.jsp")
    requestDispatcher.forward(req, resp)
  }
}