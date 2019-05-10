
package Modelo;

public class Trabajador {
   private String nombres;
   private String categoria;
   private String fecha;
   private int horasT;
   private int horasE;
   private double pagoHN;
   private double pagoHE;
   private double sueldoB;
   private double descuento;
   private double neto;

   public Trabajador(){
   }
   
   public Trabajador(String nombres, String categoria, String fecha, int horasT, int horasE, double pagoHN, double pagoHE, double sueldoB, double descuento, double neto) {
        this.nombres = nombres;  //SOBRECARGA
        this.categoria = categoria;
        this.fecha = fecha;
        this.horasT = horasT;
        this.horasE = horasE;
        this.pagoHN = pagoHN;
        this.pagoHE = pagoHE;
        this.sueldoB = sueldoB;
        this.descuento = descuento;
        this.neto = neto;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHorasT() {
        return horasT;
    }

    public void setHorasT(int horasT) {
        this.horasT = horasT;
    }

    public int getHorasE() {
        return horasE;
    }

    public void setHorasE(int horasE) {
        this.horasE = horasE;
    }

    public double getPagoHN() {
        return pagoHN;
    }

    public void setPagoHN(double pagoHN) {
        this.pagoHN = pagoHN;
    }

    public double getPagoHE() {
        return pagoHE;
    }

    public void setPagoHE(double pagoHE) {
        this.pagoHE = pagoHE;
    }

    public double getSueldoB() {
        return sueldoB;
    }

    public void setSueldoB(double sueldoB) {
        this.sueldoB = sueldoB;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }
   
   
   
}
