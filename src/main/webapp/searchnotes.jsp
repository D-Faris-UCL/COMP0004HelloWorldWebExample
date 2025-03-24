<%@ page import="java.util.List" %>

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>File Search</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      max-width: 900px;
      margin: 0 auto;
      padding: 20px;
      color: #333;
    }

    .container {
      display: flex;
      flex-direction: column;
      gap: 20px;
    }

    .search-container {
      display: flex;
      gap: 10px;
      align-items: center;
    }

    #search-input {
      flex-grow: 1;
      padding: 10px;
      font-size: 16px;
      border: 1px solid #ddd;
      border-radius: 4px;
    }

    button {
      background-color: #4CAF50;
      color: white;
      padding: 10px 15px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      font-size: 16px;
    }

    button:hover {
      background-color: #45a049;
    }

    .sort-options {
      display: flex;
      gap: 15px;
      align-items: center;
      margin-bottom: 10px;
    }

    .sort-dropdown {
      position: relative;
      min-width: 180px;
    }

    .sort-select {
      width: 100%;
      padding: 10px;
      border: 1px solid #ddd;
      border-radius: 4px;
      background-color: white;
      font-size: 16px;
      cursor: pointer;
      appearance: none;
      -webkit-appearance: none;
      -moz-appearance: none;
      background-image: url("data:image/svg+xml;charset=UTF-8,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 24 24' fill='none' stroke='currentColor' stroke-width='2' stroke-linecap='round' stroke-linejoin='round'%3e%3cpolyline points='6 9 12 15 18 9'%3e%3c/polyline%3e%3c/svg%3e");
      background-repeat: no-repeat;
      background-position: right 10px center;
      background-size: 1em;
    }

    .file-list {
      border: 1px solid #ddd;
      border-radius: 4px;
      padding: 0;
      list-style-type: none;
      margin: 0;
    }

    .file-item {
      padding: 15px;
      border-bottom: 1px solid #eee;
      display: flex;
      justify-content: space-between;
      align-items: center;
    }

    .file-item:last-child {
      border-bottom: none;
    }

    .file-name {
      font-weight: bold;
    }

    .file-info {
      color: #777;
      font-size: 0.9em;
    }

    .home-link {
      display: inline-block;
      margin-bottom: 20px;
      color: #2196F3;
      text-decoration: none;
    }

    .home-link:hover {
      text-decoration: underline;
    }
  </style>
</head>
<body>
<div class="container">
  <a href="index.html" class="home-link"><- Back to Home</a>
  <h1>File Search</h1>
  <form action="search" method="GET">
        <div class="search-container">
          <input type="text" id="search-input" name="searchTerm" placeholder="Search for files...">
          <button id="search-button" type="submit">Search</button>
        </div>

        <div class="sort-options">
          <span>Sort by:</span>
          <div class="sort-dropdown">
            <select class="sort-select" id="sort-select" name="sortBy">
              <option value="name-asc">Name (A to Z)</option>
              <option value="name-desc">Name (Z to A)</option>
              <option value="date-desc">Date (Newest first)</option>
              <option value="date-asc">Date (Oldest first)</option>
            </select>
          </div>
        </div>
      </form>

  <ul class="file-list" id="results-list">
    <div>
      <% List<String> noteList = (List<String>)request.getAttribute("results");
      for(String note : noteList) {%>
        <li class="file-item">
            <a href="notes?title=<%=note%>" class="file-name"><%=note%></a>
        </li>
      <%}%>
    </div>
  </ul>
</div>
</body>
</html>