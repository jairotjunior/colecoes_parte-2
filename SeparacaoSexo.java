package Java.Colecoes_Parte1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeparacaoSexo {
  public static void main(String args[]){
    SeparacaoSexo ss = new SeparacaoSexo();
    ss.cadastro();
  }

  public void cadastro(){
    Scanner ler = new Scanner (System.in);
    List<String> masculino = new ArrayList<>();
    List<String> feminino = new ArrayList<>();

    System.out.println("Digite 'sim', para cadastrar e 'não', para finalizar");
    String cadastrar = ler.next();

    while(cadastrar.intern() == "sim"){

      System.out.println("Digite um nome: ");
      String nome = ler.next();
      System.out.println("Digite o sexo: ");
      String sexo = ler.next();

      if(sexo.intern() == "masculino"){
        masculino.add(nome);
        Collections.sort(masculino);
      }
      else if (sexo.intern() == "feminino"){
        feminino.add(nome);
        Collections.sort(feminino);
      }
      else{
        System.out.println("Valor inválido, Digite no campo 'sexo', somente 'masculino' ou 'feminino'");        
      }

      System.out.println("Digite sim, para cadastrar e não, para finalizar");
      cadastrar = ler.next();
    }

    ler.close();
    System.out.println("Masculino " + masculino);
    System.out.println("Feminino " + feminino);
  }
}
