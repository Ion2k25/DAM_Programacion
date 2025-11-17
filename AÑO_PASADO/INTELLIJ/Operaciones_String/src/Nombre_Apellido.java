public class Nombre_Apellido {
    public static String Iniciales(String Nombre, String Apellido) {
        String[] NombreParts = Nombre.split("");
        String[] ApellidoParts = Apellido.split("");

    String iniciales = NombreParts[0].substring(0,1).toUpperCase();
    for(String a : ApellidoParts){
        iniciales += a.substring(0,1).toUpperCase();
    }
    return iniciales.toString();
    }
}
