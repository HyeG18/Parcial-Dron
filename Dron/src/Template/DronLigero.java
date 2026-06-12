public class DronLigero extends DronBase {
    public DronLigero(EstadoBateria estadoInicial, String rolUsuario) {
        super(estadoInicial, rolUsuario);
    }

    @Override
    public void escanearTerreno() {
        System.out.println("[Dron Ligero] Escaneando tuneles utilizando camaras laser de alta precisión (LiDAR).");
    }

    @Override
    public void recolectarMuestras() {
        System.out.println("[Dron Ligero] Extrayendo minerales usando un brazo robótico liviano de succión.");
    }
}