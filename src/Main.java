import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE TAREAS ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar todas las tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Editar tarea");
            System.out.println("5. Listar tareas pendientes");
            System.out.println("6. Listar tareas completadas");
            System.out.println("7. Eliminar tarea");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Descripción: ");
                    String desc = sc.nextLine();
                    System.out.print("Fecha límite: ");
                    String fecha = sc.nextLine();
                    System.out.print("Prioridad (Alta, Media, Baja): ");
                    String prioridad = sc.nextLine();
                    System.out.print("Categoría (Trabajo, Estudio, Personal, Otro): ");
                    String categoria = sc.nextLine();
                    gestor.agregarTarea(new Tarea(desc, fecha, prioridad, categoria));
                    System.out.println("Tarea agregada.");
                    break;
                case 2:
                    gestor.listarTareas();
                    break;
                case 3:
                    System.out.print("Número de tarea a marcar como completada: ");
                    int numComp = sc.nextInt() - 1;
                    gestor.marcarTareaComoCompletada(numComp);
                    break;
                case 4:
                    System.out.print("Número de tarea a editar: ");
                    int numEdit = sc.nextInt() - 1;
                    sc.nextLine();
                    System.out.print