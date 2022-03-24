package SRC;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    String ArchivoPersonas;
    String ArchivoMascotas;
    String ArchivoVeterinarias;
    ManipuladorCSV manipuladorCSV;
    ManipuladorListas manipuladorListas;
    Scanner scanner;
    public Menu() {
        String Path = "SRC/";
//        String Path = "";
        ArchivoMascotas =Path+"Mascotas.csv";
        ArchivoPersonas = Path+"Personas.csv";
        ArchivoVeterinarias =Path+ "Veterinarias.csv";
        manipuladorCSV = new ManipuladorCSV();
        manipuladorListas = new ManipuladorListas();
        scanner = new Scanner(System.in);
    }

    public void menu(){
        int entrada=0;
        int seleccion =0;
        String instancia="";
        int indice=0;
        LinkedList lista;
        System.out.println("Ah continuacion se le presentara el menu: \n" +
                "Teclee la opcion de su preferencia: \n" +
                "1.- Visualizar \n" +
                "2.- Modificar \n" +
                "3.- Agregar \n" +
                "4.- Eliminar \n" +
                "5.-Salir"
        );try{
            entrada = scanner.nextInt();
        }catch(java.util.InputMismatchException i){
            System.out.println("Usted no ha introducido un entero\n" +
                    "Sera redirigido al menu");
            menu();

        }
        if(entrada>5||entrada<1){
            System.out.println("El Entero que introdujo no esta en rango, favor de introducir uno entre 1 y 4 \n"
                    + "Porfavor lee las instrucciones");
            menu();
        }
        switch (entrada){
            case 1:
                lista =menuEntidades("Visualizar");
                instancia = Visualizar(lista);
                menu();
                break;
            case 2:
                lista =menuEntidades("Modificar");
                instancia = Visualizar(lista);
                indice = Seleccion();
                menu();
                break;
            case 3:
                lista =menuEntidades("Agregar");
                instancia = Visualizar(lista);
                indice = Seleccion();
                switch (instancia){
                    case "Persona":
                        lista.remove(indice);
                        manipuladorCSV.EscribeCsv(manipuladorListas.PersonasAString(lista),ArchivoPersonas);
                        break;
                    case "Mascota":
                        lista.remove(indice);
                        manipuladorCSV.EscribeCsv(manipuladorListas.MascotasAString(lista),ArchivoMascotas);
                        break;
                    case "Veterinaria":
                        lista.remove(indice);
                        manipuladorCSV.EscribeCsv(manipuladorListas.VeterinariasAString(lista),ArchivoVeterinarias);
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        menu();
                        break;
                }
                menu();

                break;
            case 4:
                lista =menuEntidades("Eliminar");
                instancia = Visualizar(lista);
                indice = Seleccion();
                menu();

                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("El Entero que introdujo no esta en rango, favor de introducir uno entre 1 y 4 \n"
                        + "Porfavor lee las instrucciones");
                menu();
                break;
        }
    }
    public LinkedList menuEntidades(String seleccion){
        Scanner scanner = new Scanner(System.in);
        int entrada=0;
        System.out.println("Sobre cual de las opcion quiere: "+seleccion+"\n"+
                "1.-Dueños\n"+ "2.-Mascotas\n"+"3.-Veterinarias");
        try{
            entrada = scanner.nextInt();
        }catch(java.util.InputMismatchException i){
            System.out.println("Usted no ha introducido un entero\n" +
                    "Sera redirigido al menu");
            menuEntidades(seleccion);
        }
        if(entrada>4||entrada<1){
            System.out.println("El Entero que introdujo no esta en rango, favor de introducir uno entre 1 y 3 \n"
                    + "Porfavor lee las instrucciones");
            menuEntidades(seleccion);
        }
        try{
            switch (entrada){
                case 1:
                    LinkedList<Persona> listaPersona=manipuladorListas.LeePersonas(manipuladorCSV.LeeArchivoCsv(ArchivoPersonas));
                    return listaPersona;
                case 2:
                    LinkedList<Mascota> listaMascota=manipuladorListas.LeeMascota(manipuladorCSV.LeeArchivoCsv(ArchivoMascotas));
                    return listaMascota;
                case 3:
                    LinkedList<Veterinaria> listaVeterinaria=manipuladorListas.LeeVeterinaria(manipuladorCSV.LeeArchivoCsv(ArchivoVeterinarias));
                    return listaVeterinaria;
                case 4:
                    System.out.println("Usted Regresara al menu");
                    menu();
                    break;
                default:
                    System.out.println("Selecciono una opcion invalida, regresara al menu");
                    menu();
                    break;
            }
        }catch(ParseException e){
            System.out.println("No se pudo completar la operacion");
            menu();
        }

        return null;
    }
    public String getInstanceof(LinkedList lista){
        String cad="";
        Persona persona= new Persona();
        Mascota mascota = new Mascota();
        Veterinaria veterinaria = new Veterinaria();
        try{
            persona = (Persona)lista.getFirst();
            cad = "Persona";
        }catch(Exception e){
            try{
                mascota = (Mascota)lista.getFirst();
                cad = "Mascota";
            }catch(Exception i){
                try{
                    veterinaria = (Veterinaria) lista.getFirst();
                    cad = "Veterinaria";
                }catch(Exception o){
                    System.out.println("No es un objeto valido");
                }
            }
        }
        return cad;
    }
    public String Visualizar(LinkedList lista){
        String instancia = getInstanceof(lista);
        int contador =0;
        System.out.println("Ha continuacion se mostrara las " + instancia + "s");
        System.out.println(" ");
        switch (instancia){
            case "Persona":
                for (Persona persona:(LinkedList<Persona>)lista){
                    System.out.println(contador + ": " + persona.toString());
                    contador++;
                }
                break;
            case "Mascota":
                for (Mascota mascota:(LinkedList<Mascota>)lista){
                    System.out.println(contador + ": " + mascota.toString());
                    contador++;
                }
                break;
            case "Veterinaria":
                for (Veterinaria veterinaria:(LinkedList<Veterinaria>)lista){
                    System.out.println(contador + ": " + veterinaria.toString());
                    contador++;
                }
                break;
        }
        return instancia;
    }
    public int Seleccion(){
        System.out.println("Seleccione una de las opciones anteriores, eligiendo su indice:");
        int entrada;
        try{
            entrada = scanner.nextInt();
        }catch(Exception e){
            System.out.println("La opcion elegida es invalida, intente denuevo:");
            entrada =Seleccion();
        }
        return entrada;
    }
}
