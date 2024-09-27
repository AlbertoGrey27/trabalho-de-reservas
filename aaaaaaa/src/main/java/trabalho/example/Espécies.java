package trabalho.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Espécies {
    String nome_especie[] = new String[200];
    String tipo[] = new String[200];
    String é_ameçada[] = new String[200];
    int i = 0;
    String[] valoresEntreVirgulas = new String[200];
    File esp = new File("C://Users//Usuario//Desktop//curso_pythons//aaaaaaa//target//classes//trabalho//example//esp.csv");
    
    public void criar_especie(){
        try{
            String linhasDoArquivo = new String();
            Scanner sc = new Scanner(esp);
           
            
            while(sc.hasNext()){
                linhasDoArquivo = sc.next();
                valoresEntreVirgulas = linhasDoArquivo.split(",");
                System.out.println(valoresEntreVirgulas[i]);
                i++;
            }
            

        }catch(FileNotFoundException e){

        }
    }


}   
