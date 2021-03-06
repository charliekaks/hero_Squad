import org.junit.*;
import static org.junit.Assert.*;
public class SquadTest{
  @Test
  public void squad_instanciatesTheObjectAppropriately_true(){
      Squad heroSquad = new Squad("Young Justice", "the law", 4);
      assertEquals(true, heroSquad instanceof Squad);
  }
  @Test
  public void getName_instanciatesTheNameCorrectly_string(){
    Squad heroSquad = new Squad("Young Justice", "the law", 4);;
    assertEquals("Young Justice", heroSquad.getName());    
  }
  @Test
  public void all_returnAllInstancesOfSquad_true(){
    Squad firstHeroSquad = new Squad("Young Justice", "the law", 4);
    Squad secondHeroSquad2 = new Squad("League of Legends", "the law", 4); 
    assertEquals(true, Squad.all().contains(firstHeroSquad));
    assertEquals(true, Squad.all().contains(secondHeroSquad2));
  }
  @Test
  public void clear_emptiesAllCategoriesFromList_0(){
    Squad heroSquad = new Squad("Young Justice", "the law", 4);
    Squad.clear();
    assertEquals(Squad.all().size(), 0);
  }
  @Test
  public void getId_SquadInstanceWithId_1(){
    Squad.clear();
    Squad heroSquad = new Squad("Young Justice", "the law", 4);
    assertEquals(1, heroSquad.getId());
  }
  @Test
  public void find_returnsSquadWithTheSameId_firstHeroSquad(){
    Squad.clear();
    Squad firstHeroSquad = new Squad("Young Justice", "the law", 4);
    Squad secondHeroSquad2 = new Squad("League of Legends", "the law", 4); 
    assertEquals(Squad.find(firstHeroSquad.getId()), firstHeroSquad);
    }
    @Test
    public void addHero_addHeroToSquad_true(){
      Squad heroSquad = new Squad("Young Justice", "the law", 4);;
     Heros testHero = new Heros("DeadPool",42,"immortal","ugly"); 
     heroSquad.addHero(testHero);
     assertTrue(heroSquad.getHeros().contains(testHero));  
    }

}
