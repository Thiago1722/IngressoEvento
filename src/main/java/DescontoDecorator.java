public class IngressoBasico implements Ingresso{
    @Override
    public double preco() {
        return 50.0;
    }

    @Override
    public String descricao() {
        return "Ingresso básico para o evento";
    }
}
