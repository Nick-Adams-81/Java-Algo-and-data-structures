import java.util.HashMap;

public class Main {


    // main method
    public static void main(String[] args) {

        // pointers
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashMap<String, Integer> map3 = new HashMap<>();

        map1.put("Value", 11);
        map2 = map1; // this is a "pointer" to map1

        map1.put("Value", 22);
        map3.put("value", 34);
        map2 = map3; // this is a "pointer" to map3

        System.out.println(map1);
        System.out.println(map2);

        map1 = map3; // we are "pointing" map1 to map3
        System.out.println(map1);

//        Cookie cookieOne = new Cookie("green");
//        Cookie cookieTwo = new Cookie("blue");
//        cookieOne.setColor("red");
//        cookieTwo.setColor("orange");
//
//        BigO.printItems(10);
//        BigO.printMoreItems(5);
//        System.out.println(BigO.addStuff(3));
//        BigO.printStuff(4, 7);
//
//        System.out.println(cookieOne.getColor());
//        System.out.println(cookieTwo.getColor());
    }
}