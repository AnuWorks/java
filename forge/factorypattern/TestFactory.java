package forge.factorypattern;

public class TestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC");
        assert pc != null;
        System.out.println(pc.getRAM());

        Computer mac = ComputerFactory.getComputer("MAC");
        assert mac != null;
        System.out.println(mac.getRAM());
    }
}
