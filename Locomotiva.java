public class Locomotiva {
    //inicializando os atributos de INSTANCIA
    private int idLocomotiva;
    private int numMaxVagoes;
    private boolean isFree;
    private double puxaMax;
    private int idLocomotivaNaComposicao;
    //construtor que inicia pedindo o id, deixa no max 3 vagoes, ta livre, e puxa 15k kg
    public Locomotiva(int idLocomotiva){
        this.idLocomotiva = idLocomotiva;
        this.idLocomotivaNaComposicao = -1;
        numMaxVagoes = 3;
        isFree = true;
        puxaMax = 15000;
    }
    //getters

    public int getIdLocomotiva(){
        return  idLocomotiva;
    }

    public int getNumMaxVagoes(){
        return numMaxVagoes;
    }

    public boolean isFreeLocomotiva(){
        return isFree;
    }

    public double getPuxaMax() {
        return puxaMax;
    }

    public int getIdLocomotivaNaComposicao() {
        return idLocomotivaNaComposicao;
    }

    //setters


    public void setIdLocomotiva(int idLocomotiva) {
        this.idLocomotiva = idLocomotiva;
    }

    public void setNumMaxVagoes(int numMaxVagoes) {
        this.numMaxVagoes = numMaxVagoes;
    }

    public void setFreeLocomotiva(boolean free) {
        isFree = free;
    }

    public void setPuxaMax(double puxaMax) {
        this.puxaMax = puxaMax;
    }

    public void setIdLocomotivaNaComposicao(int idLocomotivaNaComposicao){this.idLocomotivaNaComposicao=idLocomotivaNaComposicao;
    }


}
