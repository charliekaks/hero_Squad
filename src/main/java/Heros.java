import java.util.ArrayList;
import java.util.List;
public class Heros{
    //private variables that outline the heros properties
    private String heroName;
    private int heroAge;
    private List<String>heroSuperPower;
    private List <String> heroWeakness;

    public Heros(String name){
        heroName=name;
    }
    public String getName(){
        return heroName;
    }
    public int getAge(int age){
         heroAge=age;
         return heroAge;
    }
    public List getSuperPower(){
        heroSuperPower = new ArrayList<String>();
        return heroSuperPower;
    }
    public List getWeakneses(){
        heroWeakness = new ArrayList<String>();
        return heroWeakness;
    }
}
