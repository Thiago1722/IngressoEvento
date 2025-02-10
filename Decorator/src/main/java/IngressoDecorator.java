abstract class IngressoDecorator implements Ingresso {
    protected Ingresso ingresso;

    public IngressoDecorator(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    @Override
    public String getDescricao() {
        return ingresso.getDescricao();
    }

    @Override
    public double getPreco() {
        return ingresso.getPreco();
    }
}