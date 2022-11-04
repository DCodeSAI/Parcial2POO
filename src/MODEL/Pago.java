package MODEL;

public class Pago {

    private String tipoPago;

    private double cantidadPago;

    private boolean validacionPago;

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public double getCantidadPago() {
        return cantidadPago;
    }

    public void setCantidadPago(double cantidadPago) {
        this.cantidadPago = cantidadPago;
    }

    public boolean isValidacionPago() {
        return validacionPago;
    }

    public void setValidacionPago(boolean validacionPago) {
        this.validacionPago = validacionPago;
    }
}
