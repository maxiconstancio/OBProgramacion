package tema4;

public class Switch {
    public static void main(String[] args) {
        String estacion = "invierno";
        switch (estacion) {
            case "verano" -> System.out.println("Estamos en verano");
            case "otoño" -> System.out.println("Estamos en otoño");
            case "invierno" -> System.out.println("Estamos en invierno");
            case "primavera" -> System.out.println("Estamos en primavera");
            default -> System.out.println("No corresponde a una estacion");
        }
    }
}
