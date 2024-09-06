public class Usuario {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void seguirCanal(Canal canal) {
        canal.adicionarSeguidor(this);
        System.out.println(nome + " seguiu o canal: " + canal.getNome());
    }

    public void assistirTransmissao(Canal canal) {
        Livestreaming transmissao = canal.getTransmissaoAtiva();
        if (transmissao != null) {
            transmissao.aumentarVisualizadores();
            System.out.println(nome + " está assistindo: " + transmissao.getTitulo());
        } else {
            System.out.println("Sem Transmissão Ao vivo no momento: " + canal.getNome());
        }
    }
}
