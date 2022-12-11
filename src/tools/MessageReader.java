package tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MessageReader {

    private String filename;
    private File myFile;
    private Scanner FileScanner;
    List<String> lineContainer = new ArrayList<String>();

    private Map<String, Integer> uniqueWords = new HashMap<>();
    public MessageReader() {

    }

    public void obtainFilename(String arguments[]){
//        if (arguments.length >= 1){
//            filename = arguments[0];
//        }
//        else{
//            Scanner inputReader = new Scanner(System.in);
//            System.out.println("Zadaj nazov suboru: ");
//            filename = inputReader.nextLine();
//        }


        filename = "zoznamStvoritelaFromArray.txt";
        System.out.println("Subor na spracovanie " + filename);
    }

    public void openAndRead(){
        try{
        myFile = new File(filename);
        FileScanner = new Scanner(myFile);

        while(FileScanner.hasNextLine()){
            lineContainer.add(FileScanner.nextLine());
        }
        }
        catch(FileNotFoundException e){
            System.out.println("Subor neexistuje.");
            e.printStackTrace();
        }

    }
     public void proccessMessage(){
        for (int i =0; i<lineContainer.size(); i++){
            String tmp = lineContainer.get(i);
            Integer count = uniqueWords.getOrDefault(tmp, 0);
            count +=1;
            uniqueWords.put(tmp, count);
        }
        System.out.print("Zoznam tvorov");
        uniqueWords.forEach((key, value)-> System.out.println(key + ":" + value));

     }


}
