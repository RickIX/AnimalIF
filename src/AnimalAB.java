public abstract class AnimalAB implements AnimalIF {
    protected String nome;
    protected int idade;
    protected String habitat;
    protected String tipoAnimal;
    protected double peso;
    protected double altura;


    public abstract void comer(int quantidadeComida);
    public abstract void moverse(int distancia);
    public abstract void dormir(int horas);
}
