public class Gato extends AnimalTerrestreAB {
    private int comidaIngerida;
    private int distanciaPercorrida;
    private int horasDormidas;

    @Override
    public void comer(int quantidadeComida) {
        comidaIngerida += quantidadeComida;
    }

    @Override
    public void moverse(int distancia) {
        distanciaPercorrida += distancia;
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
    }

}
