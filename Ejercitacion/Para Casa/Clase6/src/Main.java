import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


/**
 *
 * 5)	Diseñamos un sistema de gestión de empleados donde la clase Empleado encapsula la información
 * de cada trabajador. La clase Departamento gestiona una lista de empleados, utilizando modificadores
 * de acceso adecuados. La clase Empresa contiene varios departamentos y utiliza variables y métodos
 * estáticos para realizar un seguimiento del número total de empleados en toda la empresa, destacando así
 * el uso de miembros estáticos en la gestión global de la información. En el programa principal, creamos
 * instancias de la empresa, agregamos departamentos y empleados, realizamos operaciones y mostramos el número
 * total de empleados utilizando los métodos estáticos de la clase Empresa.
 */
       //EMPLEADOS
       //Creo 2 empleados para depto de sistemas.
        Empleado empleado1 = new Empleado(1, "Juan", "Casas", "21543123", 1000, "Developer");
        Empleado empleado2 = new Empleado(2, "Ernesto", "Flores", "22344123", 1200, "Developer");

        //Armo lista de empleados.
        List<Empleado> listaEmpleados1 = new ArrayList<Empleado>();

        //Asigno empleados a la lista de empleados
        listaEmpleados1.add(empleado1);
        listaEmpleados1.add(empleado2);

        /*-----------------------------------------------------------------------------------------------*/
        //EMPLEADOS
        //Creo 2 empleados para depto de contabilidad
        Empleado empleado3 = new Empleado(1, "Jose", "Caminos", "24443123", 3000, "Developer");
        Empleado empleado4 = new Empleado(2, "Ernesto", "Tenembaum", "27774123", 1500, "Developer");

        //Armo lista de empleados.
        List<Empleado> listaEmpleados2 = new ArrayList<Empleado>();

        //Asigno empleados a la lista de empleados
        listaEmpleados2.add(empleado3);
        listaEmpleados2.add(empleado4);

        /*-----------------------------------------------------------------------------------------------*/
        //DEPARTAMENTOS
        //Creo 2 departamentos.
        Departamento departamento1 = new Departamento(1, "Sistemas");
        Departamento departamento2 = new Departamento(2, "Contabilidad");

        //Armo lista de departamentos.
        List<Departamento> listaDepartamentos = new ArrayList<Departamento>();

        //Agrego departamentos a la lista de departamentos.
        listaDepartamentos.add(departamento1);
        listaDepartamentos.add(departamento2);

        //Asigno empleados al departamento1 los empleados de SISTEMAS.
        departamento1.setEmpleados(listaEmpleados1,2);

        //Asigno empleados al departamento2 los empleados de CONTABILIDAD.
        departamento2.setEmpleados(listaEmpleados2,2);


        //Creo una empresa con su correspondiente lista de departamentos.
        Empresa miEmpresa = new Empresa(1, "EDESA", "305492101541");

        //Asigno lista de departamentos a la empresa.
        miEmpresa.setDepartamentos(listaDepartamentos);


        //Informo datos de la empresa.
        System.out.println("Nombre Empresa: " + miEmpresa.getNombre());
        System.out.println("Lista Departamentos y empleados: " + miEmpresa.getDepartamentos());
        System.out.println("Total de departamentos: " + Empresa.totalDepartamentos);
        System.out.println("Total de empleados: " +Empresa.totalEmpleados);
    }
}
/*
    ╔═════════════════╗
    ║  Observaciones  ║
    ╚═════════════════╝
* Ejercicio 5
    + Buena organizacion y presentacion, se puede mejorar en las clases representantes.

    ? El formato del toString puede mejorarse.
    ? Cuidado con el disenio de la aplicacion, pueden encontrarse puntos ciegos donde no hay posible escalabilidad.
    ? Si se desea hacer un filtrado, debe hacerse un metodo ajeno a getters y setters.
    ? Se puede optimizar aun mas?

    ! Si la clase 'Empleado' maneja un id static, este se comparte entre todas las intancias.
    ! Cuidado con la manipulacion del flujo de informacion. Seria mejor cargar departamento con empleados y luego a la lista.
    ! El uso de algunos constructores no esta bien implementado, ademas no puede tener una logica tan profunda(por ejemplo for).
    ! El uso de algunos setter y getter rompen un disenio coherente.
*/