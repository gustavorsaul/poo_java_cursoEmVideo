public class App {
    public static void main(String[] args) throws Exception {
        
        Video v [] = new Video[3];
        Espectador e [] = new Espectador[2];

        v[0] = new Video("POO aula 1");
        v[1] = new Video("POO aula 2");
        v[2] = new Video("POO aula 3");

       
        e[0] = new Espectador("Pedro", 16, "M", "pdr");
        e[1] = new Espectador("Ana", 17, "F", "aninha");

        Visualizacao vis [] = new Visualizacao[3];

        vis[0] = new Visualizacao(e[0], v[0]); // pedro assiste aula1
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(e[0], v[1]); // pedro assiste aula2
        vis[0].avaliar(35.0f);
        System.out.println(vis[1].toString());


        



    }
}
