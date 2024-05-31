package AbstractFactory;

import AbstractFactory.inter.IFabricaAbstracta;

public class AnimalFabrica {
    public static IFabricaAbstracta getFabrica(String animal){
        switch (animal) {
            case "ave":
                return new AveFabrica();
            case "reptil":
                return new ReptilFabrica();
            default:
                return null;
        }
    }
}
