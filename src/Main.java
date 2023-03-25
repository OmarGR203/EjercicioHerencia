import com.guzman.departamentos.Direccion;
import com.guzman.departamentos.subacademica.SubAcademica;

public class Main {
    public static void main(String[] args){

    }

    public static void registrarDireccion(){
        Direccion direccion = new Direccion();
        direccion.setNombre("Dirección");
        direccion.setTipo("General");
        direccion.setNombrePuesto("Director General");
        direccion.setEmail("direcciong101@teziutlan.tecnm.mx");
        direccion.setNumTelefonico("221 302 42 23");
        direccion.setNumEmpleados(1);
        direccion.setUbicacion("Edificio A");
        direccion.setHorario("Lunes a Sabado 8:00 a 14:00");
    }


    public static void registrarSubAcademica(){
        SubAcademica subAcademica = new SubAcademica();
        subAcademica.setNombre("Subdirección Academica");

    }
}
