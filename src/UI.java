public class UI{

    static readFile readFile = new readFile(); 
    public static void main(String[] args) {
        menuReadFile(); 

    }
    static public void menuReadFile(){
        System.out.println("¡Bienvenido al diccionario Español-Ingles-Frances!");
        System.out.println("\t Se está realizando la lectura de tu archivo, espera un momento...");
        readFile.readDictionary("C:\\Users\\ncast\\OneDrive\\Documentos\\Universidad\\Semestres\\Tercer Semestre\\Algoritmos y Estructura de Datos\\Hojas de Trabajo\\Hoja-de-trabajo-7\\src\\dictionary.txt");
        readFile.readDictionary("C:\\Users\\ncast\\OneDrive\\Documentos\\Universidad\\Semestres\\Tercer Semestre\\Algoritmos y Estructura de Datos\\Hojas de Trabajo\\Hoja-de-trabajo-7\\src\\userFile.txt");  
    }   
}
