
package vehiculo;

/**
 *El main contiene el uso de nuestra aplicacion
 * @author Carlos Arjona Badia
 */
public class Main {
    /**
     * El main contiene el uso de nuestra aplicacion
     * @param args 
     */
      public static void main(String[] args) {
        VehiculoCAB2223 miVehiculoCAB2223;
        int stockActual;
        
        miVehiculoCAB2223 = new VehiculoCAB2223("Seat",18000,100);
        operativaVehiculosCAB2223(miVehiculoCAB2223, 20);
        operativaVehiculosCAB2223(miVehiculoCAB2223, 100);

        stockActual = miVehiculoCAB2223.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }
      /**
       * Esta funcion solo con el vehiculo llama a la misma duncion pero con una cantidad base de 50
       * @param miVehiculoCAB2223 
       */
    private static void operativaVehiculosCAB2223(VehiculoCAB2223 miVehiculoCAB2223) {
        operativaVehiculosCAB2223(miVehiculoCAB2223, 50);
    }
    /**
     * Esta funcion recibe el vehiculo y la cantidad
     * Prueba a vender el vehiculo y comprueba si no hay excepciones
     * @param miVehiculoCAB2223
     * @param cantidad 
     */
    private static void operativaVehiculosCAB2223(VehiculoCAB2223 miVehiculoCAB2223, int cantidad) {
        try {
            System.out.println("Venta de Vehiculos");
            miVehiculoCAB2223.vender(cantidad);
        }catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
    }

}
    
