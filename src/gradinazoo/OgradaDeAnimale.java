package gradinazoo;

public class OgradaDeAnimale {

    private Animal[] animaleDinCurte = new Animal[4];

    private void cumparAnimale() {
        animaleDinCurte[0]= new Caine();
        animaleDinCurte[1] = new Vaca();
        animaleDinCurte[2]= new Pisica();
        animaleDinCurte[3] = new Pisica();

    }

    private void ascultaLeInOgrada() {
        for (int i = 0; i < animaleDinCurte.length; i++) {

            // System.out.println( animaleDinCurte[i] instanceof Vaca);
            // Pisica p = (Pisica)animaleDinCurte[i];

          animaleDinCurte[i].noise();
        }
    }



    public static void main(String[] args) {
        OgradaDeAnimale ogd = new OgradaDeAnimale();
        ogd.cumparAnimale();


        ogd.ascultaLeInOgrada();

    }
}
