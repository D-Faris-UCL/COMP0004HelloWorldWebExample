<%@ page import="ucl.ac.uk.models.Note" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>${note.name}</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
      height: 100vh;
      display: flex;
    }

    p, h1, h2, h3, h4, h5, h6 {
      margin: 0;
    }

    img {
      display: block;
      margin-left: auto;
      margin-right: auto;
      max-width: 50%;
    }

    #noteIndex {
      width: 200px;
      padding: 20px;
      overflow-y: auto;
    }

    #note {
      flex: 1;
      padding: 20px;
    }

    #content {
      border: 1px solid #ddd;
      border-radius: 8px;
      margin-top: 15px;
      padding: 20px;
      background-color: #f9f9f9;
    }
    .home-link {
      display: inline-block;
      margin-bottom: 10px;
      margin-top: -10px;
      color: #2196F3;
      text-decoration: none;
    }

    .home-link:hover {
      text-decoration: underline;
    }

    .nav-link {
      display: block;
      padding: 15px;
      color: #333;
      text-decoration: none;
      border-bottom: 1px solid #ddd;
    }

    .nav-link:hover {
      background-color: #ddd;
    }

    .edit-button {
      border: 1px solid #ddd;
      background-color: #2196F3;
      color: white;
      padding: 4px 0px;
      border-radius: 4px;
      font-size: 16px;
      transition: background-color 0.3s;
    }

    .edit-button:hover {
      background-color: #0b7dda;
    }

    .delete-button {
      border: 1px solid #ddd;
      background-color: #EA6060;
      color: white;
      padding: 4px 0px;
      border-radius: 4px;
      font-size: 16px;
      transition: background-color 0.3s;
    }

    .delete-button:hover {
      background-color: #101010;
    }
  </style>
</head>
<body>

  <div id="noteIndex">
  <a href="index.html" class="home-link">Home</a>
    <h3>Navigation</h3>
    <br>
    <div>
      <% List<String> noteList = (List<String>)request.getAttribute("noteList");
      for(String note : noteList) {%>
        <a href="notes?title=<%=note%>" class="nav-link"><%=note%></a>
      <%}%>
    </div>
    <a href="editor" class="nav-link"><b>+ Create new note</b></a>
  </div>

  <div id="note">
    <div style="display:flex; width=100%; justify-content: space-between">
        <div style="flex: 1"><h1>${note.name}</h1></div>
        <div style="display: flex; gap:5px">
          <a href="editor?editing=${note.name}" class="edit-button"><img src="img/edit white.png"></a>
          <a href="delete?file=${note.name}" class="delete-button"><img src="img/delete white.png"></a>
        </div>
    </div>
    <div id="content">
        ${note.html}
    </div>
    <br>
  </div>
</body>
</html>