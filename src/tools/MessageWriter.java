package tools;
import com.company.zive_tvory.Tvor;
import java.io.File;  // Import the File class
import java.io.IOException;
import java.io.FileWriter;

public class MessageWriter {

    private Tvor[] poleTvorov;
    private int pocetTvorov;


    public MessageWriter(Tvor[] poleTvorov, int pocetTvorov) {
        this.poleTvorov = poleTvorov;
        this.pocetTvorov = pocetTvorov;
    }

    public void WriteMessage(){
       try {
           FileWriter myWriter = new FileWriter("zoznamStvoritelaFromArray.txt");

        for(int i =0; i < pocetTvorov; i++){
            String tvor = poleTvorov[i].getClass().getSimpleName();
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
