class IngressoBase implements Ingresso {
    @Override
    public String getDescricao() {
        return "Ingresso Padrão";
    }

    @Override
    public double getPreco() {
        return 50.0; // Preço base do ingresso
    }
}