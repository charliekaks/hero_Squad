import java.util.ArrayList;
import java.util.List;

public class Squad{
    private String squadName;
    private int mId;
    private static List<Squad> herosSquad = new ArrayList<Squad>();
    private List<Heros> mHeros;

    public Squad(String name){
        squadName = name;
        herosSquad.add(this);
        mId= herosSquad.size();
        mHeros = new ArrayList<Heros>();
    }
    public String getName(){
        return squadName;
    }
    public static List<Squad>all(){
        return herosSquad;
    }
    public static void clear(){
        herosSquad.clear();
    }
    public int getId(){
        return mId;
    }
    public static Squad find(int idNo){
        return herosSquad.get(idNo - 1);
    }
    public List <Heros> getHeros(){
        return mHeros;
    }
    public void addHero(Heros hero){
        mHeros.add(hero);
    }
}