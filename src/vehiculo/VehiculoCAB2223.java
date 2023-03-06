
package vehiculo;

/**
 * Esta clase contiene todos los datos de nuestro vheiculo y sus funcionamientos
 * @author Carlos Arjona Badia
 */
public class VehiculoCAB2223 {

    /**
     * @return Un string que contiene el nombre del vehiculo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre introduce el nombre al vehiculo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Un double con el precio del vehiculo
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio Introduce el precio del vehiculo
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return Un double con el precio mas el IVA del vehiculo
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * @param precioIVA Introduce el precio mas el IVA del vehiculo
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * @return Un int del stock del vehiculo
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock Introduce el stock del vehiculo
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /* Constructor sin argumentos */
    public VehiculoCAB2223 ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    
    
    public VehiculoCAB2223 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
   /**
    * 
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
     * 
     * @return Método que me devuelve el stock de vehiculos disponible en cada momento
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
   
    

