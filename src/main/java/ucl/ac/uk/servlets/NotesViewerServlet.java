package ucl.ac.uk.servlets;

import ucl.ac.uk.models.Note;
import ucl.ac.uk.models.FileMiniIndex;

import java.io.*;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/notes")
public class NotesViewerServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        // Code to use the model to process something would go here.
        String title = request.getParameter("title");
        if (title == null || title.isEmpty()) {
            response.getWriter().write("Invalid file request.");
            return;
        }

        Note note = new Note(title);
        note.readFile(title);
        request.setAttribute("note", note);

        FileMiniIndex fileMiniIndex = new FileMiniIndex();
        List<String> noteList = fileMiniIndex.getNotes();
        request.setAttribute("noteList", noteList);

        // Then forward to JSP.
        ServletContext context = getServletContext();
        RequestDispatcher dispatch = context.getRequestDispatcher("/notesviewer.jsp");
        dispatch.forward(request, response);
    }
}