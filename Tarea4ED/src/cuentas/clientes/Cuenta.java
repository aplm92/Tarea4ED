package cuentas.clientes;

/**
 * Clase que representa una cuenta bancaria.
 * 
 * @autor Alberto Pérez López-Menchero
 * @version 1.3
 * @since 25-02-2025
 */
public class Cuenta {

    private String apellidos; // Esta línea se añade para comprobar los commit y push v1.1
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    private double facturaLuz; // Nueva línea añadida v1.2

    /**
     * Constructor por defecto de la clase Cuenta.
     */
    public Cuenta() {
        nombre = "";
        apellidos = ""; // Nueva línea añadida v1.3
        cuenta = "";
        saldo = 0;
        tipoInteres = 0;
        facturaLuz = 0; // Nueva línea añadida v1.3
    }

    /**
     * Constructor con parámetros de la clase Cuenta.
     * 
     * @param nom   Nombre del titular de la cuenta.
     * @param cue   Número de la cuenta.
     * @param sal   Saldo inicial de la cuenta.
     * @param tipo  Tipo de interés de la cuenta.
     */
    public Cuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return Saldo actual de la cuenta.
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad en la cuenta.
     * 
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad de la cuenta.
     * 
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return Nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre Nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de la cuenta.
     * 
     * @return Número de la cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de la cuenta.
     * 
     * @param cuenta Número de la cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo de la cuenta.
     * 
     * @return Saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo Saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * 
     * @return Tipo de interés.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     * 
     * @param tipoInteres Tipo de interés.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}