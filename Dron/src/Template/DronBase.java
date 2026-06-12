public abstract class DronBase {
    protected EstadoBateria bateria;
    public String rolUsuario;

    public DronBase(EstadoBateria estadoInicial, String rolUsuario) {
        this.bateria = estadoInicial;
        this.rolUsuario = rolUsuario;
    }

    public void setEstado(EstadoBateria nuevoEstado) {
        this.bateria = nuevoEstado;
    }

    public final void ejecutarMision(String coordenadas) {
        despegar();
        escanearTerreno();
        recolectarMuestras();

        bateria.moverA(coordenadas);

        if (bateria instanceof EstadoOperativoTotal) {
            ((EstadoOperativoTotal) bateria).retornarABase();
        } else if (bateria instanceof EstadoEmergencia) {
            ((EstadoEmergencia) bateria).retornarABase();
        }
    }

    public void despegar() {
        System.out.println("Iniciando protocolo básico de despegue vertical...");
    }

    public abstract void escanearTerreno();

    public abstract void recolectarMuestras();
}