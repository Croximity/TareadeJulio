import java.util.Scanner;

public class Persona {
    Scanner sc = new Scanner(System.in);
    private String Nombre;
    private String Genero;
    private int Dia;
    private int Mes;
    private int anio;

    private void InicializarVariables(String Nombre, String Genero, int Dia, int Mes, int anio) {
        this.Nombre = Nombre;
        this.Genero = Genero;
        this.Dia = Dia;
        this.Mes = Mes;
        this.anio = anio;

    }

    public void pedirDatos() {
        System.out.println("Por Favor introduzca el primer nombre del integrante de la familia: ");
        Nombre = sc.next();

        System.out.println("Por Favor introduzca su Genero (Masculino o femenino): ");
        Genero = sc.next();
    }

    public void pedirFecha() {
        System.out.println("Por favor Introduzca el mes de nacimiento (1-12): ");
        Mes = sc.nextInt();

        while (Mes <= 0 || Mes > 12) {
            System.out.printf("el mes debe ser entre 1-12: ");
            Mes = sc.nextInt();
        }
        // Mes de Febrero
        if (Mes == 2) {
            System.out.println("Por favor introduzca un dia entre 1-28: ");
            Dia = sc.nextInt();
            while (Dia <= 0 || Dia > 28) {
                System.out.print("El dia debe estar entre 1-28: ");
            }

        }
        // meses con 31
        if (Mes == 1 || Mes == 3 || Mes == 5 || Mes == 7 || Mes == 8 || Mes == 10 || Mes == 12) {
            System.out.println("Por favor introduzca un Dia entre 1-31");
            Dia = sc.nextInt();
            while (Dia <= 0 || Dia > 31) {
                System.out.println("El dia debe estar entre 1-31: ");
                Dia = sc.nextInt();
            }
        } else {
            // meses con 30
            System.out.println("Por favor introduzca un Dia entre 1-30");
            Dia = sc.nextInt();
            while (Dia <= 0 || Dia > 30) {
                System.out.println("El dia debe estar entre 1-30: ");
                Dia = sc.nextInt();
            }
        }

        System.out.println("Introduzca su año de nacimiento: ");
        anio = sc.nextInt();
    }

    public void imprimirDatos() {
        System.out.printf("Nombre: %s, Genero: %s, Fecha de nacimiento: %d del %d del %d", Nombre, Genero, Dia, Mes,
                anio);
    }
}
