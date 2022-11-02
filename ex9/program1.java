import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Remove {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader fr = new FileReader("inputfile.txt"); 
        BufferedReader br = new BufferedReader(fr); 
        FileWriter fw = new FileWriter("outfile.txt"); 
        int c;
        //char[] ch = line.toCharArray();
     
        while((c = br.read()) != -1)
        { 
            if(c != 32){//ascii of space = 32
            fw.write(c);
            }

        }
        fr.close();
        fw.close();
    }

}