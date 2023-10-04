public class ElectricPokemon extends Pokemon {
    private String blih;
    private String bloh;
    public ElectricPokemon(String nameInput, int hpInput, String blihInput, String blohInput){
        super(nameInput, hpInput);
        blih = blihInput;
        bloh = blohInput;
    }
    public void setBlih(String blihInput){
        blih = blihInput;
    }
    public void setBloh(String blohInput){
        bloh = blohInput;
    }
    public String getBlih(){
        return blih;
    }
    public String getBloh(){
        return bloh;
    }
    public void checkIfLevelUp(int newXp){
        if(newXp >= 45){
            levelUp();
            setXp(newXp - 45);
        }
    }
    public void attackWithElectricity(Pokemon target){
        target.applyDamage(20);
        if(target.getHp() == 0){
            increaseXp(10);
        }
    }
    public void blihTheBloh(){
        System.out.println(blih + " " + bloh);
    }
}