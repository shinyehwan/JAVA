package gamelevel;

public class Player {

    // BeginnerLevel blevel;
    // AdvancedLevel alevel;
    // SuperLevel slevel;

    private PlayerLevel level;
    
    public Player(){
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgrageLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count){
        level.go(count);
    }
    
}
