package AbstractFactory.imp;

import AbstractFactory.inter.IAve;

public class Aguila implements IAve{

    @Override
    public void volar() {
        System.out.println("El águila está volando");
    }

    @Override
    public void planear() {
        System.out.println("El águila está planeando");
    }
    
}
