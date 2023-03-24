import java.util.Scanner;

public class UI{

    static readFile readFile = new readFile(); 
    static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        menuReadFile(); 

    }
    static public void menuReadFile(){
        System.out.println("\n¡Bienvenido al diccionario Español-Ingles-Frances!");
        System.out.println("\t Se está realizando la lectura de los archivos, espera un momento...");
        //lectura del txt de diccionario y el txt de oracion por traducir 
        readFile.readUITXT("C:\\Users\\ncast\\OneDrive\\Documentos\\Universidad\\Semestres\\Tercer Semestre\\Algoritmos y Estructura de Datos\\Hojas de Trabajo\\Hoja-de-trabajo-7\\src\\userFile.txt");  
        readFile.readDictionary("C:\\Users\\ncast\\OneDrive\\Documentos\\Universidad\\Semestres\\Tercer Semestre\\Algoritmos y Estructura de Datos\\Hojas de Trabajo\\Hoja-de-trabajo-7\\src\\dictionary.txt");

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

                break; 
            case 2: 

                break; 
            case 3: 

                break; 
            case 4: 

                break; 
            case 5: 

                break; 
            case 6: 

                break; 

            default: 
                System.out.println("¡No se encuentra dentro de las opciones!");
                break; 
        }
    }   
}
