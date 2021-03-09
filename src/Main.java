public class Main {
    public static void main(String args[]){
        Suma suma1 = new Suma();
        suma1.Sumar(3,2);
        System.out.println("El resultado de la primera suma es: " + suma1.getResultado());

        Suma suma2 = new Suma();
        suma2.Sumar(2,5);
        System.out.println("El resultado de la segunda suma es: " + suma2.getResultado());

        Suma suma3 = new Suma();
        suma3.Sumar(9,3);
        System.out.println("El resultado de la tercer suma es: " + suma3.getResultado());
        System.out.println();

        System.out.println("El Promedio de "
                + suma1.getResultado() + "+" +
                + suma2.getResultado() +"+"
                + suma3.getResultado() +" es: ");

        System.out.println("("
                + suma1.getResultado() + " + " +
                + suma2.getResultado() +" + "
                + suma3.getResultado() +") \u2797 "
                + Suma.getContadorSumasRealizadas() +" = ?");

        System.out.println("     "
                + Suma.getTotalSumas() + "      \u2797 "
                + Suma.getContadorSumasRealizadas() +" = "
                + Suma.getPromedio());
        System.out.println();
    }
}
