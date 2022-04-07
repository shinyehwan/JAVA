package gamelevel;

public class MainBoardPlay {
    public static void main(String[] args) {
        
        Player player = new Player();
        player.play(1);

        AdvancedLevel aLevel = new AdvancedLevel();
        player.upgrageLevel(aLevel);
        player.play(2);

        SuperLevel sLevel = new SuperLevel();
        player.upgrageLevel(sLevel);
        player.play(3);
    }
}
