package paquete1;

import paquete1.Clase1;

/**
 *
 * la clase no puede ser difinida cono defaul o packeage
 */
class ClaseHija extends Clase1{
    public ClaseHija(){
        super();
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metododefault();
    }
}
