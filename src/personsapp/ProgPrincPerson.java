package personsapp;

import personsapp.Person;

public class ProgPrincPerson {

    public static void main(String[] args) {

        Person x = new Person();
        x.setCnp("7766767"); ///write
        x.setGreutate(81);
        x.setInaltime(170);
        Person y = new Person();
        Person p = new Person();
        p.setCnp("7766767"); ///write
        p.setGreutate(80);
        p.setInaltime(170);


        double hisBmi= p.getBmi();
        System.out.println(hisBmi);
        System.out.println(Person.getCounter());


        System.out.println(p);

        //Object o = new Object();

        if(x.equals(p))
            System.out.println("is egale");
        else
            System.out.println("NU-s egale");

    }
}
