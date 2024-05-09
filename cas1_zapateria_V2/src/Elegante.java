public class Elegante extends Zapatos{
        boolean tieneHebilla;
        public Elegante(String marca, String modelo, String material, double talla, double precio, boolean tieneHebilla) {
            super(marca, modelo, material, talla, precio);
            this.tieneHebilla=tieneHebilla;
        }
        public boolean isTieneHebilla() {
            return this.tieneHebilla;
        }

        public boolean getTieneHebilla() {
            return this.tieneHebilla;
        }

        public void setTieneHebilla(boolean tieneHebilla) {
            this.tieneHebilla = tieneHebilla;
        }


        @Override
        public String toString() {
            return "{" +
                " marca='" + getMarca() + "'" +
                ", modelo='" + getModelo() + "'" +
                ", material='" + getMaterial() + "'" +
                ", talla='" + getTalla() + "'" +
                ", precio='" + getPrecio() + "'" +
                ", hebilla='" + isTieneHebilla() + "'" +
                "}";
        }
        public String toString2() {
            return "{" +
  
                ", hebilla='" + isTieneHebilla() + "'" +
                "}";
        }

        }

    