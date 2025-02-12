public class ComputerFactory {

    public static Computer getComputer(String type) {
        if (type.equals("PC")) {
            return new Windows();
        }
        if (type.equals("MAC")) {
            return new Macbook();
        }
        return null;
    }
}
