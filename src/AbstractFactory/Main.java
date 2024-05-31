package AbstractFactory;

import AbstractFactory.inter.IAve;
import AbstractFactory.inter.IFabricaAbstracta;
import AbstractFactory.inter.IReptil;

public class Main {

    public static void main(String[] args) {
        IFabricaAbstracta ave = AnimalFabrica.getFabrica("ave");
        IAve aguila = ave.getAve("aguila");
        aguila.volar();
        //IAve buitre = ave.getAve("buitre");
        
        IFabricaAbstracta reptil = AnimalFabrica.getFabrica("reptil");
        IReptil cocodrilo = reptil.getReptil("cocodrilo");
        cocodrilo.nadar();
        //IReptil tortuga = reptil.getReptil("tortuga");
        
        
    }
}
