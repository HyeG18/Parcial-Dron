

public class Reporte_Real implements Reporte {
    // Atributos
    private String archivo;

    public Reporte_Real() {
        this.archivo = "Reporte de Sensores: Temperatura 45°C, Gas: Estable, Batería: 80%";
    }

    @Override
    public String obtenerReporteSensores() {
        System.out.println("Conectando vía satélite...");
        System.out.println("Leyendo sensores de hardware...");
        return this.archivo;
    }

    @Override
    public void forzarReinicioDron() {
        System.out.println("Reiniciando sistemas físicos del dron !!!");
    }
}