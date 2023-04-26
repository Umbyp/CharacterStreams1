package characterstream;

import java.io.*;

public class LAB3 {
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter("data.txt");
            output.println("Harry Potter");
            output.println(19);
            output.println(50.5);
            output.println(175.0);
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
