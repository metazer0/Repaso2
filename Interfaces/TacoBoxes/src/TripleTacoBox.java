public class TripleTacoBox implements TacoBox{

    int tacos;
    public TripleTacoBox() {
        this.tacos = 3;
    }

    @Override
    public int tacosRemaining() {
        return 0;
    }

    @Override
    public void eat() {

    }
}
