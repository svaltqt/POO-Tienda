package Tienda;

public class Libro extends Producto implements Envio {
    private String autor;
    private int anno;

    public Libro(String nombre, float precio, String autor, int anno) {
        super(nombre, precio);
        this.autor = autor;
        this.anno = anno;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public float getPrecio() {
        return super.getPrecio();
    }

    public int getAnno() {
        return anno;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public void calcularPrecio() {
        super.calcularPrecio();
        System.out.println("Autor: " + this.autor);
        System.out.println("Año: " + this.anno);

    }
    @Override
    public double calcularCosteEnvio() {
        if (this.getPrecio() < 15000){
            return 4500;
        }
        else {
            return 0;
        }
    }
}
