import com.guzman.departamentos.Direccion;
import com.guzman.departamentos.subacademica.Division;
import com.guzman.departamentos.subacademica.SubAcademica;

public class Main {
    public static void main(String[] args){
        registrarDireccion();
        registrarSubAcademica();
        registrarDivision();

    }

    public static void registrarDireccion(){
        Direccion direccion = new Direccion();
        direccion.setNombre("Dirección");
        direccion.setTipo("General");
        direccion.setNombrePuesto("Dr. Augusto Jimenez Cardenas");
        direccion.setEmail("direcciong101@teziutlan.tecnm.mx");
        direccion.setNumTelefonico("221 302 42 23");
        direccion.setNumEmpleados(1);
        direccion.setUbicacion("A");
        direccion.setHorario("Lunes a Sabado 8:00 a 14:00");

        String informacionDireccion = "Nombre del departamento: " + direccion.getNombre() + " " + direccion.getTipo()
                                    +  "\nNombre : " + direccion.getNombrePuesto()
                                    +  "\nEmail: " + direccion.getEmail()
                                    +  "\nNúmero de telefono: " + direccion.getNumTelefonico()
                                    +  "\nNúmero de personal: " + direccion.getNumEmpleados()
                                    +  "\nEdificio: " + direccion.getUbicacion()
                                    +  "\nHorario: " + direccion.getHorario() +"\n";

        System.out.println(informacionDireccion);

    }


    public static void registrarSubAcademica(){
        SubAcademica subAcademica = new SubAcademica();
        subAcademica.setNombre("Subdirección");
        subAcademica.setTipo("Académica");
        subAcademica.setNumSubareas(6);
        subAcademica.setNombrePuesto("Ing. Luis Antonio Velazquez Torales");
        subAcademica.setEmail("subdireccionA201@teziutlan.tecnm.mx");
        subAcademica.setNumTelefonico("221 356 56 45");
        subAcademica.setNumEmpleados(1);
        subAcademica.setUbicacion("B");
        subAcademica.setHorario("Lunes a Viernes  8:00 a 13:00");

        String informacionSubAcademica = "Nombre del departamento: " + subAcademica.getNombre() + " " + subAcademica.getTipo()
                +  "\nSubAreas : " + subAcademica.getNumSubareas()
                +  "\nNombre : " + subAcademica.getNombrePuesto()
                +  "\nEmail: " + subAcademica.getEmail()
                +  "\nNúmero de telefono: " + subAcademica.getNumTelefonico()
                +  "\nNúmero de personal: " + subAcademica.getNumEmpleados()
                +  "\nEdificio: " + subAcademica.getUbicacion()
                +  "\nHorario: " + subAcademica.getHorario()+"\n";

        System.out.println(informacionSubAcademica);
    }

    public static void registrarDivision() {
        Division division = new Division();
        division.setNombre("División");
        division.setNombreCarrera("Ingeniería Química");
        division.setEmail("divisonIngQ302@teziutlan.tecnm.mx");
        division.setNumTelefonico("221 567 34 23");
        division.setUbicacion("C");
        division.setModalidad('P');
        division.setNumSemestres(8);

        String informacionDivision = "Nombre del departamento: " + division.getNombre() + " de " + division.getNombreCarrera()
                + "\nEmial : " + division.getEmail()
                + "\nNúmero Telefonico : " + division.getNumTelefonico()
                + "\nEdificio: " + division.getUbicacion()
                + "\nModalidad: " + division.getModalidad()
                + "\nNúmero de Semestres: " + division.getNumSemestres()+"\n";

        System.out.println(informacionDivision);

    }
}
