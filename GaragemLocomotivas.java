import java.util.ArrayList;
public class GaragemLocomotivas {
    //inicializando os atributos de INSTANCIA
    private ArrayList<Locomotiva> garagemLocomotivas;
    public GaragemLocomotivas(){
        this.garagemLocomotivas = new ArrayList<Locomotiva>();
    }

    //add locomotiva no arraylist bota o isfree como true
    public void addLocomotiva(Locomotiva locomotiva){
        garagemLocomotivas.add(locomotiva);
        locomotiva.setFreeLocomotiva(true);
    }

    //remover locomotiva do arraylist e muda o isfree pra falso
    public void removerLocomotiva(int idLocomotiva){
        for(Locomotiva locomotiva : garagemLocomotivas){
            if(locomotiva.getIdLocomotiva()== idLocomotiva){
                locomotiva.setFreeLocomotiva(false);
                garagemLocomotivas.remove(locomotiva);

                break;
            }
            else{System.out.println("Nao existe essa locomotiva");
            }
        }
    }
}
