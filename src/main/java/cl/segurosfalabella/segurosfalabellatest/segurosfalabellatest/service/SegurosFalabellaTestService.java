package cl.segurosfalabella.segurosfalabellatest.segurosfalabellatest.service;

import java.util.List;

import cl.segurosfalabella.segurosfalabellatest.segurosfalabellatest.dto.Producto;
import cl.segurosfalabella.segurosfalabellatest.segurosfalabellatest.dto.ProductoVendido;

public interface SegurosFalabellaTestService {
	
String ventaDeProducto(int id);
	
	String agregarProducto(Producto producto);
	
	List<ProductoVendido> listaProductosVendidos();
	
	List<ProductoVendido> listaProductosVendidosXDias(int dias);

}
