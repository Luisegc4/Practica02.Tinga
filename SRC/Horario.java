//package SRC;
public class Horario {
    String HoraInicio;
    String HoraFin;

    public Horario(String horaInicio, String horaFin) {
        HoraInicio = horaInicio;
        HoraFin = horaFin;
    }

    public Horario() {
    }

    public String getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(String horaInicio) {
        HoraInicio = horaInicio;
    }

    public String getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(String horaFin) {
        HoraFin = horaFin;
    }

    @Override
    public String toString() {
        return HoraFin +","+ HoraFin;
    }
}
