import java.util.*;
public class Cameler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a \"CamelCase\" string: ");
        String in = input.nextLine();
        String[] ret = StringManip.camelCaser(in);
        for(int x = 0; x < ret.length; x++) {
            System.out.println(ret[x]);
        }
    }
}
