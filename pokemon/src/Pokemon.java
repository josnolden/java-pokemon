public abstract class Pokemon {
    private String name;
    private int hp;
    private int xp;
    private int level;
    public Pokemon(String nameInput, int hpInput){
        name = nameInput;
        hp = hpInput;
        xp = 0; //begint met 0 experience
        level = 1; //begint met level 1
    }
    public String getName(){
        return name;
    }
    public int getHp(){
        return hp;
    }
    public int getXp(){
        return xp;
    }
    public int getLevel(){
        return level;
    }
    public void setName(String nameInput){
        name = nameInput;
    }
    public void setHp(int hpInput){
        hp = hpInput;
    }
    public void setXp(int xpInput){
        xp = xpInput;
    }
    public void setLevel(int levelInput){
        level = levelInput;
    }
    public void applyDamage(int damage){
        if(hp > damage){
            hp -= damage;
        }
        else{
            hp = 0; //misschien nog een effect om m af te maken
        }
    }
    public void increaseXp(int experience){
        xp += experience;
        checkIfLevelUp(xp);
    }
    public void levelUp(){
        level++;
    }
    public abstract void checkIfLevelUp(int newXp);
}
