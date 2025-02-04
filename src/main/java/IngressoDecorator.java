public class AcessoVIPDecorator extends IngressoDecorator {
    public AcessoVIPDecorator(Ingresso ingressoDecorado) {
        super(ingressoDecorado);
    }

    @Override
    public double preco() {
        return ingressoDecorado.preco() + 20.0;
    }

    @Override
    public String descricao() {
        return ingressoDecorado.descricao() + ", com acesso VIP";
    }
}
