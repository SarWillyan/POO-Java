public class Test1 implements TestaPessoa{
    @Override
    public boolean testa(Pessoa p) {
        return p.getIdade() >= 18;
    }
}
