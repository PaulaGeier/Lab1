package TRABAJOSPRACTICOS.TrabajoPractico11_1;

import java.util.ArrayList;
import java.util.Scanner;
public class TrabajoPractico11_1 {
    //EJERCICIO 1
    /*
    Scanner sc = new Scanner(System.in);
    ArrayList<String> marcasAutos = new ArrayList<>();

    while (true){
        System.out.println("Ingresa [1] para ingresar  marcas [2] para dejar de ingresar marcas de autos");
        int op = sc.nextInt();
        sc.nextLine(); // Limpiar el carácter de nueva línea
        if (op == 2) {
            System.out.println(marcasAutos);
            break;
        } else {
            System.out.println("Ingresa una marca auto");
            String marcaAuto = sc.nextLine();
            marcasAutos.add(marcaAuto);


        }
    }
*/
    //EJERCICIO 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        equipoFutbol e1 = new equipoFutbol();
        int opcion;
        do {
            System.out.println("Que desea realizar?");
            System.out.println("(1) Mostrar Jugadores del equipo");
            System.out.println("(2) Agregar Jugadores al Equipo");
            System.out.println("(3) Eliminar Jugador del equipo");
            System.out.println("(0) Para finalizar y salir");
            System.out.println(" :");
            opcion = sc.nextInt();


            if (opcion == 1) {
                e1.mostrarJugadores();
            } else if (opcion == 2) {
                e1.agregarJugadores();
            } else if (opcion == 3) {
                e1.eliminarJugadores();
            }


        } while (opcion != 0);
    }
    //EJERCICIO 3

    public class Factura {
        private double iva;
        private Scanner sc = new Scanner(System.in);
        private int numeroFactura;
        private int fechaEmision;
        private String cliente;
        private ArrayList<String> articulos;
        private ArrayList<Double> precioUnitario;
        private int cantidad;
        private double subtotal;
        private double ivaCalculado;
        private double total;


        public Factura(int numeroFactura, int fechaEmision, String cliente, double iva) {
            this.numeroFactura = numeroFactura;
            this.fechaEmision = fechaEmision;
            this.cliente = cliente;
            this.articulos = new ArrayList<>();
            this.precioUnitario = new ArrayList<>();
            this.iva = iva;
        }


        public void agregarArticulo() {
            System.out.println("Ingrese el artículo: ");
            String articulo = sc.nextLine();
            System.out.println("Ingrese el precio: ");
            double precio = sc.nextDouble();
            this.articulos.add(articulo);
            this.precioUnitario.add(precio);
        }


        public double calcularSubtotal() {
            double subtotal = 0;
            for (double precio : this.precioUnitario) {
                subtotal += precio;
            }
            this.subtotal = subtotal;
            return subtotal;
        }


        public double calcularIva() {
            this.ivaCalculado = (subtotal * iva) - subtotal;
            return ivaCalculado;
        }


        public double calcularTotal() {
            this.total = subtotal + ivaCalculado;
            return total;
        }




    }
}








