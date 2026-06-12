public class EstadoEmergencia implements EstadoBateria {
    public void despegar() {
        System.out.println(" Intento de despegue en modo de ahorro de energia.");
    }

    @Override
    public void moverA(String coordenadas) {
        System.out.println(
                "¡Bateria por debajo del 20%! Reduciendo velocidad A LA MITAD para ahorrar energia.");
    }

    public void retornarABase() {
        System.out.println("ALERTA CRITICA! Forzando el regreso inmediato a la base.");
    }
}