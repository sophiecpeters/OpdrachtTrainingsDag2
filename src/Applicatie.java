import java.util.Random;

public class Applicatie {

    public static void main(String[] args){
    Bus bus = new Bus();
    Trein trein = new Trein();
    Metro metro = new Metro();
    Pont pont = new Pont();
    Tram tram = new Tram();
    Fiets fiets = new Fiets();
    //capaciteit
    bus.capaciteit = 60;
    trein.capaciteit = 100;
    metro.capaciteit = 80;
    tram.capaciteit = 70;
    pont.capaciteit = 90;
    fiets.capaciteit = 50;
    //prijs
    bus.prijs = 3;
    trein.prijs = 10;
    metro.prijs = 5;
    tram.prijs = 4;
    pont.prijs = 0;
    fiets.prijs = 2;

    System.out.println("Is er stroom?: " +stroomGenertor());
    System.out.println("Regent het?: " + regenGenertor());





    }

    static boolean regenGenertor(){ //bij true regent het
        Random random = new Random();
        int number = random.nextInt(10);
        return number < 3;
    }

    static boolean stroomGenertor(){ // bij true is er stroom
        Random random = new Random();
        int number = random.nextInt(100);
        return number > 2;
    }



}


abstract class PubliekVoertuig{
    int prijs;
    int capaciteit;
}

class Bus extends PubliekVoertuig{
}


class Trein extends PubliekVoertuig implements geelectrificeerd{

    @Override
    public boolean heeftElectriciteit() {
        return false;
    }
}


class Metro extends  PubliekVoertuig implements geelectrificeerd{

    @Override
    public boolean heeftElectriciteit() {
        return false;
    }
}


class Pont extends  PubliekVoertuig implements Overdekt{

    @Override
    public boolean isOverdekt() {
        return false;
    }
}
class Tram extends PubliekVoertuig implements geelectrificeerd{

    @Override
    public boolean heeftElectriciteit() {
        return false;
    }
}



class Fiets extends PubliekVoertuig implements Overdekt{

    @Override
    public boolean isOverdekt() {
        return false;
    }
}


class ElectrischeBoorMachine implements geelectrificeerd{
    @Override
    public boolean heeftElectriciteit() {
        return false;
    }
}


//regent het of niet?
   // hoeveel mensen gaan er mee met: bus, trein, metro, pont, tram. Is afhankelijk van regen of niet. Max = capaciteit.


interface geelectrificeerd{
    boolean heeftElectriciteit();

}

interface Overdekt{
    boolean isOverdekt();

}





//1. Je moet minstens 7 klassen hebben. 1 daarvan moet abstract zijn. Elke klasse moet zijn eigen verantwoordelijkheid hebben.
//        2. Er moeten in je programma minstens 2 interfaces zijn.
//        3. 80 % van de methoden moet een ander returntype hebben dan void.
//        4. 40 % van de parameters moet van een KlasseType zijn (Strings worden niet meegeteld).
//        5. Minstens 7 keer zal de interface of het returntype of het parametertype moeten zijn.
//        6. Er zal zelf een Exception-klasse gemaakt moeten worden.
//        7. Een Exception zal minstens 3 keer gethrowd moeten worden in je programma.
//        8. In je programma moet een constructor een keer worden overload.  meerder constructors in n class
//        9. In je programma moet een constructor een keer worden geredirect. andere constructor aanroept (this. voorbeeld)
//        10. Je zult minstens 4 methoden moeten overriden
//        11. Minstens 1 overridden methode moet een Exception throwsen.
//        12. 1 constructor moet een exception throwen.
//        13. Gebruik alleen native java, en het moet een console applicatie zijn



