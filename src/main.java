import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        menu();

        private String libro;
        private String autor;
        private String editorial;

        public libro(String libro, String autor, String editorial) {
            this.libro = libro;
            this.autor = autor;
            this.editorial = editorial;
        }

        public String getLibro() {
            return libro;
        }
        public String getAutor() {
            return autor;
        }
        public String toString() {
            return "Libro: " + this.libro + "\tautor: " + this.autor + "\tEditorial: " + this.editorial;

        public static String [][] agrgarLibro(String misLibros[], String titulo, String autor, String editorial)

        public static int totalLibros (String misLibros[])

        public static int espaciosDisponibles (Strings misLibros[])

        public static void mostrarTotalLibros (String misLibros[])

        public static void mostrarEspaciosDisponibles (String misLibros[])

        public static void mostrarBusquedaLibroAutor (String misLibros, String autor)

        public static void mostrarTodaColeccion(String misLibros[])
        String libros[][] = new String[100][3];


        public static void menu(); {
            static Scanner teclado = new Scanner(System.in);
            boolean salir = false;
            int opcion;
            do {
                System.out.println("1. Agregar libro");
                System.out.println("2. Buscar libro");
                System.out.println("3. Mostrar espacios usados");
                System.out.println("4. Mostrar espacios disponibles");
                System.out.println("5. Mostrar toda la colección");
                System.out.println("6. Salir");
                try {
                    System.out.println("Escribe una de las opciones");
                    opcion = sn.nextInt();
                    switch (menu) {
                        case 1:
                            System.out.println("Has seleccionado la opción 1");
                            break;
                        case 2:
                            System.out.println("Has seleccionado la opción 2");
                            break;
                        case 3:
                            System.out.println("Has seleccionado la opcion 3");
                            break;
                        case 4:
                            System.out.println("Has seleccionado la opcion 4");
                            break;
                        case 5:
                            System.out.println("Has seleccionado la opcion 5");
                        case 6:
                            salir = true;
                            break;
                        default:
                            System.out.println("Solo números entre 1 y 6");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Debes insertar un número");
                    sn.next();
                }
            }
            while (!salir);
        }
    }
}

