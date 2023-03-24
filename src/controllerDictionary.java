import java.util.ArrayList;
import java.util.HashMap;

import javax.naming.spi.DirStateFactory.Result;

import BinaryTree.BinarySearchTree;

public class controllerDictionary {
    
    compareWords compare = new compareWords(); 
    extractMainWord mainWord = new extractMainWord<>(); 

    public BinarySearchTree addToBST(HashMap<String, ArrayList<String>> dictionary, int op){       

        BinarySearchTree bstree = new BinarySearchTree(compare,mainWord);

        switch(op){

            case 1: 
                for (String word : dictionary.keySet()) {

                    ArrayList<String> valueword = dictionary.get(word);
                    String enWord = valueword.get(0); 
                    bstree.insert(word, enWord);
                    
                }
                return bstree; 

            case 2: 
                for (String word : dictionary.keySet()) {

                    ArrayList<String> valueword = dictionary.get(word);
                    String fWord = valueword.get(1); 
                    bstree.insert(word, fWord);
                    
                }
                return bstree; 
            case 3: 
                for (String word : dictionary.keySet()) {

                    ArrayList<String> keyWords = dictionary.get(word); 
                    String spWord = keyWords.get(0); 
                    String engWord = mainWord.getKeyFromValue(spWord);

                    bstree.insert(spWord, engWord);
                    
                }
                return bstree; 
            case 4: 
                for (String word : dictionary.keySet()) {

                    ArrayList<String> keyWords = dictionary.get(word); 
                    String spWord = keyWords.get(0); 
                    String frenchWord = keyWords.get(1);

                    bstree.insert(spWord, frenchWord);
                    
                }
                return bstree;  
            case 5: 
                for (String word : dictionary.keySet()) {

                    ArrayList<String> keyWords = dictionary.get(word); 
                    String frenchWord = keyWords.get(1); 
                    String spanWord = keyWords.get(0); 

                    bstree.insert(frenchWord, spanWord);
                    
                }
                return bstree; 
            case 6: 
                for (String word : dictionary.keySet()) {

                    ArrayList<String> keyWords = dictionary.get(word); 
                    String fRWord = keyWords.get(1); 
                    String ENWord = mainWord.getKeyFromValue(fRWord);

                    bstree.insert(fRWord, ENWord);
 
        
                }
                return bstree; 

            default: 
                System.out.println("Ha ocurrido un problema :(");
                break; 

        }
        return null; 

    }
    public void lookForWord(ArrayList<String> userInput, BinarySearchTree bTree){
        String result = "";

        ArrayList<String> newUserInput = userInput; 
        for (int i = 0; i < userInput.size(); i++) {
            String word = userInput.get(i);
    
            if (bTree.search(word) != null){
                    String tradWord = bTree.search(word).toString();
                    newUserInput.set(i, tradWord); // Actualizar el valor original en userInput
    
            } else { //no lo encontró
                word = "*"+ word +"*";
                    newUserInput.set(i, word);
            }

            
        } 

        for (String element : newUserInput) {
            result += element + " ";
        }

        System.out.println(result);

    }
}
