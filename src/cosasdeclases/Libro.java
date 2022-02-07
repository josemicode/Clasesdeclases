package cosasdeclases;

public class Libro {

    private String ISBN;
    private String title;
    private String author;
    private int numpag;
    private String genre;
    private String reldate;
    private String editorial;
    private boolean prestado;

    public Libro(String ISBN, String title, String author, int numpag, String genre, String reldate, String editorial, boolean prestado) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.numpag = numpag;
        this.genre = genre;
        this.reldate = reldate;
        this.editorial = editorial;
        this.prestado = prestado;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumpag() {
        return numpag;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReldate() {
        return reldate;
    }

    public void setReldate(String reldate) {
        this.reldate = reldate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void prestamo() {
        if(prestado) {
            prestado = false;
        }

        if(!prestado){
            prestado = true;
        }
    }

    public void comparar(Libro libro2) {
        if (this.numpag == libro2.numpag) {
            System.out.println("El número de páginas es igual en ambos libros");
        }

        if (this.numpag > libro2.numpag) {
            System.out.println(this.title + " tiene más páginas que " + libro2.title);
        }

        if (this.numpag < libro2.numpag) {
            System.out.println(this.title + " tiene menos páginas que " + libro2.title);
        }
    }
}
