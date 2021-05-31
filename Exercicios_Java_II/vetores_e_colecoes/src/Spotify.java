import java.util.ArrayList;
import java.util.Collections;
public class Spotify {
    private ArrayList<Musica> musicas;
    private ArrayList<Musica> musicasAleatorias;
    private Musica logMusica;

    public Spotify()
    {
        this.musicas = new ArrayList<>();
        this.musicasAleatorias = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica)
    {
        musicas.add(musica);
    }

    public void imprimirMusicas()
    {
        for(int i = 0; i < this.musicas.size(); i++)
        {
            this.logMusica = this.musicas.get(i);
            System.out.println(logMusica.getNome());
        }
    }

    public void imprimirAleatorio()
    {
        this.musicasAleatorias = this.musicas;
        Collections.shuffle(this.musicasAleatorias);

        for(int i = 0; i < this.musicasAleatorias.size(); i++)
        {
            this.logMusica = this.musicasAleatorias.get(i);
            System.out.println(logMusica.getNome());
        }
    }
}
