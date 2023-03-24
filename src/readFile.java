import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class readFile{

    public HashMap<String, ArrayList<String>> readDictionary(String path){
        
        HashMap<String, ArrayList<String>> diccionario = new HashMap<>();
        
        try (BufferedReader buffreader = new BufferedReader(new FileReader(path))) {
            String words;

            while ((words = buffreader.readLine()) != null) {
                String[] firstENWord = words.split(":");
                String firstWord = firstENWord[0];
                String[] trad = firstENWord[1].split(",");
                
                if (diccionario.containsKey(firstWord)) {
                    ArrayList<String> dictionaryList = diccionario.get(firstWord);

                    for (String t : trad) {
                        dictionaryList.add(t.trim());
                    }

                } else {
                    ArrayList<String> dictionaryList = new ArrayList<>();

                    for (String t : trad) {
                        dictionaryList.add(t.trim());
                    }

                    diccionario.put(firstWord, dictionaryList);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return diccionario;

    }
    public ArrayList<String> readUITXT(String path){
        ArrayList<String> wordsToTrad = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] wordsLine = line.split(" ");
                wordsToTrad.addAll(Arrays.asList(wordsLine));

            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        for (String palabra : wordsToTrad) {
            System.out.println(palabra);
        }

        return wordsToTrad;



    }

}