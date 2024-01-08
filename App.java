import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Composicao> garagemComposicao = new ArrayList<Composicao>();
        ArrayList<Vagao> garagemVagao = new ArrayList<Vagao>();
        ArrayList<Locomotiva> garagemLocomotiva = new ArrayList<Locomotiva>();
        Scanner input = new Scanner(System.in);//inicializando o Scanner
        int escolha; // escolher as primeiras opções do switch
        int escolha2;// opções do vagão
        int escolha3;// opções da Locomotiva
        int escolha4;// opções do Trem



        do{//esse do while serve para escolher as opções gerais
            System.out.println("Escolha a opção");
            System.out.println("1 - Criar/Desfazer/Editar/Listar um Vagão");
            System.out.println("2 - Criar/Desfazer/Editar/Listar uma Locomotiva ");
            System.out.println("3 - Criar/Desfazer/Editar/Listar um trem ");
            System.out.println("0 - Sair");
            escolha = input.nextInt(); //fazendo o int escolha receber o Scanner (input) INT.
            switch (escolha){
                case 1:
                    do {//esse do while serve para os vagoes especificamente
                        System.out.println("Escolha a opcao que deseja");
                        System.out.println("1 - Criar um vagao");
                        System.out.println("2 - Desfazer um vagao ");
                        System.out.println("3 - Editar um vagao");
                        System.out.println("4 - Listar os vagoes livres ");
                        System.out.println("0 - Voltar no anterior ");
                        escolha2 = input.nextInt();

                        switch (escolha2){
                            case 1:
                                System.out.println("Para criar um vagao precisa de um id \n");
                                System.out.println("Qual id você da para o vagao?");
                                int idVagao = input.nextInt();
                                Vagao novoVagao = new Vagao(idVagao);
                                garagemVagao.add(novoVagao);
                                System.out.println("Vagao criado e adicionado na garagem");
                                break;
                            case 2:
                                System.out.println("Digite o Id do vagao que quer excluir");
                                int idVagao = input.nextInt();
                                for(Vagao vagoes : garagemVagao){
                                    if(idVagao == vagoes.getId){
                                        if(vagoes.isfree == true){
                                            vagoes = null;
                                            garagemVagao.remove(vagoes);
                                            System.out.println("Vagao Desfeito");
                                         else{
                                                System.out.println("Vagao está em um trem e não pode ser desfeito");
                                                 }
                                        else{
                                                System.out.println("Não foi encontrado o id do vagão");
                                            }

                                         }

                                    }
                                }
                                break;

                            case 3:
                                int idVagao;
                                System.out.println("Vamos editar o vagao, para isso preciso que informe o id.");
                                idvagao = input.nextInt();
                                for(Vagao vagao : garagemVagao){
                                    if (idVagao == vagao.getId()){
                                        double cargaMaximaVagao;
                                        System.out.println("Vagao encontrado, mude a quantidade de carga que ele é capaz de carregar");
                                        System.out.println("Quanto de carga esse vagao utiliza agora?");
                                        cargaMaximaVagao = input.nextDouble();
                                    }
                                    else{
                                        System.out.println("Não existe esse vagao");
                                    }
                                }
                            case 4:
                                System.out.println("Aqui vai ter todas as selações de Vagões Livres");


                        }


                    }while(escolha2!=0)
                        break;

            }

        }while(escolha != 0);
    }
}
