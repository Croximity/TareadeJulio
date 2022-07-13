import java.util.Scanner;

public class Familia {
    Scanner sc = new Scanner(System.in);
    public String Rol;

    private void InicializarVariables(String Rol) {
        this.Rol = Rol;
    }

    public void PedirRol() {
        System.out.println("Por favor introduzca el rol familiar(Abuel@, hij@, Padre, Madre, Herman@, prim@, ti@): ");
        Rol = sc.next();

    }

    public void ImprimirRol() {
        System.out.printf(" Rol familiar: %s", Rol);
    }
}
