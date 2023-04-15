public class CustomTacoBox implements TacoBox{

    int tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }

    @Override
    public int tacosRemaining() {
        return 0;
    }

    @Override
    public void eat() {

    }
}
