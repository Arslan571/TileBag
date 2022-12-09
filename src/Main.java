public class Main {

    static TileBag tileBag = new TileBag();

    public static void main(String args[]){

        tileBag.createTileArray();
        for(int i = 1; i <= 7; i++){
            tileBag.getTile(tileBag.getRandomValue(tileBag.getArrayLength()));
        }
        System.out.println("remainder: " + (tileBag.getArrayLength() - 7));
    }

}
