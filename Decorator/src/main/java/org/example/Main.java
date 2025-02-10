public class Main {
    public static void main(String[] args) {
        Ingresso ingressoSimples = new IngressoBase();
        System.out.println(ingressoSimples.getDescricao() + " - Preço: R$" + ingressoSimples.getPreco());

        Ingresso ingressoVip = new VipDecorator(new IngressoBase());
        System.out.println(ingressoVip.getDescricao() + " - Preço: R$" + ingressoVip.getPreco());

        Ingresso ingressoComDesconto = new DescontoDecorator(new IngressoBase());
        System.out.println(ingressoComDesconto.getDescricao() + " - Preço: R$" + ingressoComDesconto.getPreco());

        Ingresso ingressoVipComDesconto = new DescontoDecorator(new VipDecorator(new IngressoBase()));
        System.out.println(ingressoVipComDesconto.getDescricao() + " - Preço: R$" + ingressoVipComDesconto.getPreco());
    }
}