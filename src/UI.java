public class UI{

    static readFile readFile = new readFile(); 
    public static void main(String[] args) {
        menuReadFile(); 

    }
    static public void menuReadFile(){
        System.out.println("\n¡Bienvenido al diccionario Español-Ingles-Frances!");
        System.out.println("\t Se está realizando la lectura de los archivos, espera un momento...");
        //lectura del txt de diccionario y el txt de oracion por traducir 
        readFile.readUITXT("C:\\Users\\ncast\\OneDrive\\Documentos\\Universidad\\Semestres\\Tercer Semestre\\Algoritmos y Estructura de Datos\\Hojas de Trabajo\\Hoja-de-trabajo-7\\src\\userFile.txt");  
        System.out.println("\nEstas son las palabras de diccionario registradas: ");
        readFile.printDictionary(readFile.readDictionary("C:\\Users\\ncast\\OneDrive\\Documentos\\Universidad\\Semestres\\Tercer Semestre\\Algoritmos y Estructura de Datos\\Hojas de Trabajo\\Hoja-de-trabajo-7\\src\\dictionary.txt"));
    }   
}
