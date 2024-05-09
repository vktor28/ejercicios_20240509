import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    /*
EJERCICIO TIENDA ZAPATERIA (segunda parte)

Vamos a probar a usar la herencia para evitar repetir código y unir las clases
 de zapatos.:

Crear una clase madre de las clases casual, elegante y deportes.
Y ver cómo se usa en el main.

Cómo creas un arraylist con todas las clases hijas para poder recorrer
sus propiedades?

Cómo sumarías todos los precios de todos los zapatos?

+EXTRA: que alguna clase (o más de una) tenga algún atributo extra (o más de uno). Ejemplo: la
categoría Elegante -> boolean tieneHebilla; En ese caso, no olvidar modificar el toString() y añadir
los métodos pertinentes (getters y setters).



    */
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);
    ArrayList <Zapatos> zapatosAll = new ArrayList<>();

    zapatosAll.add(new Elegante("Armani", "EA4507", "Piel", 38,350, true));
    zapatosAll.add(new Elegante("Prada", "PN50", "Piel", 36.5,295,true));
    zapatosAll.add(new Casual("Adidas", "Samba", "Piel", 44,94.95));
    zapatosAll.add(new Casual("Reebok", "Club C", "Piel", 44,79));
    zapatosAll.add(new Deporte("Nike", "Revolution", "Reciclado", 43,45.49));
    zapatosAll.add(new Deporte("Asics", "METASPEED", "Reciclado", 43, 89.95));
    System.out.println("BIENVENIDO A NUESTRA ZAPATERÍA");
    System.out.println("\nEstos son los modelos que tenemos en Stock.");
    boolean active = true;
    double totalCesta=0;
    
    separador();
    verZapatos(zapatosAll);
    separador();
    
    while (active) {
        System.out.println("¿Qué tipo de zapatos buscaba?");
        System.out.println("- 1.ELEGANTES\n- 2.CASUAL\n- 3.DEPORTE");
        int modelUserType = teclado.nextInt();
        teclado.nextLine();
        separador();
        System.out.println("Actualmente tenemos los siguientes modelos:");
        switch (modelUserType) {
            case 1:
            for(int i=0;i<zapatosAll.size();i++){
                if(zapatosAll.get(i) instanceof Elegante){
                    System.out.println(zapatosAll.get(i).getMarca() + " " + zapatosAll.get(i).getModelo());
                }}
                break;
            case 2:
            for(int i=0;i<zapatosAll.size();i++){
                if(zapatosAll.get(i) instanceof Casual){
                    System.out.println(zapatosAll.get(i).getMarca() + " " + zapatosAll.get(i).getModelo());
                }
            }
                
                break;
            case 3:
            for(int i=0;i<zapatosAll.size();i++){
                if(zapatosAll.get(i) instanceof Deporte){
                    System.out.println(zapatosAll.get(i).getMarca() + " " + zapatosAll.get(i).getModelo());
                }}
                
                break;
        
            default:
                break;
        }
        System.out.println("\n¿Qué marca le interesaría?");
        String modelUser = teclado.nextLine();
        for(int i=0; i<zapatosAll.size(); i++){
            if(modelUser.equalsIgnoreCase(zapatosAll.get(i).getMarca())){
                separador();
                System.out.println("-->Producto añadido a su cesta.");
                totalCesta+=zapatosAll.get(i).getPrecio();
            }
        }

    separador();
    System.out.println("Quieres comprar más zapatos?(SI/NO)");
    if (teclado.nextLine().equalsIgnoreCase("SI")) {
       
    } else {
        active=false;
        separador();
        System.out.println("Total Cesta: " + totalCesta + "€");
        System.out.println("\n//GRACIAS POR SU VISITA\n");
    }
    }

    }
    public static void separador(){
        System.out.println("\n-------\n");
    }
    public static void verZapatos(ArrayList<Zapatos> zapatosAll){
        double precioTotalAll=0;
        for(Zapatos x: zapatosAll){
            System.out.println("-->" + x.getMarca() + " | Modelo: " + x.getModelo() + " | Matrial: " + x.getMaterial() + " | Talla: " + x.getTalla() + " | Precio: " + x.getPrecio() + "€" );
            precioTotalAll=precioTotalAll+x.getPrecio();
        }
        System.out.println("El total de todos los zapatos es: " + String.format("%.2f",precioTotalAll) + "€");
        
    }
    
}


