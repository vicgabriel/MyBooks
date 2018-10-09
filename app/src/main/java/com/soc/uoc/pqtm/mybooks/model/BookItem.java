package com.soc.uoc.pqtm.mybooks.model;

import java.util.Date;

public class BookItem {

private int identificador;
private String Titulo;
private String Autor;
private Date Data_de_publicacion;
private String Descripcion;
private String url;

    public BookItem() {
    }

    public BookItem(int identificador, String titulo, String autor, Date data_de_publicacion, String descripcion, String url) {
        this.identificador = identificador;
        Titulo = titulo;
        Autor = autor;
        Data_de_publicacion = data_de_publicacion;
        Descripcion = descripcion;
        this.url = url;
    }
}
