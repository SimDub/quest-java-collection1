import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        Hero widow = new Hero ("Black Widow", 34);
        Hero captain = new Hero ("Captain America", 100);
        Hero vision = new Hero ("Vision", 3);
        Hero iron = new Hero ("Iron Man", 48);
        Hero scarlet = new Hero ("Scarlet Witch", 29);
        Hero thor = new Hero ("Thor", 1500);
        Hero peter = new Hero("Spider-Man", 18);
        Hero hulk = new Hero ("Hulk", 49);
        Hero doc = new Hero ("Doctor Strange", 42);

        ArrayList<Hero> heroes = new ArrayList<>();

        heroes.add(widow);
        heroes.add(captain);
        heroes.add(vision);
        heroes.add(iron);
        heroes.add(scarlet);
        heroes.add(thor);
        heroes.add(peter);
        heroes.add(hulk);
        heroes.add(doc);

        thor.setAge(1501);

        Collections.shuffle(heroes);

        List<Hero> leftAlive = heroes.subList(0, (heroes.size()/2));

        for (Hero alive : leftAlive ) {
            System.out.println(alive.getName());
        }
    }
}
