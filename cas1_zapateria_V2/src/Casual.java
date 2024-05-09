public class Casual extends Zapatos{

    public Casual(String marca, String modelo, String material, double talla, double precio) {
        super(marca, modelo, material, talla, precio);
    }





@Override
public String toString() {
    return "{" +
        " marca='" + getMarca() + "'" +
        ", modelo='" + getModelo() + "'" +
        ", material='" + getMaterial() + "'" +
        ", talla='" + getTalla() + "'" +
        ", precio='" + getPrecio() + "'" +
        "}";
}

}
