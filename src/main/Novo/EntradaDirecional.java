package main.Novo;

public class EntradaDirecional implements IEntrada{

    private String direcional;

    @Override
    public String getEntrada(){
        return this.direcional;
    }

    @Override
    public String setEntrada(String direcional){
        this.direcional = direcional;
        return direcional;
    }


}
