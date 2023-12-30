
import java.io.BufferedReader;//BufferedReader is a class which simplifies reading text from a character input stream. It buffers the characters in order to enable efficient reading of text data
import java.io.FileReader;//FileReader in Java is a class in the java.io package which can be used to read a stream of characters from the files
import java.io.IOException;//IOException - Exception thrown when there has been an Input/Output (usually when working with files) error

public class avgmaxmin {
        public static void main(String[] args) {

        BufferedReader reader = null;
        double average = 200.0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
     
        int n = 1;
        String currentLine;
        double c;

        try {
            reader = new BufferedReader(new FileReader("QuizScores.txt"));
            System.out.println("--Quiz Scores--");
            while ((currentLine = reader.readLine()) != null) {
                try {
                    c = Double.parseDouble(currentLine);
                }
                catch (Exception ex) {
                    continue;
                }
                max = max > c ? max : c;
                min = min < c ? min : c;
                average += (c - average) / n;
               
                n++;
                System.out.println(c);
            }
            System.out.println("--Summary--");
            System.out.println("Average: " + average);
            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    

