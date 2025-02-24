package cuentas.clientes;

/**
 * Clase principal para probar la funcionalidad de la clase Cuenta.
 * 
 * @autor Alberto Pérez López-Menchero
 * @version 1.3
 * @since 25-02-2025
 */
public class Main {

    /**
     * Método principal que ejecuta la operativa de la cuenta.
     * 
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        operativa_cuenta(null);
    }

    /**
     * Realiza operaciones de ingreso y retirada en una cuenta.
     * 
     * @param cantidad Cantidad a ingresar o retirar (no se utiliza en este ejemplo).
     */
    private static void operativa_cuenta(java.lang.Float cantidad) {
        Cuenta cuenta1;
        double saldoActual;

        cuenta1 = new Cuenta("Rafael Nadal Parera", "1000-2365-85-1230456789", 2500, 0);

        System.out.println("El saldo actual es:" + cuenta1.estado());

        try {
            cuenta1.retirar(2300);
            System.out.println("El saldo actual es:" + cuenta1.estado());
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
            System.out.println("El saldo actual es:" + cuenta1.estado());
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}