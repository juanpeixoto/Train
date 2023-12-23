import java.util.ArrayList;
public class GaragemVagoes {
    //inicializando os atributos de INSTANCIA
    private ArrayList<Vagao> garagemVagoes;

    public GaragemVagoes(){
        this.garagemVagoes = new ArrayList<Vagao>();
    }

    //add vagao no arraylist
    public void addVagao(Vagao vagao){
        garagemVagoes.add(vagao);
    }

    //remove vagao no arraylist
    public void removeVagao(int idVagao){
        for(Vagao vagao: garagemVagoes){
            if(vagao.getId()==idVagao){
                vagao.setFreeVagao(false);
                garagemVagoes.remove(vagao);
                break;
            }
            else{System.out.println("Id nao encontrado");}

        }
    }

}
