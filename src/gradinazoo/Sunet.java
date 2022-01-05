package gradinazoo;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Sunet {
    public static void canta(String numeSunet) {

        try {
            // primeste numele unui mp3 de pe disk
            FileInputStream fos = new FileInputStream(numeSunet);
            BufferedInputStream bof = new BufferedInputStream(fos);

            // play that file
            Player player = new Player(fos);
            player.play();
            //System.out.println("ruleaza");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }

    }

}
