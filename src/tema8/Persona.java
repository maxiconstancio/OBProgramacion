package tema8;

public class Persona {

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getTelefono() {
        return telefono;
    }

    private int edad;
        private String nombre;
        private long telefono;

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(12);
        persona.setNombre("Thiago Joaquin");
        persona.setTelefono(238046);
        System.out.println(persona.getNombre() + " tiene " + persona.getEdad() + " anios y su numero de telefono es " + persona.getTelefono());

    }
}
