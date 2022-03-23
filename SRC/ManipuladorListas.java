package SRC;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class ManipuladorListas {
    public LinkedList<Persona> LeePersonas(LinkedList<String> LectorCsv) throws ParseException {
        LinkedList<Persona> listaPersonas= new LinkedList<>();
        for (String linea:LectorCsv) {
            String[] arr = linea.split(",");
            Direccion direccion = new Direccion(arr[5],arr[6],arr[7],arr[8]);
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(arr[10]);
            Persona persona = new Persona(arr[0],arr[1],arr[2],arr[3],arr[4],direccion,arr[9],date,arr[11]);
            listaPersonas.add(persona);
        }
        return listaPersonas;
    }
    public LinkedList<Veterinaria> LeeVeterinaria(LinkedList<String> LectorCsv){
        LinkedList<Veterinaria> listaVeterinarias = new LinkedList<>();
        for (String linea:LectorCsv){
            String[] arr = linea.split(",");
            Direccion direccion = new Direccion(arr[5],arr[6],arr[7],arr[8]);
            Horario horario = new Horario();
            // TODO: Convertir a Veterinaria
        }
        return listaVeterinarias;
    }
    public LinkedList<Mascota> LeeMascota(LinkedList<String> LectorCsv){
        LinkedList<Mascota> listaMascotas = new LinkedList<>();
        // TODO: COnvertir a Mascotas
        return listaMascotas;
    }
}
