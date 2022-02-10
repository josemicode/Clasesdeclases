package herencias.clases;

import herencias.interfaces.iConsultable;
import herencias.interfaces.iPublicacion;

public class Revista implements iPublicacion, iConsultable {

    private String codigo;
    private String autor;
    private String titulo;
    private String ano;
    private boolean enconsulta;

    public Revista(String codigo, String autor, String titulo, String ano, boolean enconsulta) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.ano = ano;

        this.enconsulta = enconsulta;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getAno() {
        return ano;
    }

    @Override
    public void setAno(String ano) {
        this.ano = ano;
    }


    @Override
    public void retirar() {
        this.enconsulta = true;
    }

    @Override
    public void reinsertar() {
        this.enconsulta = false;
    }

    @Override
    public boolean isBeingConsultada() {
        return enconsulta;
    }
}
