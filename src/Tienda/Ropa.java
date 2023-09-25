package Tienda;

public class Ropa extends Producto implements Envio{
    private String talla;

    public Ropa(String nombre, float precio, String talla){
        super(nombre, precio);
        this.talla = talla;

    }

    @Override
    public float getPrecio() {
        return super.getPrecio();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    public String getTalla() {
        return talla;
    }

    @Override
    public void calcularPrecio() {
        super.calcularPrecio();
        System.out.println("Talla: " + this.talla);
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
