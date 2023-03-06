
package vehiculo;

/**
 * Esta clase contiene todos los datos de nuestro vheiculo y sus funcionamientos
 * @author Carlos Arjona Badia
 */
public class VehiculoCAB2223 {

    /**
     * Devuelve un string que contiene el nombre del vehiculo
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * introduce el nombre al vehiculo
     * @param nombre el nombre al vehiculo
     * 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve un double con el precio del vehiculo
     * @return Un double con el precio del vehiculo
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Introduce el precio del vehiculo
     * @param precio Introduce el precio del vehiculo
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve un double con el precio mas el IVA del vehiculo
     * @return Un double con el precio mas el IVA del vehiculo
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * Introduce el precio mas el IVA del vehiculo
     * @param precioIVA Introduce el precio mas el IVA del vehiculo
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * Devuelve un int del stock del vehiculo
     * @return Un int del stock del vehiculo
     */
    public int getStock() {
        return stock;
    }

    /**
     * Introduce el stock del vehiculo
     * @param stock Introduce el stock del vehiculo
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /**
     * Constructor sin argumentos
     */
    public VehiculoCAB2223 ()
    {
    }

    /**
     * Constructor con parámetro para iniciar todas las propiedades de la clase
     * @param nom El nombre del Vehiculo
     * @param precio El precio
     * @param stock El stock
     */
    public VehiculoCAB2223 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
   /**
    * Introduce el nombre del vehiculo
    * @param nom Introduce el nombre del vehiculo
    */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    /**
     * Método que me devuelve el nombre del vehiculo
     * 
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método que me devuelve el stock de vehiculos disponible en cada momento
     * @return el stock de vehiculos disponible en cada momento
     */
     public int obtenerStock ()
    {
        return getStock();
    }

    /* Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }
    
    

    /**
     * Metodo que vende la cantidad de vehiculos
     * @param cantidad la cantidad de vehiculos a vender
     * @throws Exception Devuelve errores en caso de excepciones
     */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }
    
}  
   
    

