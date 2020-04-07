import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Discount", urlPatterns = "/discount")
public class Discount extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float price = Float.parseFloat(request.getParameter("price"));
        float percent = Float.parseFloat(request.getParameter("percent"));
        float amount = Integer.parseInt(request.getParameter("amount"));
        float discount = Float.parseFloat(request.getParameter("discount"));

        PrintWriter writer = response.getWriter();
        writer.println("<html><h1>Product Discount Calculator</h1>\n" +
                "  <form action=\"discount\" method=\"post\" style=\"border: 1px solid; width: 330px; height: 137px\">\n" +
                "    <table>\n" +
                "      <tr>\n" +
                "        <td>Price:</td>\n" +
                "        <td><p>"+price+"</p></td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td>Discount Percent:</td>\n" +
                "        <td><p>"+percent+"</p></td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td>Discount Amount:</td>\n" +
                "        <td><p>"+amount+"</p></td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td>Discount Price:</td>\n" +
                "        <td><p>"+discount+"</p></td>\n" +
                "      </tr>\n" +
                "    </table>\n" +
                "  </form></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
