public class FirePokemon extends Pokemon {
    private String dinges;
    private String denges;
    public FirePokemon(String nameInput, int hpInput, String dingesInput, String dengesInput){
        super(nameInput, hpInput);
        dinges = dingesInput;
        denges = dengesInput;
    }
    public void setDinges(String dingesInput){
        dinges = dingesInput;
    }
    public void setDenges(String dengesInput){
        denges = dengesInput;
    }
    public String getDinges(){
        return dinges;
    }
    public String getDenges(){
        return denges;
    }
    public void checkIfLevelUp(int newXp){
        if(newXp >= 30){
            levelUp();
            setXp(newXp - 30);
        }
    }
    public void attackWithFire(Pokemon target){
        target.applyDamage(15);
        if(target.getHp() == 0){
            increaseXp(10);
        }
    }
    public void dingesTheDenges(){
        System.out.println(dinges + " " + denges);
    }
}
