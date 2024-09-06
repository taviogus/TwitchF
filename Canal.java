import java.util.ArrayList;

public class Canal {
    private String nome;
    private ArrayList<Usuario> seguidores;
    private Livestreaming transmissaoAtiva;

    public Canal(String nome) {
        this.nome = nome;
        this.seguidores = new ArrayList<>();
        this.transmissaoAtiva = null;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarSeguidor(Usuario usuario) {
        seguidores.add(usuario);
    }

    public void iniciarTransmissao(String titulo) {
        transmissaoAtiva = new Livestreaming(titulo);
        System.out.println("Transmissão '" + titulo + "' iniciada no canal " + nome);
    }

    public Livestreaming getTransmissaoAtiva() {
        return transmissaoAtiva;
    }
}
