public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private String genero;

    public Livro(String titulo, String autor, int paginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.genero = genero;
    }

    public void abrir() {
        System.out.println("O livro foi aberto.");
    }

    public void fechar() {
        System.out.println("O livro foi fechado.");
    }

    public void ler() {
        System.out.println("Você está lendo \"" + titulo + "\" de " + autor + ".");
    }

    public void marcarPagina(int pagina) {
        System.out.println("Página " + pagina + " marcada no livro \"" + titulo + "\".");
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Páginas: " + paginas + ", Gênero: " + genero);
    }
}