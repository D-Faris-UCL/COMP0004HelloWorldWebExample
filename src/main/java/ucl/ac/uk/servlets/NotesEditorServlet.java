package ucl.ac.uk.servlets;

import ucl.ac.uk.models.Note;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/editor")
public class NotesEditorServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        // Code to use the model to process something would go here
        String fileEdit = request.getParameter("editing");
        String title = "";
        String content = "";

        if (fileEdit != null && !fileEdit.isEmpty()) {
            Note note = new Note(fileEdit);
            note.readFile(fileEdit);
            title = note.name;
            content = note.markdown;
        }

        request.setAttribute("title", title);
        request.setAttribute("content", content);

        // Then forward to JSP.
        ServletContext context = getServletContext();
        RequestDispatcher dispatch = context.getRequestDispatcher("/noteseditor.jsp");
        dispatch.forward(request, response);
    }
}