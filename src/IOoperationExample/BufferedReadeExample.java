package IOoperationExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class BufferedReadeExample {
    public static void main(String[] args) {

        URL url = BufferedReadeExample.class.getResource("example.txt");
        File myfile = new File(url.getPath());

        try {
            System.out.println("create buffered reader");
            BufferedReader reader = new BufferedReader(new FileReader(myfile));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }//end while
        }//try
        catch (IOException e){
            System.out.println(e);
        }//catch
    }// psvm
}// class


// reference link: https://stackoverflow.com/questions/3844307/how-to-read-file-from-relative-path-in-java-project-java-io-file-cannot-find-th