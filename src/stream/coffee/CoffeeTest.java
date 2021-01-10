package stream.coffee;

public class CoffeeTest {

    public static void main(String[] args) {

        Coffee americano = new KenyaAmericano();
        americano.brewing();

        System.out.println();

        Coffee kenyaLatte = new Latte(new KenyaAmericano());
        kenyaLatte.brewing();

        System.out.println();

        Coffee kenyaMocha = new Mocha(new Latte(new KenyaAmericano()));
        kenyaMocha.brewing();

        System.out.println();

        Coffee etiopiaAmericano = new Mocha(new Latte(new EtiopiaAmericano()));
        etiopiaAmericano.brewing();

    }

}
