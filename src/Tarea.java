public class Tarea {
    private String descripcion;
    private String fechaLimite;
    private String prioridad;
    private String categoria;
    private boolean completada;

    // Constructor
    public Tarea(String descripcion, String fechaLimite, String prioridad, String categoria) {
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.prioridad = prioridad;
        this.categoria = categoria;
        this.completada = false;
    }

    // Getters
    public String getDescripcion() { return descripcion; }
    public String getFechaLimite() { return fechaLimite; }
    public String getPrioridad() { return prioridad; }
    public String getCategoria() { return categoria; }
    public boolean isCompletada() { return completada; }

    // Setters
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setFechaLimite(String fechaLimite) { this.fechaLimite = fechaLimite; }
    public void setPrioridad(String prioridad) { this.prioridad = prioridad; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    // Mostrar información
    public void mostrarInfo() {
        System.out.println("Descripción: " + descripcion);
        System.out.println("Fecha límite: " + fechaLimite);
        System.out.println("Prioridad: " + prioridad);
        System.out.println("Categoría: " + categoria);
        System.out.println("Estado: " + (completada ? "Completada" : "Pendiente"));
    }

    // Marcar como completada
    public void marcarComoCompletada() {
        this.completada = true;
    }

    // Editar tarea
    public void editarTarea(String descripcion, String fechaLimite, String prioridad, String categoria) {
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.prioridad = prioridad;
        this.categoria = categoria;
    }
}
