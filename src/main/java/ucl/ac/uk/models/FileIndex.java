package ucl.ac.uk.models;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class FileIndex {
    File[] files;

    public FileIndex(){
        getFiles();
    }

    private void getFiles(){
        String folderPath = "data";
        File folder = new File(folderPath);
        files = folder.listFiles();
    }

    public List<String> searchFiles(String searchTerm, String sortBy){
        List<String> matchingFiles = new ArrayList<>();

        switch (sortBy){
            case "name-asc":
                break;
            case "name-desc":
                for (int i = 0; i < files.length / 2; i++) {
                    File temp = files[i];
                    files[i] = files[files.length - 1 - i];
                    files[files.length - 1 - i] = temp;
                }
                break;
            case "date-desc":
                Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());
                break;
            case "date-asc":
                Arrays.sort(files, Comparator.comparingLong(File::lastModified));
                break;
        }

        for (File file: files){
            try {
                String content = Files.readString(file.toPath()).toLowerCase();
                String filename = file.getName();
                if (filename.toLowerCase().contains(searchTerm.toLowerCase()) ||
                        content.toLowerCase().contains(searchTerm.toLowerCase())){
                    matchingFiles.add(filename.substring(0,filename.lastIndexOf('.')));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return matchingFiles;
    }
}
