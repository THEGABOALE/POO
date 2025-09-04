package run;

public class Ejercicio3 {

    public int numero_palabras(String palabras) {
        for (int i = 0; i < palabras.length(); i++) {
            if (palabras.charAt(i) == ' ' || palabras.charAt(i) == '.' || palabras.charAt(i) == '-') {
                return i;
            }
        }
    }
}
