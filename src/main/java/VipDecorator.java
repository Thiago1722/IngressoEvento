public class BrindesDecorator extends IngressoDecorator{
    public BrindesDecorator(Ingresso ingressoDecorado) {
        super(ingressoDecorado);
    }

    @Override
    public double preco() {
        return ingressoDecorado.preco() + 10.0;
    }

    @Override
    public String descricao() {
        return ingressoDecorado.descricao() + ", com brindes especiais";
    }
}
