import org.junit.*;
import static org.junit.Assert.*;

public class HerosTest{
    @Test
    public void heros_instanciatesAppropriately_true(){
        Heros testHero = new Heros("DeadPool");
        assertEquals(true, testHero instanceof Heros);
    }
    @Test 
    public void getName_instanciatesTheNameProperty_true(){
        Heros testHero = new Heros("DeadPool");
        assertEquals("DeadPool", testHero.getName());
    }
    @Test
    public void getAge_instanciatesTheAgeProperty_String(){
        Heros testHero = new Heros("DeadPool");
        assertEquals(4, testHero.getAge(4));
    }
    @Test
    public void getAge_instanciatesTheStrengthArray_String(){
        Heros testHero = new Heros("DeadPool");
        assertEquals(0, testHero.getSuperPower().size());
    }
    @Test
    public void getAge_instanciatesTheWeaknessArray_String(){
        Heros testHero = new Heros("DeadPool");
        assertEquals(0, testHero.getWeakneses().size());
    }
}