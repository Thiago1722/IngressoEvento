class VipDecorator extends IngressoDecorator {
    public VipDecorator(Ingresso ingresso) {
        super(ingresso);
    }

    @Override
    public String getDescricao() {
        return ingresso.getDescricao() + " + Acesso VIP";
    }

    @Override
    public double getPreco() {
        return ingresso.getPreco() + 30.0; // Custo adicional do VIP
    }
}