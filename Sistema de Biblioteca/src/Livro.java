public  class Livro {
    private String titulo;
    private String autor;
    private String isbon;
    private boolean isEmprestado;

    public Livro(String titulo, String autor, String isbon) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbon = isbon;
        this.isEmprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEmprestado() {
        return isEmprestado;
    }

    public void setEmprestado(boolean emprestado) {
        isEmprestado = emprestado;
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

    public String getIsbon() {
        return isbon;
    }

    public void setIsbon(String isbon) {
        this.isbon = isbon;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbon='" + isbon + '\'' +
                super.toString() +
                '}';
    }
}