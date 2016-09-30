package objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by nxtlvl on 9/30/2016.
 */
public class MyCollection {

    private static Random random = new Random();
    private static int index;
    private static String item;


    public static String myFriends(){

        List<String> myFriends = new ArrayList<String>();
        myFriends.add(0, "Banico");
        myFriends.add(1, "Bert");
        myFriends.add(2, "Canono");
        myFriends.add(3, "Jerimiah");
        myFriends.add(4, "Niel");
        myFriends.add(5, "Poolly");
        myFriends.add(6, "Tibon");

        index = random.nextInt(myFriends.size());

        item = myFriends.get(index);

        return item;

    }

    public static String myGirlFriends(){

        List<String> myGirlfriends = new ArrayList<String>();
        myGirlfriends.add(0, "Berta");
        myGirlfriends.add(1, "Bonie");
        myGirlfriends.add(2, "Cindy");
        myGirlfriends.add(3, "Jaine");
        myGirlfriends.add(4, "Jenny");
        myGirlfriends.add(5, "Lyn");
        myGirlfriends.add(6, "Stephie");

        index = random.nextInt(myGirlfriends.size());

        item = myGirlfriends.get(index);

        return item;
    }

    public static String relationship(){

        List<String> relationship = new ArrayList<String>();
        relationship.add(0,"is complicated with");
        relationship.add(1, "hates");
        relationship.add(2, "loves");
        relationship.add(3, "was friendzoned by");
        relationship.add(4, "was forgotten by");
        relationship.add(5, "broke-up with");
        relationship.add(6, "is inspired by");

        index = random.nextInt(relationship.size());

        item = relationship.get(index);

        return item;
    }

}
