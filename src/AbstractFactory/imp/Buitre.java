package AbstractFactory.imp;

import AbstractFactory.inter.IAve;

public class Buitre implements IAve {

    @Override
    public void volar() {
        System.out.println("El Buitre ha empezado a volar");

    }

    @Override
    public void planear() {
        System.out.println("El Buitre ha empezado a planear");
    }

}
