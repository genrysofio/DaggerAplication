package com.genrysofionet.daggeraplication;

public class Tipo {

    private String tipoAnimal;

    public Tipo(String tipoAnimal) {
        this.tipoAnimal=tipoAnimal;
    }

    public String getTipoAnimal(){
        return ("Familia de "+tipoAnimal);
    }
}
