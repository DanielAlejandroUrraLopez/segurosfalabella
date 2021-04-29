package cl.segurosfalabella.segurosfalabellatest.segurosfalabellatest.service;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.doReturn;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import cl.segurosfalabella.segurosfalabellatest.segurosfalabellatest.dao.SegurosFalabellaTestDao;
import cl.segurosfalabella.segurosfalabellatest.segurosfalabellatest.dao.SegurosFalabellaTestProductoVendidoDao;
import cl.segurosfalabella.segurosfalabellatest.segurosfalabellatest.dto.Producto;
import cl.segurosfalabella.segurosfalabellatest.segurosfalabellatest.dto.ProductoVendido;
import cl.segurosfalabella.segurosfalabellatest.segurosfalabellatest.service.impl.SegurosFalabellaTestServiceImpl;

@ExtendWith(MockitoExtension.class)
public class SegurosFalabellaTestServiceImplTest {

private MockMvc mockMvc;
	
	@InjectMocks
	private SegurosFalabellaTestServiceImpl segurosFalabellaTestServiceImpl;
	
	@Mock
	private SegurosFalabellaTestDao segurosFalabellaTestDao;

	@Mock
	private SegurosFalabellaTestProductoVendidoDao segurosFalabellaTestProductoVendidoDao;
	
	@BeforeEach
    public void config() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(segurosFalabellaTestServiceImpl).build();
    }
	
	@Test
	public void ventaDeProductoTest() {
		Optional<Producto> op = null ;
		
		doReturn(op).when(segurosFalabellaTestDao).findById(1);		
		String r = segurosFalabellaTestServiceImpl.ventaDeProducto(1);		
		
		assertNotNull(r);
	}
	
	@Test
	public void agregarProductoTest() {
		Producto p = new Producto();
		p.setId(1);
		p.setNombre("nombre");
		p.setPrice(1000);
		p.setSellIn(10);
		
		doReturn(p).when(segurosFalabellaTestDao).save(p);		
		String r = segurosFalabellaTestServiceImpl.agregarProducto(p);		
		
		assertNotNull(r);
	}
	
	@Test
	public void listaProductosVendidosTest() {
		Iterable<ProductoVendido> pv = null;
		
		doReturn(pv).when(segurosFalabellaTestProductoVendidoDao).findAll();		
		 List<ProductoVendido> r = segurosFalabellaTestServiceImpl.listaProductosVendidos();		
		
		assertNull(r);
	}
	
}
