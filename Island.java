import java.util.*;


/**
 * An island is part of a FIRE resort.Each island has a name,  a luxury rating
 * and a capacity which represents the maximum number of people(passes) who can be on the
 * island at any one time. Each island must maintain a list of all people (passes)
 * currently on the island. These lists are updated whenever passes enter or leave
 * an island,so that it is always possible to say which passes are on the island
 *
 * @author (Klevi20067052)
 * @version (a version number or a date)
 */
public class Island {
    private int islandID;
    private String islandName;
    private int islandRating;
    private int islandCapacity;
    private ArrayList<Pass> passList;

    public Island(int id, String name, int rate, int capacity) {
        islandID = id;
        islandName = name;
        islandRating = rate;
        islandCapacity = capacity;
        passList = new ArrayList<Pass>(islandCapacity);
    }

    public int getIslandNumber() {
        return islandID;
    }

    public String getIslandName() {
        return islandName;
    }

    public int getIslandRating() {
        return islandRating;
    }

    public int getIslandCapacity() {
        return islandCapacity;
    }

    public boolean canPassEnter(Pass temp) {
        return passList.size() <= islandCapacity;
    }

    public void enter(Pass temp) {
        if (passList.size() < islandCapacity) {passList.add(temp);}
    }
    public void leave(Pass temp) {
        passList.remove(temp);
    }

    public String capacity() {
        if (passList.size() < islandCapacity) {
            return "The island has capacity";
        } else return "The island reached the maximum capacity";
    }

    public void listCurrentPasses(){

        for (Pass p : passList) {
            System.out.println(p);
        }
    }

    public Pass getPassDetails(int id) {
        for (Pass temp : passList) {
            if (temp.getPassIdNumber() == id) {
                return temp;
            }
        }
        return null;
    }

    public boolean isPassOnIsland(Pass p) {
        return passList.contains(p);
    }

    public String toString() {
        return "\n" + "********************\nIsland ID Number: " +
                islandID + "\nIsland Name: " +
                islandName + "\nIsland Rating: " +
                islandRating + "\nIsland capacity: " +
                islandCapacity + "\nPass List in Island: " + "\n" +
                passList + "\n********************";
    }
}

