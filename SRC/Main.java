package SRC;
import java.text.ParseException;
import java.util.LinkedList;
public class Main {
    static ManipuladorCSV manipuladorCSV;
    static ManipuladorListas manipuladorListas;
    static String ArchivoPersonas = "SRC/Personas.csv";
//    static String ArchivoPersonas = "Personas.csv";

    static LinkedList<Persona> listapersonas;
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menu();
    }
}
