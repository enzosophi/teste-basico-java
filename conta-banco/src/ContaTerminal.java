import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
     Scanner tcl = new Scanner(System.in);
        int escolha;
       
        String nome="";
        int telefone=0;
        String email="";

        do{

            System.out.println("escolha uma opcao");
            System.out.println("1-nome");
            System.out.println("2-telefone");
            System.out.println("3-email");
            System.out.println("4-sair");
            escolha = tcl.nextInt();
            tcl.nextLine();
            

            switch(escolha){
        case 1:
            System.out.println("nome: ");
            nome = tcl.nextLine();
            break;
         case 2:
                System.out.println("telefone");
            telefone = tcl.nextInt();
            break;
        case 3:
                System.out.println("email: ");
            email = tcl.nextLine();
            break;
        case 4:
                System.out.println(nome);
                System.out.println(telefone);
                System.out.println(email);
                break;

                default:
                    System.out.println("opcao invalida");
        }
        
            }while(escolha!=4);
          
           
        }
    }
