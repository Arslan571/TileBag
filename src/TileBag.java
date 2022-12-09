import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TileBag {
    private static ScrabbleTile[] tiles = new ScrabbleTile[100];
    private int tileCount = 100;
    Random rnd = new Random();

    public void createTileArray() {
        for (int i = 0; i < tileCount; i++) {
            tiles[i] = new ScrabbleTile(getRandomLetter(), getRandomValue(tileCount));
        }
    }

    public ScrabbleTile getTile(int index){
        ScrabbleTile tile = tiles[index];
        System.out.println("The value of " + tiles[index].getLetter() + " is " + tiles[index].getValue());
        return tile;
    }

    public ScrabbleTile[] removeTile(int index){
        if(tiles[index] != null){
            List<ScrabbleTile> list = new ArrayList<>(Arrays.asList(tiles));
            list.remove(index);

            tiles = list.toArray(new ScrabbleTile[list.size()]);

            return tiles;
        }else{
            System.out.println("Array is empty!");
            return null;
        }
    }

    public void getShuffleArray()
    {
        Random rand = new Random();

        for (int i = 0; i < tiles.length; i++) {
            int randomIndexToSwap = rand.nextInt(tiles.length);
            ScrabbleTile temp = tiles[randomIndexToSwap];
            tiles[randomIndexToSwap] = tiles[i];
            tiles[i] = temp;
        }
    }

    private char getRandomLetter(){
        Random rnd = new Random();
        char randLetter = (char) ('a' + rnd.nextInt(26));
        return randLetter;
        }

         public int getRandomValue(int maxLength){
            int min = 0;
            int max = maxLength;
            Random rnd = new Random();
            int randValue = rnd.nextInt(max - min) + min;
            return randValue;
        }

        public int getArrayLength(){
        return tiles.length;
        }

}


