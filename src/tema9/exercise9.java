package tema9;

public class exercise9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.credito = 20;
        cliente.edad = 34;
        cliente.nombre = "Maxi";
        cliente.telefono = 12345;
        System.out.println("Cliente: "+ cliente.nombre + ' ' + cliente.edad + ' ' + cliente.telefono + ' ' + cliente.credito );
        trabajador.edad = 56;
        trabajador.nombre = "Worker";
        trabajador.telefono = 123456;
        trabajador.salario = 169000;
        System.out.println("Trabajador: "+ trabajador.nombre  + " " + trabajador.edad + " "+ trabajador.telefono + " " + trabajador.salario );


    }


}

