package ucl.ac.uk.models;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Note {
    public String name = "";
    public String markdown = "";
    public String html = "";

    public Note(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getMarkdown(){
        return markdown;
    }

    public String getHtml(){
        return html;
    }

    private String markdownToHtml(String markdown){
        if (markdown == null || markdown.isEmpty()) {
            return "";
        }

        String[] lines = markdown.split("\n");

        StringBuilder htmlBuilder = new StringBuilder();

        for (String line : lines) {
            line = line.trim();

            if (line.isEmpty()) {
                htmlBuilder.append("<br>");

            } else if (line.startsWith("#")){
                int headerLevel = 0;

                while (headerLevel < line.length() && line.charAt(headerLevel) == '#') {
                    headerLevel++;
                }
                headerLevel = Math.min(headerLevel,6);

                String headerText = line.substring(headerLevel).trim();

                htmlBuilder.append("<h").append(headerLevel).append(">")
                        .append(headerText)
                        .append("</h").append(headerLevel).append(">\n");

            } else if (line.startsWith("![")) {
                int altTextBegin = 2;
                int altTextEnd = line.indexOf("](");

                htmlBuilder.append("<img alt=\"").append(line, altTextBegin, altTextEnd)
                        .append("\"");

                int urlBegin = altTextEnd + 2;
                int urlEnd = line.indexOf(")");

                htmlBuilder.append("src=\"").append(line, urlBegin, urlEnd)
                        .append("\">\n");

            } else{
                htmlBuilder.append("<p>").append(line).append("</p>\n");
            }
        }

        return htmlBuilder.toString();
    }

    public void readFile(String filename){
        try {
            String filePath = "data/" + filename + ".txt";
            markdown = Files.readString(Paths.get(filePath));
            html = markdownToHtml(markdown);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
