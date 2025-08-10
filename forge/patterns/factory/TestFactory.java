package forge.patterns.factory;

public class TestFactory {
    public static void main(String[] args) {
        Factory milk = FactoryIdentifier.getFactory("Milk");
        assert milk != null;
        System.out.println(milk.getName());

        Factory butter = FactoryIdentifier.getFactory("butter");
        assert butter != null;
        System.out.println(butter.getName());
    }
}
