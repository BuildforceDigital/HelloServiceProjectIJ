package app.servlets

import java.io.IOException

import app.model.Model
import javax.servlet.ServletException
import javax.servlet.http.{HttpServlet, HttpServletRequest, HttpServletResponse}


class ListServlet extends HttpServlet {
  @throws[ServletException]
  @throws[IOException]
  override protected def doGet(req: HttpServletRequest, resp: HttpServletResponse): Unit = {
    req.setAttribute("userNames", Model.list)
    val requestDispatcher = req.getRequestDispatcher("views/list.jsp")
    requestDispatcher.forward(req, resp)
  }
}