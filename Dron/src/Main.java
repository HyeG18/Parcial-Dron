public class Main {
    public static void main(String[] args) {

        Reporte sesionOperador = new Proxy("OPERADOR");
        System.out.println(sesionOperador.obtenerReporteSensores());
        System.out.println(sesionOperador.obtenerReporteSensores()); 
        sesionOperador.forzarReinicioDron(); 

        Reporte sesionIngeniero = new Proxy("INGENIERO");
        sesionIngeniero.forzarReinicioDron(); 

        // Creamos un estado inicial normal
        EstadoBateria operativoNormal = new EstadoOperativoTotal();

        // Inicializamos un Dron Pesado en estado óptimo
        DronBase dronMineria = new DronSubterraneoPesado(operativoNormal, "OPERADOR");

        dronMineria.ejecutarMision("Sector Alfa-9");

        // Simulación de desgaste: la batería baja del 20% en tiempo de ejecución
        dronMineria.setEstado(new EstadoEmergencia());

        dronMineria.ejecutarMision("Sector Delta-2");
    }
}