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
}