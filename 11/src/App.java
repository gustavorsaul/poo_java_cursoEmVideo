public class App {
    public static void main(String[] args) throws Exception {
        
        Visitante v1 = new Visitante();
        v1.setNome("Pedro");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(01);
        a1.setCurso("Informática");
        a1.setIdade(18);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setMatricula(02);
        b1.setNome("João");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        System.out.println(b1.toString());

    }
}
