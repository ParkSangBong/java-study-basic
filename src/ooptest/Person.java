package ooptest;

public class Person {

    String personName;
    int money;

    public Person(String personName, int money){

        this.personName = personName;
        this.money = money;

    }

    public void buyStarCoffee(StarCoffee starCoffee, int money){

        String message = starCoffee.brewing(4000);
        if(message != null){

            this.money -= money;
            System.out.println(personName + " 이 " + money + " 으로 " + message);

        }

    }

    public void buyBeanCoffee(BeanCoffee beanCoffee, int money){

        String message = beanCoffee.brewing(4500);
        if(message != null){

            this.money -= money;
            System.out.println(personName + " 이 " + money + " 으로 " + message);

        }

    }

}
