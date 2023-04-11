/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.de.productos.dos;

/**
 *
 * @author SG701-03
 */
public class Tienda {

    //atributos
    private Producto producto1;
    private Producto producto2;
    private Producto producto3;
    private Producto producto4;

//constructor
    public Tienda() {
        producto1 = new Producto();
        producto2 = new Producto();
        producto3 = new Producto();
        producto4 = new Producto();

    }

    public Tienda(Producto producto1, Producto producto2, Producto producto3, Producto producto4) {
        this.producto1 = producto1;
        this.producto2 = producto2;
        this.producto3 = producto3;
        this.producto4 = producto4;

    }

    public Producto getProducto1() {
        return producto1;
    }

    public void setProducto1(Producto producto1) {
        this.producto1 = producto1;
    }

    public Producto getProducto2() {
        return producto2;
    }

    public void setProducto2(Producto producto2) {
        this.producto2 = producto2;
    }

    public Producto getProducto3() {
        return producto3;
    }

    public void setProducto3(Producto producto3) {
        this.producto3 = producto3;
    }

    public Producto getProducto4() {
        return producto4;
    }

    public void setProducto4(Producto producto4) {
        this.producto4 = producto4;
    }
    //to string

    @Override
    public String toString() {
        return "Tienda{" + "producto1=" + producto1 + ", producto2=" + producto2 + ", producto3=" + producto3 + ", producto4=" + producto4 + '}';
    }

    //valo unitario 
    public void ValoresU() {

        System.out.println("\nlos valores unitarios son: " + this.producto1.getNombre() + this.producto1.getValorU() + " " + this.producto2.getNombre() + this.producto2.getValorU() + " " + this.producto3.getNombre() + this.producto3.getValorU() + " " + this.producto4.getNombre() + this.producto4.getValorU());
    }

    // promedio valores unitarios 
    public void PromedioVU() {
        System.out.println((this.producto1.getValorU() + this.producto2.getValorU() + this.producto3.getValorU() + this.producto4.getValorU()) / 4);

    }

    //detalles producto 1
    public void IVAValorUnitarioBodega() {
        System.out.println((this.producto1.getCantidadBodega() - this.producto1.getCantidadMinima()) * (this.producto1.getValorU() * (1 + Producto.IVA_PAPELERIA)));

    }
//dinero en caja 

    public double DineroEnCajaPapeleria(Producto prod) {

        double dinero = prod.getTotalProductosVendidos() * prod.getValorU() * (1 * Producto.IVA_PAPELERIA);
        System.out.println("Prar el producto " + prod.getNombre() + " su dinero en caja es " + dinero);
        return dinero;
    }
//dinero caja mercado

    public double DineroEnCajaMercado(Producto prod) {

        double dinero = prod.getTotalProductosVendidos() * prod.getValorU() * (1 * Producto.IVA_SUPERMERCADO);
        System.out.println("Prar el producto " + prod.getNombre() + " su dinero en caja es " + dinero);
        return dinero;
    }
//dinero en caja farmacia   

    public double DineroEnCajaFarmacia(Producto prod) {

        double dinero = prod.getTotalProductosVendidos() * prod.getValorU() * (1 * Producto.IVA_FARMACIA);
        System.out.println("Prar el producto " + prod.getNombre() + " su dinero en caja es " + dinero);
        return dinero;
    }
    //calcular dinero en caja de un producto

    public double calcularCajaProducto(Producto prod) {
        if (prod.getTipo() == Producto.PAPELERIA) {
            return DineroEnCajaPapeleria(prod);
        } else {
            if (prod.getTipo() == Producto.IVA_FARMACIA) {
                return DineroEnCajaFarmacia(prod);
            } else {

                return DineroEnCajaMercado(prod);
            }
        }

    }

    //
    public double calcularDineroEncaja() {
        return calcularCajaProducto(producto1)
                + calcularCajaProducto(producto2)
                + calcularCajaProducto(producto3)
                + calcularCajaProducto(producto4);

    }

}
