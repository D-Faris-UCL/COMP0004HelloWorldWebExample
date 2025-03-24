package ucl.ac.uk.servlets;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class NotesDeleterServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        String filename = request.getParameter("file");

        File file = new File("data/" + filename + ".txt");
        if (file.exists()) {
            file.delete();
        }

        response.sendRedirect("index.html");
    }
}