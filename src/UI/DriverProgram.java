package UI;
import java.util.Scanner;

import Controller.compareWords;
import Controller.extractMainWord;
import Controller.controllerDictionary;
import Controller.readFile;
import Model.BinarySearchTree;


public class DriverProgram{

    static readFile readFile = new readFile(); 
    static Scanner sc = new Scanner(System.in); 
    static controllerDictionary cDicc = new controllerDictionary(); 

    static compareWords compare = new compareWords(); 
    static extractMainWord mainWord = new extractMainWord<>(); 
    static BinarySearchTree bstree = new BinarySearchTree(compare,mainWord);

    public static void main(String[] args) {
        menuUI(); 

    }
    /**
     * Metodo que muestra el menu al usuario 
     */
    static public void menuUI(){
        System.out.println("\n¡Bienvenido al diccionario Español-Ingles-Frances!");
        System.out.println("\t Se está realizando la lectura de los archivos, espera un momento...");
    
        String userFile = "src\\txt\\userFile.txt";  
        String dictionaryENG = "src\\txt\\dictionaryENG.txt";
        String dictionaryFR = "src\\txt\\dictionaryFR.txt";
        String dictionarySP = "src\\txt\\dictionarySP.txt";

        System.out.println("\n¿Cómo desea traducir su oración?");

        System.out.println("\t1. Inglés a español");
        System.out.println("\t2. Inglés a francés");
        System.out.println("\t3. Español a inglés");
        System.out.println("\t4. Español a fraces");
        System.out.println("\t5. Francés a español");
        System.out.println("\t6. Francés a inglés");
        System.out.println("\t7. Imprimir diccionario ordenado por palabras en ingles");

        int op = sc.nextInt();

        switch(op){

            case 1: 
                cDicc.translateWord(readFile.readUITXT(userFile), cDicc.addToBST(readFile.readDictionary(dictionaryENG), op));
                break; 
            case 2: 
                cDicc.translateWord(readFile.readUITXT(userFile), cDicc.addToBST(readFile.readDictionary(dictionaryENG), op));
                break; 
            case 3: 
                cDicc.translateWord(readFile.readUITXT(userFile), cDicc.addToBST(readFile.readDictionary(dictionarySP), op));
                break; 
            case 4: 
                cDicc.translateWord(readFile.readUITXT(userFile), cDicc.addToBST(readFile.readDictionary(dictionarySP), op));
                break; 
            case 5: 
                cDicc.translateWord(readFile.readUITXT(userFile), cDicc.addToBST(readFile.readDictionary(dictionaryFR), op));
                break; 
            case 6: 
                cDicc.translateWord(readFile.readUITXT(userFile), cDicc.addToBST(readFile.readDictionary(dictionaryFR), op));
                break;
            case 7: 
                System.out.println();
                bstree.printInOrder(readFile.readDictionary(dictionaryENG));
                System.out.println();
                break; 
            default: 
                System.out.println("¡No se encuentra dentro de las opciones!");
                break; 
        }
    }   
}
