public class Espectador extends Pessoa{

    private String login;
    private int totalAssistido;

    public Espectador(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }


    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotalAssistido() {
        return totalAssistido;
    }
    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }


    @Override
    public String toString() {
        return "Espectador [" + super.toString() + ", login = " + login + ", totalAssistido = " + totalAssistido + "]";
    }

    


}
