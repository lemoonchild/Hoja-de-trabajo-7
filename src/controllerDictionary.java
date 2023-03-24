import java.util.ArrayList;
import java.util.HashMap;

import BinaryTree.BinarySearchTree;

public class controllerDictionary {
    
    public void addToBST(HashMap<String, ArrayList<String>> dictionary, int op){       

        compareWords compator = new compareWords(); 
        extractMainWord mainWord = new extractMainWord<>(); 

        BinarySearchTree bstree = new BinarySearchTree(compator,mainWord);

        switch(op){

            case 1: 
                for (String word : dictionary.keySet()) {

                    ArrayList<String> valueword = dictionary.get(word);
                    String enWord = valueword.get(0); 
                    bstree.insert(word, enWord);
                    
                }
                
                break; 
            case 2: 
                for (String word : dictionary.keySet()) {

                    ArrayList<String> valueword = dictionary.get(word);
                    String fWord = valueword.get(1); 
                    bstree.insert(word, fWord);
                    
                }
                break; 
            case 3: 
                for (String word : dictionary.keySet()) {

                    ArrayList<String> keyWords = dictionary.get(word); 
                    String spWord = keyWords.get(0); 
                    String engWord = mainWord.getKeyFromValue(spWord);

                    bstree.insert(spWord, engWord);
                    
                }
                break; 
            case 4: 
                for (String word : dictionary.keySet()) {

                    ArrayList<String> keyWords = dictionary.get(word); 
                    String spWord = keyWords.get(0); 
                    String frenchWord = keyWords.get(1);

                    bstree.insert(spWord, frenchWord);
                    
                }
                break; 
            case 5: 
                for (String word : dictionary.keySet()) {

                    ArrayList<String> keyWords = dictionary.get(word); 
                    String frenchWord = keyWords.get(1); 
                    String spanWord = keyWords.get(0); 

                    bstree.insert(frenchWord, spanWord);
                    
                }
                break; 
            case 6: 
                for (String word : dictionary.keySet()) {

                    ArrayList<String> keyWords = dictionary.get(word); 
                    String fRWord = keyWords.get(1); 
                    String ENWord = mainWord.getKeyFromValue(fRWord);

                    bstree.insert(fRWord, ENWord);
 
        
                }
                break; 

            default: 
                System.out.println("Ha ocurrido un problema :()");
                break; 

        }

    }
    public void lookForWord(ArrayList<String> userInput){
        
        

    }
}
