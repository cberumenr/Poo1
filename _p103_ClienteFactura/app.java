package _p103_ClienteFactura;

public class app {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Factura factura = new Factura();

        cliente1.setId("1");
        cliente1.setNombre("Juan");
        cliente1.setDesuento(45);

        factura.setId(1);
        factura.setMonto(578);
        factura.setCliente(cliente1);

        System.out.println(factura);
        System.out.println("Monto con descuento " + factura.getMontoConDescuento());

        Factura factura2 = new Factura(2, new Cliente("LigaMx-13", "Guillermo Ochoa", 10), 875);
        System.out.println("Factura Id: " + factura2.getId());
        System.out.println(" - Cliente Id       : " + factura2.getCliente().getId());
        System.out.println(" - Cliente Nombre   : " + factura2.getCliente().getNombre());
        System.out.println(" - Cliente Descuento: " + factura2.getCliente().getDesuento());
        System.out.println("Factura Monto: " + factura2.getMonto());
        System.out.println("Factura Monto con Descuento: " + factura2.getMontoConDescuento());
    }
}
