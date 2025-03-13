public class App {
    public static void main(String[] args) throws Exception {
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.setCorPelo("Preto");
        m.alimentar();
        m.emitirSom();
        m.locomover();
        System.out.println(m.toString());

        System.out.println("--------------------");

        r.setPeso(0.5f);
        r.setIdade(1);
        r.setMembros(4);
        r.setCorEscama("Verde");
        r.alimentar();
        r.emitirSom();
        r.locomover();
        System.out.println(r.toString());

        System.out.println("--------------------");

        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.setCorEscama("Azul");
        p.alimentar();
        p.emitirSom();
        p.locomover();
        System.out.println(p.toString());

        System.out.println("--------------------");

        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.setCorPena("Branca");
        a.alimentar();
        a.emitirSom();
        a.locomover();
        System.out.println(a.toString());

        System.out.println("--------------------");

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Arara e = new Arara();

        c.setPeso(55.30f);
        c.setIdade(3);  
        c.setMembros(4);
        c.setCorPelo("Marrom");
        c.alimentar();
        c.emitirSom();
        c.locomover();
        c.usarBolsa();
        System.out.println(c.toString());

        System.out.println("--------------------");

        k.setPeso(3.94f);
        k.setIdade(5);
        k.setMembros(4);
        k.setCorPelo("Preto");
        k.alimentar();
        k.emitirSom();
        k.locomover();
        k.abanarRabo();
        System.out.println(k.toString());

        System.out.println("--------------------");

        j.setPeso(0.5f);
        j.setIdade(1);
        j.setMembros(0);
        j.setCorEscama("Verde");
        j.alimentar();
        j.emitirSom();
        j.locomover();
        System.out.println(j.toString());

        System.out.println("--------------------");

        t.setPeso(1.5f);
        t.setIdade(100);
        t.setMembros(4);
        t.setCorEscama("Verde");
        t.alimentar();
        t.emitirSom();
        t.locomover();
        System.out.println(t.toString());

        System.out.println("--------------------");

        e.setPeso(1.5f);
        e.setIdade(2);
        e.setMembros(2);
        e.setCorPena("Azul");
        e.alimentar();
        e.emitirSom();
        e.locomover();
        System.out.println(e.toString());

        System.out.println("--------------------");




    }
}
