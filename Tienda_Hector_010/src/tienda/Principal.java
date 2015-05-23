package tienda;
import java.util.Date;

public class Principal {

	public static void main(String [] args){
		
		Clientes c1 = new Clientes();
		Clientes c2 = new Clientes();
		Clientes c3= new Clientes();
		
		Productos p1 = new Productos();
		Productos p2 = new Productos();
		Productos p3 = new Productos();
		
		Tiendas t1 = new Tiendas();
		Tiendas t2 = new Tiendas();
		Tiendas t3 = new Tiendas();
		
		Vendedores vs1 = new Vendedores();
		Vendedores vs2 = new Vendedores();
		Vendedores vs3 = new Vendedores();
		
		Venta v1 = new Venta();
		Venta v2 = new Venta();
		Venta v3 = new Venta();
		
		
			System.out.println("Introduce el id del cliente: ");
			c1.setId_Cliente(Leer.pedirCadena());
			System.out.println("Introduce el id del vendedor: ");
			vs1.setId_Vendedor(Leer.pedirCadena());
			System.out.println("Introduce el id de la tienda: ");
			t1.setId_Tienda(Leer.pedirCadena());
			System.out.println("Introduce el id del producto: ");
			p1.setId_Producto(Leer.pedirCadena());
			java.util.Date fecha = new Date();
			v1.setFecha_hora(fecha);
		
	}
}
