package main.Novo;

public class EntradaAdapter extends EntradaPlaystation {

    private IEntrada entradaDirecional;

    public EntradaAdapter(IEntrada entradaDirecional){
        this.entradaDirecional = entradaDirecional;
    }

    public String recuperarEntrada(){
        if(this.getGraus() == 0.0f){
            return entradaDirecional.setEntrada("Cima");
        }
        if(this.getGraus() == 90.0f){
            return entradaDirecional.setEntrada("Direita");
        }
        if(this.getGraus() == 180.0f){
            return entradaDirecional.setEntrada("Baixo");
        }
        if(this.getGraus() == 270.0f) {
            return entradaDirecional.setEntrada("Esquerda");
        }
        return entradaDirecional.getEntrada();
    }


    public void salvarEntrada(){
        if(entradaDirecional.getEntrada().equals("Cima")){
            this.setGraus(0.0f);
        }
        if(entradaDirecional.getEntrada().equals("Direita")){
            this.setGraus(90.0f);
        }
        if(entradaDirecional.getEntrada().equals("Baixo")){
            this.setGraus(180.0f);
        }
        if(entradaDirecional.getEntrada().equals("Esquerda")){
            this.setGraus(270.0f);
        }
    }
}
