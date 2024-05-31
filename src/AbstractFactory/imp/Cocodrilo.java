package AbstractFactory.imp;

import AbstractFactory.inter.IReptil;

public class Cocodrilo implements IReptil {

    @Override
    public void caminar() {
        System.out.println("El cocodrilo está caminando");

    }

    @Override
    public void nadar() {
        System.out.println("El cocodrilo está nadando");
    }

}
