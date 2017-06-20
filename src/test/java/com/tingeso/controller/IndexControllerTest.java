/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tingeso.controller;

import com.tingeso.model.Cliente;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

//
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static org.openqa.selenium.Keys.TAB;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
/**
 *
 * @author Daniel
 */
public class IndexControllerTest {
    
    private static WebDriver driver = null;
 
    //nombre elemento para realizar la prueba
    private static String nombreCliente = "raul";
    private static String passCliente = "raul";
    
    private static String fecha = "02-05-17";

    private static String monto = "8000";
    
    
    
    public IndexControllerTest() {
    }
    
    /*@BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }*/
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of init method, of class IndexController.
     */
    
    @BeforeTest
    public static void InicializarDriver(){
        // magia informatica por q la ultima version de selenium no inicia automaticamente el firefox
        System.setProperty("webdriver.gecko.driver", "C:\\GeckoDriver\\geckodriver.exe");
        //iniciamos el driver
        driver = new FirefoxDriver();
        
    }
    
    @AfterTest
    public static void CerrarDriver(){
        driver.quit();
    }
    
     @Test
    public void IngresarOrden(){    
        
        /*//Primero nos logeamos correctamente
        //nos dirigimos al login
        driver.get("http://localhost:8080/Tingeso-master/");
        
        
            //buscamos la casilla para ingresar el nombre de usuario
            WebElement ingresarUser = driver.findElement(By.id("j_idt5:j_idt9"));
            ingresarUser.sendKeys(nombreCliente);
            //buscamos la casilla para ingresar el pass
            WebElement ingresarPass = driver.findElement(By.id("j_idt5:j_idt11"));
            ingresarPass.sendKeys(passCliente);
            //buscamos el boton aceptar
            WebElement botonEntrar = driver.findElement(By.id("j_idt5:j_idt13"));
            botonEntrar.click();
            
            //actualizar el driver a la nueva pagina q nos manden
            driver.switchTo().defaultContent();
            
            //esperar segundos para 
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            WebDriverWait espera = new WebDriverWait(driver, 10000);
            WebElement LabelCliente = driver.findElement(By.id("j_idt6:j_idt9"));
            espera.until(ExpectedConditions.visibilityOf(LabelCliente));
          
            //Ahora ingresamos los valores al menu
            //ingresamos una fecha en el calendario
                WebElement calendario = driver.findElement(By.id("j_idt6:datetime_input"));
                calendario.click();
                //navegamos por el calendario hasta la fecha 28
                List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
                for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("2"))
			{
				ele.click();
				break;
			}
			
		}
            
            //press tab
            calendario.click();
            calendario.sendKeys(Keys.TAB);
            
            //comida
            WebElement selectPlato = driver.findElement(By.id("j_idt6:j_idt12_label"));
            selectPlato.sendKeys(Keys.TAB);
            
            //edificio
            WebElement selectUbicacion = driver.findElement(By.id("j_idt6:j_idt15_label"));
            selectUbicacion.sendKeys(Keys.TAB);               
            
            
                WebElement ingresarMonto = driver.findElement(By.id("j_idt6:j_idt18"));
                ingresarMonto.clear();
                ingresarMonto.sendKeys(monto);
            
            //click en ordenar comida
            WebElement botonOrdenar = driver.findElement(By.id("j_idt6:j_idt24"));
            botonOrdenar.click();

            
            //esperar segundos para 
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            driver.switchTo().defaultContent();
            WebDriverWait espera2 = new WebDriverWait(driver, 20000);
            driver.switchTo().defaultContent();

            //WebElement mensaje = driver.findElement(By.xpath("//span[@class='ui-messages-info-detail']"));
            espera2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='ui-messages-info-detail']")));
           */
        
        System.out.println("add");
        int a = 2;
        int b = 2;
        OrdenController instance = new OrdenController();
        int expResult = 4;
        int result = instance.add(a, b);
        Assert.assertEquals(expResult, result);
    }
    
}
