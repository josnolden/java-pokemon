public class GrassPokemon extends Pokemon {
    private String blah;
    private String bleh;
    public GrassPokemon(String nameInput, int hpInput, String blahInput, String blehInput){
        super(nameInput, hpInput);
        blah = blahInput;
        bleh = blehInput;
    }
    public void setBlah(String blahInput){
        blah = blahInput;
    }
    public void setBleh(String blehInput){
        bleh = blehInput;
    }
    public String getBlah(){
        return blah;
    }
    public String getBleh(){
        return bleh;
    }
    public void checkIfLevelUp(int newXp){
        if(newXp >= 50){
            levelUp();
            setXp(newXp - 50);
        }
    }
    public void attackWithUhhGrassIGuess(Pokemon target){
        target.applyDamage(1);
        if(target.getHp() == 0){
            increaseXp(10);
        }
    }
    public void blahTheBleh(){
        System.out.println(blah + " " + bleh);
    }
}