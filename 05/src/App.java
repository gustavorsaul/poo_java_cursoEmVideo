public class App {
    public static void main(String[] args) throws Exception {
        
        Banco p1 = new Banco();
        p1.setNumConta(01);
        p1.setDono("Pedro");
        p1.abrirConta("CC");
        
        Banco p2 = new Banco();
        p2.setNumConta(02);
        p2.setDono("Maria");
        p2.abrirConta("CP");
        
        p1.estadoAtual();
        p2.estadoAtual();

        p1.depositar(100);
        p2.depositar(500);

        p1.fecharConta();
        p1.sacar(150);
        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();

    }
}
