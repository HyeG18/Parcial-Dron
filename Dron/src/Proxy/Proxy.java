public class Proxy implements Reporte {
    // Atributos 
    private String rol;
    private String archivo;
    private Reporte_Real reporte_real;

    // Constructor 
    public Proxy(String rol) {
        this.rol = rol;
        this.archivo = null;
        this.reporte_real = new Reporte_Real(); 
    }

    public boolean verificarRol() {
        return "INGENIERO".equalsIgnoreCase(this.rol);
    }

    @Override
    public String obtenerReporteSensores() {
        // Proxy de Caché
        if (this.archivo == null) {
            System.out.println("Caché vacío. Delegando petición al hardware real...");
            this.archivo = reporte_real.obtenerReporteSensores();
        } else {
            System.out.println("Interceptado: Retornando datos guardados en caché (Ahorro de red).");
        }
        return this.archivo;
    }

    @Override
    public void forzarReinicioDron() {
        // Proxy de Protección
        if (verificarRol()) {
            System.out.println("Seguridad aprobada para rol '" + this.rol + "'. Ejecutando orden...");
            reporte_real.forzarReinicioDron();
        } else {
            System.out.println(
                    "ERROR: Acceso denegado. El rol '" + this.rol + "' no tiene permisos para reiniciar.");
        }
    }
}