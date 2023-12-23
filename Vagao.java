public class Vagao {
    //inicializando os atributos de INSTANCIA
    private int idVagao;
    private double cargaMaxima;
    private boolean isFree;
    private int idVagaoNaComposicao;

    //construtor que vai receber um id, e cria um vagão com cargamaxima ja predefinida de 5 toneladas e que está livre.
    public Vagao(int id){
        this.idVagao = id;
        cargaMaxima = 5000;
        isFree = true;
        idVagaoNaComposicao=-1;

    }

    //getters
    public int getId(){
        return idVagao;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public boolean isFreeVagao() {
        return isFree;
    }

    public int getIdVagaoNaComposicao(){return idVagaoNaComposicao;}

    //setters

    public void setId(int id) {
        this.idVagao = id;
    }

    public void setCargaMaxima(double cargaMaxima){
        this.cargaMaxima = cargaMaxima;
    }

    public void setFreeVagao(boolean free) {
        isFree = free;
    }

    public void setIdVagaoNaComposicao(int idVagaoNaComposicao){this.idVagaoNaComposicao=idVagaoNaComposicao;}


}
