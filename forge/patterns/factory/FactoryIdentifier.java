package forge.patterns.factory;

public class FactoryIdentifier {

    public static Factory getFactory(String type){
        return switch (type.toLowerCase()){
            case "milk" -> new MilkFactory();
            case "butter" -> new ButterFactory();
            default -> null;
        };
    }
}
