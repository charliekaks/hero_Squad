
import java.util.ArrayList;
import java.util.List;
public class Heros{
    //private variables that outline the heros properties
    private String heroName;
    private int heroAge;
    private String heroSuperPower;
    private String heroWeakness;
    private static List<Heros> herosList = new ArrayList<Heros>();
    private int mId;

    public Heros(String name,int age, String power, String weakness){
        heroName=name;
        heroAge=age;
        heroSuperPower = power;
        heroWeakness = weakness;
        herosList.add(this);
        mId = herosList.size();
    }
    public String getName(){
        return heroName;
    }
    public int getAge(){
         return heroAge;
    }
    public String getSuperPower(){
        return heroSuperPower;
    }
    public String getWeakness(){
        return heroWeakness;
    }
    public static List<Heros> all(){
        return herosList;
    }
    public static void clear() {
        herosList.clear();
      }
    public int getId() {
        return mId;
      }
      public static Heros find(int id) {
        return herosList.get(id - 1);
      }
}
