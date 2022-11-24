import java.util.*;


/**
 * An island is part of a FIRE resort.Each island has a name,  a luxury rating
 * and a capacity which represents the maximum number of people(passes) who can be on the
 * island at any one time. Each island must maintain a list of all people (passes)
 * currently on the island. These lists are updated whenever passes enter or leave
 * an island,so that it is always possible to say which passes are on the island
 *
 * @author (20067052)
 * @version (a version number or a date)
 */
public class Island {
    private int island_ID;
    private String island_Name;
    private int island_Rating;
    private int island_capacity;
    private ArrayList<Pass>passList;

    public Island(int id,String name,int rate,int capacity){
        island_ID=id;
        island_Name=name;
        island_Rating=rate;
        island_capacity=capacity;
        passList=new ArrayList<Pass>(island_capacity);
    }
    public int islandNumber(){return island_ID;}
    public String islandName(){return island_Name;}
    public int islandRating(){return island_Rating;}
    public int islandCapacity(){return island_capacity;}

    public boolean PassEnter(Pass temp){
        return passList.size() <= island_capacity;
    }
    public void enter(Pass temp){
        if(passList.size()<island_capacity){
            passList.add(temp);
        }
    }
    public void leave(Pass temp){
        passList.remove(temp);
    }
public String capacity() {
        if (passList.size()<island_capacity)
    {
        return "The island has capacity";
    }else return "The island reached the maximum capacity";
}
    public void listCurrentPasses(){

        for(Pass p :passList){
            System.out.println(p);
        }}
    public String listPass(){
        String s="";
        for(Pass p :passList){
            s = s + p.toString() +"\n";
        }
        return s;
    }
    public Pass getPassDetails(int id) {
        for (Pass temp:passList){
            if(temp.getPassIdNumber()==id){
                return temp;
            }
        }
        return null;
    }

    public boolean isPassOnIsland(Pass p){
        return passList.contains(p);
    }
public String toString() {
    return "\n"+"********************\nIsland ID Number: " +
            island_ID + "\nIsland Name: " +
            island_Name + "\nIsland Rating: " +
            island_Rating + "\nIsland capacity: " +
            island_capacity + "\nPass List in Island: "+"\n"+
            passList + "\n********************";
}
}

