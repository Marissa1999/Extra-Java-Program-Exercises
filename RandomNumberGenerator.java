
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ghaderps
 */
public class RandumNumberGeneration {
    
    public static void main(String[] args) throws IOException
    {
        // Let's write code to write to a file name abc.txt
        //PrintWriter pw = new PrintWriter("P:\\Java1\\abc.txt");
        FileWriter fw = new FileWriter("P:\\Java1\\abc.txt", true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Dear Friend, this is my first use of writing to a file");
        pw.println("Dear Friend, this is my second use of writing to a file");
        pw.println("Dear Friend, this is my third use of writing to a file");
        pw.close();
        
        
        
        
        /*
        Random rand = new Random();
        for(int k = 1; k <= 10; ++k)
        {
            int x = rand.nextInt(100);  // 0 <= x <= 99
            int y = x  + 5;             // 5 <= y <= 94
            System.out.printf("%10d\n", x);
        }
        
        // to generate a number in the range [low, high]
        int x = rand.nextInt(high - low + 1) + low;  // low <= x <= high
        */
    }
    
}
