package lab7p2_diegomaradiaga;

import java.util.ArrayList;

public class Carpetas {
    private String nombre, link;
    private ArrayList <Archivos> archivos = new ArrayList();
    private ArrayList <Carpetas> carpetas = new ArrayList();

    public Carpetas() {
    }
    
    public Carpetas(String nombre, String link) {
        this.nombre = nombre;
        this.link = link;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<Archivos> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivos> archivos) {
        this.archivos = archivos;
    }

    public ArrayList<Carpetas> getCarpetas() {
        return carpetas;
    }

    public void setCarpetas(ArrayList<Carpetas> carpetas) {
        this.carpetas = carpetas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public String toStringL() {
        return link;
    }
}
