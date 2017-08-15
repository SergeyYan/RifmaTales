import java.util.*;

/**
 * Created by Blago on 14.08.2017.
 */
class BotRifma {

    Random random;
    BD bd;

    BotRifma() {

        random = new Random();
        bd = new BD();
    }

    public String sayReturn(String text) {

        String say = bd.firstWord[random.nextInt(bd.firstWord.length)] + bd.secondWord[random.nextInt(bd.secondWord.length)] + bd.threeWord[random.nextInt(bd.threeWord.length)] + "\n" +
                bd.fourWord[random.nextInt(bd.fourWord.length)] + bd.fiveWord[random.nextInt(bd.fiveWord.length)] + "\n" + "как " + bd.sixWord[random.nextInt(bd.sixWord.length)] + bd.threeWord[random.nextInt(bd.threeWord.length)]
                + "\n" +"как " + bd.sevenWord[random.nextInt(bd.sevenWord.length)] + bd.eightWord[random.nextInt(bd.eightWord.length)] + bd.nineWord[random.nextInt(bd.nineWord.length)];
        return say;
    }
}