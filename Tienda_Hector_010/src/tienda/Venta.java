package tienda;
import java.util.Date;
public class Venta {
	
	String id_Cliente;
	String id_Producto;
	String id_Vendedor;
	String id_tienda;
	Date fecha_hora;
	public String getId_Cliente() {
		return id_Cliente;
	}
	public void setId_Cliente(String id_Cliente) {
		this.id_Cliente = id_Cliente;
	}
	public String getId_Producto() {
		return id_Producto;
	}
	public void setId_Producto(String id_Producto) {
		this.id_Producto = id_Producto;
	}
	public String getId_Vendedor() {
		return id_Vendedor;
	}
	public void setId_Vendedor(String id_Vendedor) {
		this.id_Vendedor = id_Vendedor;
	}
	public String getId_tienda() {
		return id_tienda;
	}
	public void setId_tienda(String id_tienda) {
		this.id_tienda = id_tienda;
	}
	public Date getFecha_hora() {
		return fecha_hora;
	}
	public void setFecha_hora(Date fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	
	
	

}
