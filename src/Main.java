
public class Main {


    // main method
    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("green");
        Cookie cookieTwo = new Cookie("blue");
        BigO.printItems(10);
        BigO.printMoreItems(5);
        System.out.println(BigO.addStuff(3));
        BigO.printStuff(4, 7);
        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());
    }
}
