public class DronSubterraneoPesado extends DronBase {
    public DronSubterraneoPesado(EstadoBateria estadoInicial, String rolUsuario) {
        super(estadoInicial, rolUsuario);
    }

    @Override
    public void escanearTerreno() {
        System.out.println("[Dron Pesado] Escaneando a profundidad con ondas de radar de penetración terrestre.");
    }

    @Override
    public void recolectarMuestras() {
        System.out.println(
                "[Dron Pesado] Perforando roca sólida y recolectando muestras mediante taladro de punta de diamante.");
    }
}