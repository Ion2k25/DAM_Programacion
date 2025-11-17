public class Tipo_Numero {

    //Métodos para verificar si un número es...
    public static String tipoDeNumero(int numero){
        if (Perfecto(numero)){
            return "Perfecto";
        } else if (Abundante(numero)){
            return "Abundante";
        }else if (Defectuoso(numero)){
            return "Defectuoso";
        }else if (Primo(numero)){
            return "Primo";
        }else{
            return "Desconocido";
        }
    }
    //-Perfecto=Si la suma de sus divisores propios es igual al número.
    private static boolean Perfecto(int numero) {
        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == numero;
    }


    //-Abundante=Si la suma de sus divisores popios es mayor que el número.
    private static boolean Abundante(int numero) {
        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores > numero;
    }


    //-Defectuoso=Si la suma de sus divisores propios es menor que el número.
    private static boolean Defectuoso(int numero) {
        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores < numero;
    }

    //-Primo=Si solo es divisible por 1 y por sí mismo.
    private static boolean Primo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }


}



