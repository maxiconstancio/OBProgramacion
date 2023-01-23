package tema1;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumaTres(1,2,3));
        Coche miCoche =  new Coche();

        miCoche.incrementarPuertas();
        System.out.println(miCoche.puertas);

    }
    public static int sumaTres (int a, int b, int c) {
        return (a+ b + c);
    }
}
