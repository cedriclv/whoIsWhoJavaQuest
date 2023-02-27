public class Classroom {
    public static void main(String[] args) {
        Wilder william = new Wilder("william", true);
        Wilder mickael = new Wilder("mickael", true);
        Wilder cedric = new Wilder("cedric", false);
        
        System.out.println(william.whoAmI());
        System.out.println(mickael.whoAmI());
        System.out.println(cedric.whoAmI());
    }
}
