package Tienda;

public class Electronica extends Producto implements Envio{
    private String marca;

    public Electronica(String nombre, float precio, String marca){
        super(nombre, precio);
        this.marca = marca;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public float getPrecio() {
        return super.getPrecio();
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public void calcularPrecio() {
        super.calcularPrecio();
        System.out.println("Marca: " + this.marca);
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
    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + "\nPrecio: " + this.getPrecio() + "\nMarca: " + this.getMarca()  + "\nCosto de envío: " + calcularCosteEnvio() + "\n";
    }
}
