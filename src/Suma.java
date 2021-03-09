public class Suma {
    private static int totalSumas;
    private static int contadorSumasRealizadas;
    private int resultado;

    public void Sumar(int numero1, int numero2){
        resultado = numero1 + numero2;
        totalSumas += resultado;
        contadorSumasRealizadas++;
    }

    public int getResultado(){
        return this.resultado;
    }

    public static int getTotalSumas(){
        return totalSumas;
    }

    public static int getContadorSumasRealizadas() {
        return contadorSumasRealizadas;
    }

    public static int getPromedio(){
        return totalSumas / contadorSumasRealizadas;
    }
}