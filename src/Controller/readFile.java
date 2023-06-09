package Controller;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;



public class readFile{

    /**
     * Metodo para guardar las palabras del diccionario en el txt dentro de un hashmap
     * @param path Ubicacion del archivo 
     * @return Hashmap con valores del diccionario 
     */
    public HashMap<String, ArrayList<String>> readDictionary(String path) {
        HashMap<String, ArrayList<String>> diccionario = new HashMap<>();
    
        try (BufferedReader buffreader = new BufferedReader(new FileReader(path))) {

            String words;
    
            while ((words = buffreader.readLine()) != null) {
                // Separar la palabra en español y sus traducciones en español y francés
                String[] wordAndTranslations = words.split(":");
                // Verificar si la línea tiene el formato esperado
                if (wordAndTranslations.length != 2) {
                    System.out.println("La línea no tiene el formato esperado: " + words);
                    continue;
                }
                String enWord = wordAndTranslations[0];
                String[] translations = wordAndTranslations[1].split(",");
    
                // Si ya existe la palabra en el diccionario, añadir las traducciones a la lista existente
                if (diccionario.containsKey(enWord)) {
                    ArrayList<String> translationList = diccionario.get(enWord);
                    for (String translation : translations) {
                        translationList.add(translation.trim());
                    }
                }
                // Si no existe la palabra, crear una nueva lista y añadir las traducciones
                else {
                    ArrayList<String> translationList = new ArrayList<>();
                    for (String translation : translations) {
                        translationList.add(translation.trim());
                    }
                    diccionario.put(enWord, translationList);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        

        return diccionario;
        
    }
    /**
     * Metodo para leer la oracion ingresada por el usuario dentro del txt 
     * @param path Ubicacion del archivo 
     * @return Arraylist con oracion ingresada por usuario 
     */
    public ArrayList<String> readUITXT(String path){
        ArrayList<String> wordsToTrad = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = ""; 

            while ((line = br.readLine()) != null) {
                line = line.replace(".", "");
                String[] wordsLine = line.split(" ");
                wordsToTrad.addAll(Arrays.asList(wordsLine));
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return wordsToTrad;

    }    
}