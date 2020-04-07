import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Translate", urlPatterns = "/translate")
public class Translate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> Word_List = new HashMap<>();
        Word_List.put("hello", "Xin chào");
        Word_List.put("eat","ăn");

        String word = request.getParameter("word");
        PrintWriter writer= response.getWriter();
        writer.println("<html>");
        if (Word_List.containsKey(word)){
            writer.println("Word: "+ word);
            writer.println("Meaning: "+ Word_List.get(word));
        }else {
            writer.println("not found");
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
