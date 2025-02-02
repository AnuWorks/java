public class RemoveStringSpaces {
    public static void main(String[] args) {
        System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
    }

    public static String noSpace(final String x) {
        return x.replace(" ","");
    }
}
