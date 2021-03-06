package com.charlscode.mascotasrecyclerview;

public class Mascota {
    private int foto;
    private String nombre;
    private String liked;
    private String likes;

    public Mascota(int foto, String nombre, String likes, String liked) {
        this.foto=foto;
        this.nombre=nombre;
        this.likes=likes;
        this.liked=liked;
    }

    public String getLiked() {
        return liked;
    }

    public void setLiked(String liked) {
        this.liked = liked;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
