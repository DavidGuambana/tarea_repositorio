package AbstractFactory.imp;

import AbstractFactory.inter.IReptil;

public class Tortuga implements IReptil{

    @Override
    public void caminar() {
        System.out.println("La tortuga está caminando");
    }

    @Override
    public void nadar() {
        System.out.println("La tortuga está nadando");
    }
    
}
