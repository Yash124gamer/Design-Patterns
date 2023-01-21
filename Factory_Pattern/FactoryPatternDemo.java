import java.util.Scanner;
public class FactoryPatternDemo{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ShapeFactory SF = new ShapeFactory();
        System.out.println("Enter the Shape you want to Draw");
        String shape = scan.nextLine();
        scan.close();
        Shape sh = SF.getShape(shape);
        sh.draw();
    }
}