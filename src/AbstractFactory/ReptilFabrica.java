package AbstractFactory;

import AbstractFactory.imp.Cocodrilo;
import AbstractFactory.imp.Tortuga;
import AbstractFactory.inter.IAve;
import AbstractFactory.inter.IReptil;
import AbstractFactory.inter.IFabricaAbstracta;

public class ReptilFabrica implements IFabricaAbstracta{

    @Override
    public IAve getAve(String ave) {
        return null;
    }

    @Override
    public IReptil getReptil(String reptil) {
        switch (reptil) {
            case "cocodrilo":
                return new Cocodrilo();
                case "tortuga":
                return new Tortuga();
            default:
                return null;
        }
    }
    
}
