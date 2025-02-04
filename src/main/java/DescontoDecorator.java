class DescontoDecorator extends IngressoDecorator {
    public DescontoDecorator(Ingresso ingresso) {
        super(ingresso);
    }

    @Override
    public String getDescricao() {
        return ingresso.getDescricao() + " + Desconto Especial";
    }

    @Override
    public double getPreco() {
        return ingresso.getPreco() * 0.8; // 20% de desconto
    }
}