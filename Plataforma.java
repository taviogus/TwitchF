import java.util.ArrayList;

public class Plataforma {
    private ArrayList<Canal> canais;
    private ArrayList<Usuario> usuarios;

    public Plataforma() {
        this.canais = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void adicionarCanal(Canal canal) {
        canais.add(canal);
    }

    public Usuario buscarUsuario(String nome) {
        for (Usuario u : usuarios) {
            if (u.getNome().equals(nome)) {
                return u;
            }
        }
        return null;
    }

    public Canal buscarCanal(String nome) {
        for (Canal c : canais) {
            if (c.getNome().equals(nome)) {
                return c;
            }
        }
        return null;
    }
}