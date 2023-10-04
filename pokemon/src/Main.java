public class Main {
    public static void main(String[] args) {
        FirePokemon vuurman = new FirePokemon("Vuurman", 20, "Dinges", "Denges");
        WaterPokemon waterman = new WaterPokemon("Waterman", 10, "Donges", "Dunges");
        GrassPokemon grasman = new GrassPokemon("Grasman", 35, "Blah", "Bleh");
        ElectricPokemon electriciteitsman = new ElectricPokemon("Electriciteitsman", 5, "Blih", "Bloh");

        //waterman valt electriciteitsman aan
        waterman.attackWithWater(electriciteitsman);
        //het is super effectief!
        System.out.println(electriciteitsman.getName() + " heeft " + electriciteitsman.getHp() + " HP over.");

        //grasman valt vuurman aan
        grasman.attackWithUhhGrassIGuess(vuurman);
        //het is niet erg effectief...
        System.out.println(vuurman.getName() + " heeft " + vuurman.getHp() + " HP over.");
    }
}