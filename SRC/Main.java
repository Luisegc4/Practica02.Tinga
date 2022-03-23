//package SRC;
import java.text.ParseException;
import java.util.LinkedList;
public class Main {
    static ManipuladorCSV manipuladorCSV;
    static ManipuladorListas manipuladorListas;
    static String ArchivoPersonas = "Personas.csv";
    static LinkedList<Persona> listapersonas;
    public static void main(String[] args) {
        manipuladorCSV = new ManipuladorCSV();
        manipuladorListas = new ManipuladorListas();
        listapersonas = new LinkedList<>();
        try {
            LinkedList<String> listaaux=manipuladorCSV.LeeArchivoCsv(ArchivoPersonas);
            listapersonas= manipuladorListas.LeePersonas(listaaux);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (Persona persona:listapersonas) {
            System.out.println(persona.toString());
        }
    }
}
