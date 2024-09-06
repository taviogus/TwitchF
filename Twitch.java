public class Twitch {
    public static void main(String[] args) {
        Plataforma twitch = new Plataforma();

        Usuario user1 = new Usuario("tavin22");
        Usuario user2 = new Usuario("trs333");

        twitch.adicionarUsuario(user1);
        twitch.adicionarUsuario(user2);

        Canal canal1 = new Canal("vavadograu");
        twitch.adicionarCanal(canal1);


        canal1.iniciarTransmissao("Jogando aquele Vava de cada dia!!");


        user1.seguirCanal(canal1);
        user1.assistirTransmissao(canal1);

       //user2.seguirCanal(canal1);
       // user2.assistirTransmissao(canal1);
    }
}
