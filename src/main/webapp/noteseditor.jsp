<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Editor</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      max-width: 800px;
      margin: 0 auto;
      padding: 20px;
    }

    .container {
      display: flex;
      flex-direction: column;
      gap: 20px;
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

    label {
      font-weight: bold;
      display: block;
      margin-bottom: 5px;
    }

    #title {
      width: 100%;
      padding: 8px;
      font-size: 16px;
      border: 1px solid #ccc;
      border-radius: 4px;
    }

    #markdown-content {
      width: 100%;
      height: 300px;
      padding: 8px;
      font-size: 16px;
      border: 1px solid #ccc;
      border-radius: 4px;
      font-family: monospace;
    }

    #save-button {
      background-color: #4CAF50;
      color: white;
      padding: 10px 15px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      font-size: 16px;
      align-self: flex-start;
    }

    #save-button:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>
  <a href="index.html" class="home-link"><- Back to Home</a>
  <div class="container">
    <h1>Notes Editor</h1>

    <form action="saveNote?editing=${title}" method="POST">
        <div>
          <label for="title">Title:</label>
          <input type="text" id="title" name="title" placeholder="Enter title here" value="${title}">
        </div>
        <br>
        <div>
          <label for="markdown-content">Markdown Content:</label>
          <textarea id="markdown-content" name="content" placeholder="Write your markdown here...">${content}</textarea>
        </div>
        <br>
        <button type="submit" id="save-button">Save File</button>
    </form>
  </div>
</body>
</html>