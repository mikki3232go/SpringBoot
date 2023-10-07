package shop.mtcoding.web444.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.activation.ActivationGroup_Stub;

@WebServlet("*.do")
public class FrontController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("FrontController : service");
        String httpMethod = req.getMethod();
        System.out.println("method: " + httpMethod);
        String action = req.getRequestURI();
        System.out.println("action : " + action);
        //resp.setHeader("Content-Type","text/plain");
        //PrintWriter pw = resp.getWriter();
        //pw.println("<h1>Hello</h1>");
        if(action.equals("/board.do")){
        //302
            // resp.setStatus(302);
            //resp.setHeader("location","board.jsp");
            req.setAttribute("username","ssar");
            //내부 forwarding
            req.getRequestDispatcher("./WEB-INF/views/board.jsp").forward(req,resp );
        }
        else if (action.equals("/user.do")){
            HttpSession session = req.getSession();
            session.setAttribute("email" ,"ssar@nate.com"); //
          //  resp.sendRedirect("./WEB-INF/views/user.jsp"); //resp.serHeader("location","user.jsp");
            req.getRequestDispatcher("./WEB-INF/views/user.jsp");
        }
        else
        {
            resp.setStatus(404);
            resp.setHeader("Content-Type","text/html;charset=utf-8");
            PrintWriter pw = resp.getWriter();
            pw.println("<h1>404 Not found</h1>");

        }

    }
}
