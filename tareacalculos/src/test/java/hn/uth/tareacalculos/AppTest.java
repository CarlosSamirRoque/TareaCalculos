package hn.uth.tareacalculos;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple Amp.
 */
public class AppTest {
public static Areas Calculos;
                    

@BeforeClass
public static void menu1() {
	System.out.println("Iniciando Menu...");
}
@Before
public void ArranqueCalculos() {
	System.out.println("Iniciando prueba de los calculos...");
	Calculos = new Areas();
}

                     
  @Test
      public void AreaCirculo() {
	  double radio;
	assertTrue(Areas.AreaCirculo(2)== 4);
      }
  
  @Test
  public void AreaCuadrado() {
	  assertTrue(Areas.AreaCuadrado(5,5)== 25);
  }
  
  @Test
  public void AreaRectangulo() {
	  assertTrue(Areas.rectangulo (2,3)==5);
  }
  
  @Test
  public void AreaTriangulo() {
	  assertTrue(Areas.rectangulo(7,10)/2 ==-35);
  }
  
  @After
  public void finalizacionCalculos() {
	  System.out.println("Fin de la prueba de los calculos");
  }
  
  @AfterClass
  public static void Menu() {
  	System.out.println("Finalizando Menu...");
  }
  }