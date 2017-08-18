
public class Heros{
    //private variables that outline the heros properties
    private String heroName;
    private int heroAge;
    private String heroSuperPower;
    private String heroWeakness;

    public Heros(String name,int age, String power, String weakness){
        heroName=name;
        heroAge=age;
        heroSuperPower = power;
        heroWeakness = weakness;
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
    public String getWeakneses(){
        return heroWeakness;
    }
}
