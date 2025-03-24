package ucl.ac.uk.models;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class FileMiniIndex {
    public List<String> getNotes(){
        String folderPath = "data";
        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());

        List<String> fileNames = new ArrayList<>();
        for (File file : files) {
            if (file.isFile()) {
                String fileName = file.getName();
                fileNames.add(fileName.substring(0,fileName.lastIndexOf('.')));
            }
        }


        return fileNames;
    }
}
