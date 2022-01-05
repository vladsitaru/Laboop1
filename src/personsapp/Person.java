package personsapp;

public class Person {

    Person() {
        counter++;
    }


    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public double getInaltime() {
        return inaltime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public double getBmi() {
        setBmi();
        return bmi;
    }

    private void setBmi() {
       //calcul de bmi
        bmi = greutate/inaltime/inaltime*10000;
    }

    public static int getCounter() {
        return counter;
    }

// suprascriere
    public String toString() {
        return (this.cnp+":"+this.nume+":"+this.inaltime+":"+this.greutate+":"+this.bmi);
    }

    public boolean equals(Object anObject) {

        boolean eq=false;
        Person person = (Person) anObject;
        if(this.cnp.equals(person.getCnp()) && this.inaltime==person.getInaltime() &&this.greutate==person.getGreutate())
            eq=true;
        return eq;
    }

    public int hashCode() {
        return super.hashCode()+1; //naspa
    }



    private String cnp;
    private String nume;
    private double greutate;
    private double inaltime;
    private double bmi;

    private static int counter;

    //metode - comportament


}
