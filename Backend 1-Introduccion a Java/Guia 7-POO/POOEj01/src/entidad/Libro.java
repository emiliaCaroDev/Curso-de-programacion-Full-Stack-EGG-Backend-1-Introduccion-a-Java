package entidad;

public class Libro {

    private String ISBN;
    private String titulo;
    private String autor;
    private Integer numPaginas;


    //contructor por defecto
    public Libro(){}

    //constructor con parametros
    public Libro(String ISBN,String titulo, String autor,Integer numPaginas){
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.autor=autor;
        this.numPaginas=numPaginas;
    }

    //getters y setters
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString(){
        return "\nLibro: \nISBN: " +this.getISBN()+"\nTitulo: "+this.getTitulo()+"\nAutor: "+this.getAutor()+
                "\nNumero de paginas: "+this.getNumPaginas();
    }
}
