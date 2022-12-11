package tools;
import com.company.zive_tvory.Tvor;
import java.io.File;  // Import the File class
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;

public class MessageWriter {

    private ArrayList<Tvor> poleTvorov;
    private int pocetTvorov;


    public MessageWriter( ArrayList<Tvor> poleTvorov) {

        this.poleTvorov = poleTvorov;
        this.pocetTvorov = poleTvorov.size();
    }

    public void WriteMessage(){
       try {
           FileWriter myWriter = new FileWriter("zoznamStvoritelaFromArray.txt");

        for(int i =0; i < pocetTvorov; i++){
            String tvor = poleTvorov.get(i).getClass().getSimpleName();
           myWriter.write(tvor + '\n');
        }
           myWriter.close();
           System.out.println("Tvory zapisane to suboru.");
       } catch (IOException e) {
           System.out.println("No ta chyba sa stala");
           e.printStackTrace();
       }
   }

}
