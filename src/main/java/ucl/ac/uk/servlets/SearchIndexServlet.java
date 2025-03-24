package ucl.ac.uk.servlets;

import ucl.ac.uk.models.FileIndex;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class SearchIndexServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        // Code to use the model to process something would go here.
        String searchTerm = request.getParameter("searchTerm");
        String sortBy = request.getParameter("sortBy");

        if (searchTerm == null){
            searchTerm = "";
        }
        if (sortBy == null){
            sortBy = "";
        }

        FileIndex fileIndex = new FileIndex();
        List<String> results = fileIndex.searchFiles(searchTerm, sortBy);
        request.setAttribute("results", results);

        // Then forward to JSP.
        ServletContext context = getServletContext();
        RequestDispatcher dispatch = context.getRequestDispatcher("/searchnotes.jsp");
        dispatch.forward(request, response);
    }
}