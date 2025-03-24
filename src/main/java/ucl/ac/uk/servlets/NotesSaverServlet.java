package ucl.ac.uk.servlets;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/saveNote")
public class NotesSaverServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String editing = request.getParameter("editing");

        if (editing != null && !editing.isEmpty()){
            File file = new File("data/" + editing + ".txt");
            if (file.exists()) {
                file.delete();
            }
        }

        String filePath = "data/" + title + ".txt";
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

        response.sendRedirect("notes?title=" + title);
    }
}
