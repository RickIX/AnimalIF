public class Peixe extends AnimalMarinhoAB {

    private int comidaIngerida;
    private int distanciaPercorrida;
    private int horasDormidas;

    @Override
    public void comer(int quantidadeComida) {
        comidaIngerida += quantidadeComida;
    }

    @Override
    public void moverse(int distancia) {

    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
    }

    @Override
    public void nadar(int distancia){
        distanciaPercorrida += distancia;
    }
}
