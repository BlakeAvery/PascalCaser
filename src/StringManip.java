public class StringManip {
    public static String[] camelCaser(String s) {
        String[] ret = s.split("(?=[A-Z])");
        for(String x: ret) {
            System.out.println(x);
        }
        return ret;
    }
}
