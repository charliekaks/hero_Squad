import org.junit.*;
import static org.junit.Assert.*;

public class HerosTest{
    @Test
    public void heros_instanciatesAppropriately_true(){
        Heros testHero = new Heros("DeadPool",42,"immortal","ugly");
        assertEquals(true, testHero instanceof Heros);
    }
    @Test 
    public void getName_instanciatesTheNameProperty_true(){
        Heros testHero = new Heros("DeadPool",42,"immortal","ugly");
        assertEquals("DeadPool", testHero.getName());
    }
    @Test
    public void getAge_instanciatesTheAgeProperty_String(){
        Heros testHero = new Heros("DeadPool",42,"immortal","ugly");
        assertEquals(42, testHero.getAge());
    }
    @Test
    public void getAge_instanciatesTheStrengthArray_String(){
        Heros testHero = new Heros("DeadPool",42,"immortal","ugly");
        assertEquals("immortal", testHero.getSuperPower());
    }
    @Test
    public void getAge_instanciatesTheWeaknessArray_String(){
        Heros testHero = new Heros("DeadPool",42,"immortal","ugly");
        assertEquals("ugly", testHero.getWeakness());
    }
    @Test
    public void clear_empitiesAllHerosFromAList_0(){
        Heros testHero = new Heros("DeadPool",42,"immortal","ugly"); 
        Hero.clear();
        assertEquals(expected, actual);
    }
}