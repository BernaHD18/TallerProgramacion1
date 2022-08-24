import java.sql.SQLOutput;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        menu();

    public static void menu();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        do{
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


                }

