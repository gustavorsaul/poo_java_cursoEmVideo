public class App {
    public static void main(String[] args) throws Exception {
        
        Lutador l [] = new Lutador[6];

        l[0] = new Lutador( "Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 5, 4, 3);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 5);

        for(int i = 0; i < l.length; i++) {
            l[i].status();
        }

        Luta luta1 = new Luta();
        luta1.marcarLuta(l[0], l[1]);
        l[0].status();
        l[1].status();
        luta1.lutar();
        l[0].status();
        l[1].status();

        Luta luta2 = new Luta();
        luta2.marcarLuta(l[3], l[3]);
        luta2.lutar();
        

    }
}
