public class EstadoOperativoTotal implements EstadoBateria {
   
    @Override
    public void moverA(String coordenadas) {
        System.out.println("[Estado Normal] Navegando hacia " + coordenadas + " a VELOCIDAD MÁXIMA (100%).");
    }

    public void retornarABase() {
        System.out.println("[Estado Normal] Finalizando jornada. Retornando a la base de manera rutinaria.");
    }
}