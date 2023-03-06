
package vehiculo;

/**
 *
 * @author 
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoCAB2223 miVehiculoCAB2223;
        int stockActual;
        
        miVehiculoCAB2223 = new VehiculoCAB2223("Seat",18000,100);
        operativaVehiculosCAB2223(miVehiculoCAB2223, 20);
        operativaVehiculosCAB2223(miVehiculoCAB2223, 100);

        stockActual = miVehiculoCAB2223.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    private static void operativaVehiculosCAB2223(VehiculoCAB2223 miVehiculoCAB2223) {
        operativaVehiculosCAB2223(miVehiculoCAB2223, 50);
    }

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
    
