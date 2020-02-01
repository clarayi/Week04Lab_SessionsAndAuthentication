package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 810783
 */
public class LoginServlet extends HttpServlet
{
    private HttpSession session;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("<<LoginServelt / In doGet method>>");
        
        session = request.getSession();
        
        String logoutClicked = request.getParameter("logout");
        
        if(logoutClicked == null)
        {
            session.removeAttribute("loggedInUserName");
            
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
        else
        {
            session.removeAttribute("loggedInUserName");
            
            request.setAttribute("resultMessage", "You have successfully logged out.");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("<<LoginServelt / In doPost method>>");
        
        session = request.getSession();
        
        String userName = request.getParameter("userNameInput");
        String password = request.getParameter("passwordInput");
        
        if(userName.equals(request)
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
