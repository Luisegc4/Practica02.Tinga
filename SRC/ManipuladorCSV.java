package SRC;

import java.io.*;
import java.util.LinkedList;

public class ManipuladorCSV {
    /**
    * Metodo que lee un archivo Csv y guarda cada linea de este en una LinkedList<String>
    * @param ArchivoCsv con el nombre del archivo a leer
    * @return LinkedList<String> con cada linea del ArchivoCsv
    *  */
    public LinkedList<String> LeeArchivoCsv(String ArchivoCsv){
        LinkedList<String> lista = new LinkedList<>();
        BufferedReader bufferLectura = null;
        try {

            bufferLectura = new BufferedReader(new FileReader( ArchivoCsv));
            String linea1 = bufferLectura.readLine();
            while (linea1 != null) {
                lista.add(linea1);
                linea1 = bufferLectura.readLine();
            }
        }catch (IOException e) {
            e.printStackTrace();
            System.out.println("Usted sera redirigido al menu");
        }
        finally {
            if (bufferLectura != null) {
                try {
                    bufferLectura.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Usted sera redirigido al menu");
                }
            }
        }
        return lista;
    }

    /**
     * Metodo que escribe un Csv pasandole una LinkedList
     * @param listaAEscribir con el nombre del archivo a guardar
     * @param ArchivoDondeSeGuarda lista con las lineas en String que se escribiran en el csv
     * @return String con el archivo donde se guarda la lista
     *  */
    public String EscribeCsv(LinkedList<String> listaAEscribir,String ArchivoDondeSeGuarda){
        BufferedWriter bw ;
        String Nombre = ArchivoDondeSeGuarda;
        try{
            bw = new BufferedWriter(new FileWriter(Nombre));
            for (String str: listaAEscribir) {
                bw.write(str);
                bw.newLine();
            }
            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Usted sera redirigido al menu");
        }
        return Nombre;
    }
}
