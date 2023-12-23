import java.util.ArrayList;
public class GaragemTrem {
    //inicializando os atributos de INSTANCIA
    private ArrayList<Composicao> garagemTrem;

    //construtor
    public GaragemTrem(){
        this.garagemTrem = new ArrayList<Composicao>();
    }

    //add trem na lista de trens sem mudar o isfree
    public void addTremNaGaragem(Composicao trem){
        garagemTrem.add(trem);
    }

    //remove o trem na lista de trens
    public void removeTremNaGaragem(int idComposicao){
        for(Composicao composicao : garagemTrem){
            if(composicao.getIdTrem()==idComposicao){
                garagemTrem.remove(composicao);
            }
            else{
                System.out.println("Trem nao existe ou id errado");
            }
        }

    }

}
