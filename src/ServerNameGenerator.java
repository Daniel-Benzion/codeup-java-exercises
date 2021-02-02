import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives = {"monstrous", "strong", "colorful", "loud", "hyperbolic", "energetic", "polymorphic", "encapsulated", "abstract", "artificial"};

        String[] nouns = {"desert", "battlecruiser", "rapier", "squirrel", "television", "stapler", "electron", "sky", "ocean", "leviathan"};

        System.out.println("Here is your random server name:");
        System.out.println(randomString(adjectives) + "-" + randomString(nouns));
    }

    public static String randomString(String[] array) {
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }
}
