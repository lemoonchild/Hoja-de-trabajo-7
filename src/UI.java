import java.util.Scanner;

public class UI{

    static readFile readFile = new readFile(); 
    static Scanner sc = new Scanner(System.in); 
    static controllerDictionary cDicc = new controllerDictionary(); 
    public static void main(String[] args) {
        menuReadFile(); 

    }
    static public void menuReadFile(){
        System.out.println("\n¡Bienvenido al diccionario Español-Ingles-Frances!");
        System.out.println("\t Se está realizando la lectura de los archivos, espera un momento...");
    
        String userFile = "src\\userFile.txt";  
        String dictionaryENG = "src\\dictionaryENG.txt";
        String dictionaryFR = "src\\dictionaryFR.txt";
        String dictionarySP = "src\\dictionarySP.txt";

        System.out.println("\n¿Cómo desea traducir su oración?");

        System.out.println("\t1. Inglés a español");
        System.out.println("\t2. Inglés a francés");
        System.out.println("\t3. Español a inglés");
        System.out.println("\t4. Español a fraces");
        System.out.println("\t5. Francés a español");
        System.out.println("\t6. Francés a inglés");

        int op = sc.nextInt();

        switch(op){

            case 1: 
                
                cDicc.lookForWord(readFile.readUITXT(userFile), cDicc.addToBST(readFile.readDictionary(dictionaryENG), op));
                break; 
            case 2: 
                cDicc.lookForWord(readFile.readUITXT(userFile), cDicc.addToBST(readFile.readDictionary(dictionaryENG), op));
                break; 
            case 3: 
                cDicc.lookForWord(readFile.readUITXT(userFile), cDicc.addToBST(readFile.readDictionary(dictionarySP), op));
                break; 
            case 4: 
                cDicc.lookForWord(readFile.readUITXT(userFile), cDicc.addToBST(readFile.readDictionary(dictionarySP), op));
                break; 
            case 5: 
                cDicc.lookForWord(readFile.readUITXT(userFile), cDicc.addToBST(readFile.readDictionary(dictionaryFR), op));
                break; 
            case 6: 
                cDicc.lookForWord(readFile.readUITXT(userFile), cDicc.addToBST(readFile.readDictionary(dictionaryFR), op));
                break; 

            default: 
                System.out.println("¡No se encuentra dentro de las opciones!");
                break; 
        }
    }   
}
