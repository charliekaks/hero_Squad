import org.junit.*;
import static org.junit.Assert.*;
public class SquadTest{
  @Test
  public void squad_instanciatesTheObjectAppropriately_true(){
      Squad heroSquad = new Squad("Young Justice");
      assertEquals(true, heroSquad instanceof Squad);
  }
  @Test
  public void getName_instanciatesTheNameCorrectly_string(){
    Squad heroSquad = new Squad("Young Justice");
    assertEquals("Young Justice", heroSquad.getName());    
  }
  @Test
  public void all_returnAllInstancesOfSquad_true(){
    Squad firstHeroSquad = new Squad("Young Justice");
    Squad secondHeroSquad2 = new Squad("League of Legends"); 
    assertEquals(true, Squad.all().contains(firstHeroSquad));
    assertEquals(true, Squad.all().contains(secondHeroSquad2));
  }
  @Test
  public void clear_emptiesAllCategoriesFromList_0(){
    Squad heroSquad = new Squad("Young Justice");
    Squad.clear();
    assertEquals(Squad.all().size(), 0);
  }
  @Test
  public void getId_SquadINstanceWithId_1(){
      
  }

}
