public class App {
    public static void main(String[] args) throws Exception {
        
        
        Pessoa p [] = new Pessoa[2];
        Livro l [] = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);

        //for (int i = 0; i < l.length; i++) {
        //    System.out.println(l[i].detalhes());
        //}

        l[0].abrir();
        l[0].folhear(100);
        System.out.println(l[0].detalhes());
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
    }
}
