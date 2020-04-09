import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Discount", urlPatterns = "/discount")
public class Discount extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float price = Float.parseFloat(request.getParameter("price"));
        float percent = Float.parseFloat(request.getParameter("percent"));
        float amount = Integer.parseInt(request.getParameter("amount"));
        float discount = Float.parseFloat(request.getParameter("discount"));

        request.setAttribute("price", price);
        request.setAttribute("percent", percent);
        request.setAttribute("amount", amount);
        request.setAttribute("discount", discount);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("info.jsp");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
