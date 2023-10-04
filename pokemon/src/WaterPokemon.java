public class WaterPokemon extends Pokemon {
    private String donges;
    private String dunges;
    public WaterPokemon(String nameInput, int hpInput, String dongesInput, String dungesInput){
        super(nameInput, hpInput);
        donges = dongesInput;
        dunges = dungesInput;
    }
    public void setDonges(String dongesInput){
        donges = dongesInput;
    }
    public void setDunges(String dungesInput){
        dunges = dungesInput;
    }
    public String getDonges(){
        return donges;
    }
    public String getDunges(){
        return dunges;
    }
    public void checkIfLevelUp(int newXp){
        if(newXp >= 40){
            levelUp();
            setXp(newXp - 40);
        }
    }
    public void attackWithWater(Pokemon target){
        target.applyDamage(5);
        if(target.getHp() == 0){
            increaseXp(10);
        }
    }
    public void dongesTheDunges(){
        System.out.println(donges + " " + dunges);
    }
}
