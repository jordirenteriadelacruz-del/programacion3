package Parcial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teatro teatro = new Teatro();
        int opcion = 0;

        System.out.println("=== CINEMASTAR - SANTIAGO DE CALI ===");

        do {
            System.out.println("\n= MENU PRINCIPAL =");
            System.out.println("1. Crear peliculas");
            System.out.println("2. Asignar funciones");
            System.out.println("3. Vender entradas");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine(); // Limpia el buffer
            } else {
                System.out.println("Opcion invalida. Debe ingresar un numero.");
                sc.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    menuCrearPeliculas(sc, teatro);
                    break;
                case 2:
                    menuAsignarFunciones(sc, teatro);
                    break;
                case 3:
                    menuVenderEntradas(sc, teatro);
                    break;
                case 4:
                    System.out.println("\nGracias por usar CinemaStar. Adios!");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
            }
        } while (opcion != 4);

        sc.close();
    }

    // MODULO 1: CREAR PELICULAS
    public static void menuCrearPeliculas(Scanner sc, Teatro teatro) {
        int opcion = 0;
        do {
            System.out.println("\n= CREAR PELICULAS =");
            System.out.println("1. Ver peliculas registradas");
            System.out.println("2. Agregar nueva pelicula");
            System.out.println("3. Volver al menu principal");
            System.out.print("Elija una opcion: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Opcion invalida.");
                sc.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    teatro.mostrarPeliculas();
                    break;
                case 2:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Idioma: ");
                    String idioma = sc.nextLine();
                    System.out.print("Tipo (35mm/3D): ");
                    String tipo = sc.nextLine();
                    System.out.print("Duracion (min): ");
                    int duracion = 0;
                    if (sc.hasNextInt()) {
                        duracion = sc.nextInt();
                        sc.nextLine();
                    } else {
                        System.out.println("Duracion invalida.");
                        sc.nextLine();
                        break;
                    }

                    Pelicula p = new Pelicula(nombre, idioma, tipo, duracion);
                    if (teatro.agregarPelicula(p)) {
                        System.out.println("Pelicula agregada exitosamente!");
                    } else {
                        System.out.println("Error: repertorio lleno.");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 3);
    }

    // MODULO 2: ASIGNAR FUNCIONES
    public static void menuAsignarFunciones(Scanner sc, Teatro teatro) {
        System.out.println("\n========== ASIGNAR FUNCIONES ==========");

        if (teatro.getNumPeliculas() == 0) {
            System.out.println("No hay peliculas registradas. Cree peliculas primero.");
            return;
        }

        teatro.mostrarPeliculas();
        System.out.print("\nElija el numero de pelicula: ");
        int numPel = sc.nextInt() - 1;
        Pelicula pel = teatro.getPelicula(numPel);

        if (pel == null) {
            System.out.println("Pelicula invalida.");
            return;
        }

        System.out.print("Elija sala (1-3): ");
        int sala = sc.nextInt();
        System.out.print("Elija franja (1-3): ");
        int franja = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        if (teatro.asignarFuncion(sala, franja, pel)) {
            System.out.println("Funcion asignada exitosamente!");
            System.out.println("Pelicula: " + pel.getNombre());
            System.out.println("Sala: " + sala);
            System.out.println("Horario: " + teatro.getFuncion(sala, franja).getHorario());
        } else {
            System.out.println("\nError: no se pudo asignar la funcion.");
            System.out.println("Verifique que:");
            System.out.println("- La sala no tenga ya una funcion asignada en esa franja.");
            System.out.println("- La Sala 3 SOLO acepta peliculas 3D.");
            System.out.println("- Las Salas 1 y 2 NO aceptan peliculas 3D.");
        }
    }

    // MODULO 3: VENDER ENTRADAS
    public static void menuVenderEntradas(Scanner sc, Teatro teatro) {
        System.out.println("\n= VENDER ENTRADAS =");
        System.out.print("Elija sala (1-3): ");
        int sala = sc.nextInt();
        System.out.print("Elija franja (1-3): ");
        int franja = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        Funcion f = teatro.getFuncion(sala, franja);
        if (f == null) {
            System.out.println("No hay funcion asignada en esa sala y franja.");
            return;
        }

        // Mostrar esquema y sillas disponibles
        f.mostrarEsquema();

        System.out.print("\nIngrese sillas separadas por coma (ejemplo: A3, B8, D9): ");
        String entrada = sc.nextLine().toUpperCase();
        String[] sillasPedidas = entrada.split(",");

        int total = 0;
        int compradas = 0;

        for (int i = 0; i < sillasPedidas.length; i++) {
            String sillaStr = sillasPedidas[i].trim();

            if (sillaStr.length() < 2) {
                System.out.println("Identificador de silla invalido: " + sillaStr);
                continue;
            }

            char letraFila = sillaStr.charAt(0);
            int numSilla = 0;

            try {
                numSilla = Integer.parseInt(sillaStr.substring(1));
            } catch (NumberFormatException e) {
                System.out.println("Numero de silla invalido: " + sillaStr);
                continue;
            }

            boolean encontrada = false;
            Silla[][] sillasSala = f.getSala().getSillas();

            for (int fi = 0; fi < sillasSala.length && !encontrada; fi++) {
                for (int co = 0; co < sillasSala[fi].length && !encontrada; co++) {
                    Silla s = sillasSala[fi][co];

                    if (s.getFila() == letraFila && s.getNumero() == numSilla) {
                        encontrada = true;

                        if (f.ocuparSilla(fi, co)) {
                            total += s.getPrecio();
                            compradas++;
                            System.out.println("Silla " + sillaStr + " comprada exitosamente ($" + s.getPrecio() + ")");
                        } else {
                            System.out.println("La silla " + sillaStr + " ya esta OCUPADA.");
                        }
                    }
                }
            }

            if (!encontrada) {
                System.out.println("La silla " + sillaStr + " no existe en esta sala.");
            }
        }

        System.out.println("\n=== RESUMEN DE COMPRA ===");
        System.out.println("Sillas compradas: " + compradas);
        System.out.println("Total a pagar: $" + total);
    }
}