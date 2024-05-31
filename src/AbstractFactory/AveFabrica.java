package AbstractFactory;

import AbstractFactory.imp.Aguila;
import AbstractFactory.imp.Buitre;
import AbstractFactory.inter.IAve;
import AbstractFactory.inter.IReptil;
import AbstractFactory.inter.IFabricaAbstracta;

public class AveFabrica implements IFabricaAbstracta {

    @Override
    public IAve getAve(String ave) {
        switch (ave) {
            case "aguila":
                return new Aguila();
            case "buitre":
                return new Buitre();
            default:
                return null;
        }
    }

    @Override
    public IReptil getReptil(String reptil) {
        return null;
    }

}
