
public class PruebaFamilia {

    public static void main(String[] args) {
        Familia Familia = new Familia();
        Persona Persona = new Persona();
        Persona.pedirDatos();
        Persona.pedirFecha();
        Familia.PedirRol();
        Persona.imprimirDatos();
        Familia.ImprimirRol();
    }
}
