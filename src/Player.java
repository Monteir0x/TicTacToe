public abstract class Player {
    protected int[] trying = new int [2];
    protected int player;

    public Player(int player){
        this.player = player;
    }

    public abstract void Play(Table table);
    public abstract void Trying(Table table);
    public boolean checkTry(int[] trying, Table table){
        return table.getPosition(trying) == 0;
    }


}
