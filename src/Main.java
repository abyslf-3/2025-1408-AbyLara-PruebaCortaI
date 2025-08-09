import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        int opcion;

        do {
            System.out.println("\n===== MENÚ DE TAREAS =====");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar todas las tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Editar tarea");
            System.out.println("5. Listar tareas por estado");
            System.out.println("6. Eliminar tarea");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Descripción: ");
                    String desc = sc.nextLine();
                    System.out.print("Fecha límite: ");
                    String fecha = sc.nextLine();
                    System.out.print("Prioridad (Alta/Media/Baja): ");
                    String prioridad = sc.nextLine();
                    System.out.print("Categoría (Trabajo/Estudio/Personal/Otro): ");
                    String categoria = sc.nextLine();
                    gestor.agregarTarea(new Tarea(desc, fecha, prioridad, categoria));
                    break;
                case 2:
                    gestor.listarTareas();
                    break;
                case 3:
                    System.out.print("Número de tarea a completar: ");
                    int comp = sc.nextInt() - 1;
                    gestor.marcarTareaComoCompletada(comp);
                    break;
                case 4:
                    System.out.print("Número de tarea a editar: ");
                    int edit = sc.nextInt() - 1;
                    sc.nextLine();
                    System.out.print("Nueva descripción: ");
                    String nuevaDesc = sc.nextLine();
                    System.out.print("Nueva fecha límite: ");
                    String nuevaFecha = sc.nextLine();
                    System.out.print("Nueva prioridad: ");
                    String nuevaPrioridad = sc.nextLine();
                    System.out.print("Nueva categoría: ");
                    String nuevaCategoria = sc.nextLine();
                    gestor.editarTarea(edit, nuevaDesc, nuevaFecha, nuevaPrioridad, nuevaCategoria);
                    break;
                case 5:
                    System.out.print("¿Mostrar completadas? (true/false): ");
                    boolean estado = sc.nextBoolean();
                    gestor.listarTareasPorEstado(estado);
                    break;
                case 6:
                    System.out.print("Número de tarea a eliminar: ");
                    int elim = sc.nextInt() - 1;
                    gestor.eliminarTarea(elim);
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 7);

        sc.close();
    }
}
