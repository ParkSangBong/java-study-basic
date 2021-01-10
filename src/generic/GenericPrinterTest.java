package generic;

public class GenericPrinterTest {

    public static void main(String[] args) {

        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<Powder>();
        Powder powder = new Powder();
        powderGenericPrinter.setMaterial(powder);

        System.out.println(powderGenericPrinter.toString());

        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<Plastic>();
        Plastic plastic = new Plastic();
        plasticGenericPrinter.setMaterial(plastic);

        System.out.println(plasticGenericPrinter.toString());

        powderGenericPrinter.printing();
        plasticGenericPrinter.printing();

    }

}
