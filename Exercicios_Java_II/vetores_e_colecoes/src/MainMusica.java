public class MainMusica {
    public static void main(String[] args) {
        Spotify s1 = new Spotify();
        Musica m1 = new Musica("Stay", "Post Malone", 230);
        Musica m2 = new Musica("Memento mori", "LetoDie", 400);
        Musica m3 = new Musica("Nego Drama", "Racionais", 800);
        Musica m4 = new Musica("Oitavo anjo", "509-E", 780);

        s1.adicionarMusica(m1);
        s1.adicionarMusica(m2);
        s1.adicionarMusica(m3);
        s1.adicionarMusica(m4);

        s1.imprimirMusicas();

        System.out.println("---------------");

        s1.imprimirAleatorio();

        System.out.println("---------------");
    }
}
