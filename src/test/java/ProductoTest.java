
import com.mycompany.parcial1.Principal;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {
<<<<<<< Updated upstream
    /**
     private Principal principal;
=======

    private Principal principal;
>>>>>>> Stashed changes

    @BeforeEach
    public void setUp() {
        Principal.productos.clear();
    }

    @Test
    public void testAgregarDispositivo() {
        Laptop laptop = new Laptop();
        laptop.setNombre("Laptop Test");
        laptop.setPrecio(1000.0);
        laptop.setCantidad(10);

        Principal.agregarDispositivo(laptop);

        assertEquals(1, Principal.productos.size());
        assertEquals("Laptop Test", Principal.productos.get(0).getNombre());
    }

    @Test
    public void testVenderDispositivo() {
        Laptop laptop = new Laptop();
        laptop.setNombre("Laptop Test");
        laptop.setPrecio(1000.0);
        laptop.setCantidad(10);

        Principal.agregarDispositivo(laptop);

        Principal.venderDispositivo(0, 5);

        assertEquals(5, Principal.productos.get(0).getCantidad());
        assertEquals(1, Principal.productos.size());

        Principal.venderDispositivo(0, 5);

        assertEquals(0, Principal.productos.size());
    }

    @Test
    public void testMostrarInventario() {
        Laptop laptop = new Laptop();
        laptop.setNombre("Laptop Test");
        laptop.setPrecio(1000.0);
        laptop.setCantidad(10);

        Principal.agregarDispositivo(laptop);

        // Captura la salida estándar para verificar la salida del método mostrarInventario
        // Para hacer esto normalmente usarías un sistema más complejo con `System.setOut`, 
        // pero aquí solo estamos verificando la lógica.
        Principal.mostrarInventario();
        assertTrue(Principal.productos.size() > 0);
    }
<<<<<<< Updated upstream
    **/
    
=======
>>>>>>> Stashed changes

}
