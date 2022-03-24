package SRC;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion {
    public static final Pattern VALID_PHONE_ADDRESS_REGEX =
            Pattern.compile("^[0-9]{6,15}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_AGE_ADDRESS_REGEX =
            Pattern.compile("^[0-9]{0,3}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_CONSULTORIOS_ADDRESS_REGEX =
            Pattern.compile("^[1-4]{0,1}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static String normaliza(String pal){
        if (pal.isEmpty()){
            return "is empty";
        }
        if (pal.contains("\uDE88")||pal.contains("\uD835")){
            return "contains invalid characters";
        }
        if(pal.contains(" ")){
            String[] aux = pal.split(" ");
            pal ="";
            for (String auxiliar : aux) {
                if(auxiliar.length() >1){
                    pal= pal +" " + auxiliar;
                } else{
                    pal = pal + auxiliar;
                }
            }
        }
        pal = pal.toUpperCase();
        pal = pal.replace("á","a").replace("é","e").replace("í","i").replace("ó","o").replace("ú","u").replace("ñ","n");
        pal = pal.replaceAll("[^\\p{L}\\p{M}\\p{N}\\p{P}\\p{Z}\\p{Cf}\\p{Cs}\\s]",""); // Quita emojis
        pal = pal.trim();
        if (pal.isEmpty()){
            return "is empty";
        }
        return pal;
    }
    public boolean ValidacionPersona(Persona persona){
        if (persona ==null){
            return false;
        } else{
            if (!ValidacionNombre(persona.getNombres())) return false;
            if (!ValidacionNombre(persona.getApellidoPaterno())) return false;
            if (!ValidacionNombre(persona.getApellidoMaterno())) return false;
            if (!ValidacionNombre(persona.getCURP())) return false;
            if (persona.getDireccion()==null) return false;
            if (persona.getDireccion().getEstado() ==null) return false;
            if (persona.getDireccion().getCalle()==null) return false;
            if (persona.getDireccion().getNumero()==null)return false;
            if (persona.getDireccion().getCodigoPostal() ==null) return false;
            if (persona.getFechaNacimiento() == null) return false;
            if (!ValidacionTelefono(persona.getTelefono())) return false;
            if(!ValidacionEmail(persona.getEmail())) return false;
        }
        return true;
    }
    public boolean ValidacionMascota(Mascota mascota){
        if (mascota == null) return false;
        if (!ValidacionNombre(mascota.getNombre())) return false;
        if (!ValidacionEdad(mascota.getEdad())) return false;
        if (mascota.getFechaNacimiento()==null) return false;
        if (mascota.getPeso()==null) return false;
        if (!ValidacionNombre(mascota.getRaza())) return false;
        return true;
    }
    public boolean ValidacionVeterinaria(Veterinaria veterinaria){
        if (veterinaria==null) return false;
        if (!ValidacionNombre(veterinaria.getNombre()))return false;
        if (!ValidacionNombre(veterinaria.getApartado()))return false;
        if (veterinaria.getDireccion()==null) return false;
        if (veterinaria.getDireccion().getEstado() ==null) return false;
        if (veterinaria.getDireccion().getCalle()==null) return false;
        if (veterinaria.getDireccion().getNumero()==null)return false;
        if (veterinaria.getDireccion().getCodigoPostal() ==null) return false;
        if (!ValidacionConsultorios(veterinaria.getConsultorios())) return false;
        if (!ValidacionTelefono(veterinaria.getTelefono())) return false;
        if (veterinaria.getHorario()==null) return false;
        return true;
    }
    public boolean ValidacionNombre(String str){
        String strNormalizado = normaliza(str);
        if(strNormalizado.equals("isempty")||strNormalizado.equals("contains invalid characters")){
            return false;
        }
        return true;
    }
    public boolean ValidacionTelefono(String str){
        Matcher matcher = VALID_PHONE_ADDRESS_REGEX.matcher(str);
        return matcher.find();
    }
    public boolean ValidacionEmail(String str){
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(str);
        return matcher.find();
    }
    public boolean ValidacionEdad(String str){
        Matcher matcher = VALID_AGE_ADDRESS_REGEX.matcher(str);
        return matcher.find();
    }
    public boolean ValidacionConsultorios(String str){
        Matcher matcher = VALID_CONSULTORIOS_ADDRESS_REGEX.matcher(str);
        return matcher.find();
    }
}
