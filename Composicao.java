import java.util.ArrayList;
public class Composicao {
    //inicializando os atributos de INSTANCIA
    private int idTrem;
    private ArrayList<Locomotiva> locomotivas;
    private ArrayList<Vagao> vagoes;

    //construtor
    public Composicao(int idTrem) {

        this.idTrem = idTrem;
        this.locomotivas = new ArrayList<Locomotiva>();
        this.vagoes = new ArrayList<Vagao>();

    }

    //getters
    public int getIdTrem(){
        return idTrem;
    }

    

    //adds

    public void addLocomotivaNaComposicao(Locomotiva locomotiva){
        if(locomotivas.size()>=3){
            System.out.println("Trem ja atingiu o maximo de locomotivas comportadas");
        }
        else{
            locomotivas.add(locomotiva);
            locomotiva.setFreeLocomotiva(false);
        }
    }

    //add vagao na composicao, precisando de 1 locomotiva pelo menos
    public void addVagaoNaComposicao(Vagao vagao) {
        if (locomotivas.size() > 0) {
            if (locomotivas.size() == 1 && vagoes.size() <= 30) {//atendendo ao quanto cada locomotiva consegue aguentar
                vagoes.add(vagao);
                vagao.setFreeVagao(false);
            }
            if (locomotivas.size() == 2 && vagoes.size() <= 50) {
                vagoes.add(vagao);
                vagao.setFreeVagao(false);
            }
            if (locomotivas.size() == 3 && vagoes.size() <= 80) {
                vagoes.add(vagao);
                vagao.setFreeVagao(false);
            } else {
                System.out.println("Seu trem precisa de 1 locomotiva pelo menos para ser colocado");
            }

        }


    }

    //removes

    public void removeLocomotivaNaComposicao(){
        if(vagoes.size()!=0){
            System.out.println("Para tirar as locomotivas não pode ter nenhum vagao");
        }
        else{
            locomotivas.remove(locomotivas.size()-1);
        }
    }

    //remover um vagao na composição
    public void removeVagaoNaComposicao(){
        if(vagoes.size()>0){
            //talvez precise fazer algo pra mudar o isfree para true.
            vagoes.remove(vagoes.size()-1);//remove o ultimo vagao da lista
        }
        else{
            System.out.println("Não tem mais vagoes");
        }
    }
}