//package SRC;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class ManipuladorListas {
    public ManipuladorListas() {
    }

    public LinkedList<Persona> LeePersonas(LinkedList<String> LectorCsv) throws ParseException {
        System.out.println("Paso 0");
        LinkedList<Persona> listaPersonas= new LinkedList<>();
        System.out.println("Paso 1");
        for (String linea:LectorCsv) {
            System.out.println("Paso 2");
            String[] arr = linea.split(",");
            System.out.println("Paso 3");
            Direccion direccion = new Direccion(arr[5],arr[6],arr[7],arr[8]);
            System.out.println("Paso 4");
            System.out.println("Paso 5");
            Persona persona = new Persona(arr[0],arr[1],arr[2],arr[3],arr[4],direccion,arr[9],arr[10],arr[11]);
            System.out.println("Paso 6");
            listaPersonas.add(persona);
            System.out.println("Paso 7");
        }
        System.out.println("Paso 8");

        return listaPersonas;
    }
    public LinkedList<Veterinaria> LeeVeterinaria(LinkedList<String> LectorCsv){
        LinkedList<Veterinaria> listaVeterinarias = new LinkedList<>();
        for (String linea:LectorCsv){
            String[] arr = linea.split(",");
            Direccion direccion = new Direccion(arr[6],arr[7],arr[8],arr[9]);
            Horario horario = new Horario(arr[4],arr[5]);
            Veterinaria veterinaria = new Veterinaria(arr[0],arr[1],arr[2],arr[3],horario,direccion);
           listaVeterinarias.add(veterinaria);
        }
        return listaVeterinarias;
    }
    public LinkedList<Mascota> LeeMascota(LinkedList<String> LectorCsv) throws ParseException {
        LinkedList<Mascota> listaMascotas = new LinkedList<>();
        for (String linea:LectorCsv) {
            String[] arr = linea.split(",");
            Mascota mascota = new Mascota(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);
            listaMascotas.add(mascota);
        }
        return listaMascotas;
    }
}
