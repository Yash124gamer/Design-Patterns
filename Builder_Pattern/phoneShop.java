package Builder_Pattern;
public class phoneShop {
    public static void main(String[] args){
        phone p = new phoneBuilder().setCamera(50).getPhone();
        System.out.println(p);
    }
}
