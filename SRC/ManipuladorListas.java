package SRC;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class ManipuladorListas {
    public ManipuladorListas() {
    }

    public LinkedList<Persona> LeePersonas(LinkedList<String> LectorCsv) throws ParseException {
        LinkedList<Persona> listaPersonas= new LinkedList<>();
        for (String linea:LectorCsv) {
            String[] arr = linea.split(",");
            System.out.println(arr.length);
//            for (String str:arr) {
//                System.out.print(str +"-");
//            }
            Direccion direccion = new Direccion(arr[5],arr[6],arr[7],arr[8]);
            Persona persona = new Persona(arr[0],arr[1],arr[2],arr[3],arr[4],direccion,arr[9],arr[10],arr[11]);
            listaPersonas.add(persona);
        }


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
    public LinkedList<String> PersonasAString(LinkedList<Persona>listapersonas){
        LinkedList<String> listaAescribir = new LinkedList<>();
        for (Persona personas:listapersonas) {
            listaAescribir.add(personas.toString());
        }
        return listaAescribir;
    }
    public LinkedList<String> VeterinariasAString(LinkedList<Veterinaria>listapersonas){
        LinkedList<String> listaAescribir = new LinkedList<>();
        for (Veterinaria veterinaria:listapersonas) {
            listaAescribir.add(veterinaria.toString());
        }
        return listaAescribir;
    }
    public LinkedList<String> MascotasAString(LinkedList<Mascota>listapersonas){
        LinkedList<String> listaAescribir = new LinkedList<>();
        for (Mascota mascotas:listapersonas) {
            listaAescribir.add(mascotas.toString());
        }
        return listaAescribir;
    }

}
