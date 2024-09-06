public class Livestreaming {
    private String titulo;
    private int visualizadores;

    public Livestreaming(String titulo) {
        this.titulo = titulo;
        this.visualizadores = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void aumentarVisualizadores() {
        visualizadores++;
    }
}
