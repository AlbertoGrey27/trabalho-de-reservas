import org.example.Area;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTeste {
    Scanner sc = new Scanner(System.in);
    ArrayList<Area> areas = new ArrayList<>();
    private Assertions assertions;

    @Test
    public void testeParaCadastro() {



        areas.add(new Area("area1", 23, 12,0));
        assertions.assertEquals(areas.get(0).getNome(), "area1");
        assertions.assertEquals(areas.get(0).getLocalizacao(), 23);
        assertions.assertEquals(areas.get(0).getArea(), 12);
        assertions.assertEquals(areas.get(0).getId(), 0);

        areas.get(0).cadastrarEspecie("Gato", "animal", true, 0);
        assertions.assertEquals(areas.get(0).getEspecies().get(0).getNome(), "Gato");
        assertions.assertEquals(areas.get(0).getEspecies().get(0).getTipo(), "animal");
        assertions.assertEquals(areas.get(0).getEspecies().get(0).getAmeacada(), true );
        assertions.assertEquals(areas.get(0).getEspecies().get(0).getId(), 0);

        areas.get(0).cadastrarEspecie("Cachorro", "animal", false, 1);
        areas.add(new Area("area2", 1, 15,1));
        areas.get(1).cadastrarEspecie("Orquídea", "Planta", true, 2);
        areas.get(1).cadastrarEspecie("Mangueira", "Planta", false, 3);
        areas.get(1).cadastrarEspecie("Rosa", "Planta", true, 4);

    }

    @Test
    public void testeEscreverCSV(){
        areas.add(new Area("area1", 23, 12,0));
        areas.get(0).cadastrarEspecie("Gato", "animal", true, 0);
        areas.get(0).cadastrarEspecie("Cachorro", "animal", false, 1);
        areas.add(new Area("area2", 1, 15,1));
        areas.get(1).cadastrarEspecie("Orquídea", "Planta", true, 2);
        areas.get(1).cadastrarEspecie("Mangueira", "Planta", false, 3);
        areas.get(1).cadastrarEspecie("Rosa", "Planta", true, 4);

        for (int i = 0; i < areas.size(); i++){
            areas.get(i).mostrarInfoArea();
            areas.get(i).escreverCSV("tabelaReserva - Página1.csv");
            areas.get(i).lerCSV("tabelaReserva - Página1.csv");

        }
    }

    @Test
    public void testeAvistamento(){
        areas.add(new Area("area1", 23, 12,0));
        areas.get(0).cadastrarEspecie("Gato", "animal", true, 0);
        areas.get(0).cadastrarEspecie("Cachorro", "animal", false, 1);
        areas.add(new Area("area2", 1, 15,1));
        areas.get(1).cadastrarEspecie("Orquídea", "Planta", true, 2);
        areas.get(1).cadastrarEspecie("Mangueira", "Planta", false, 3);
        areas.get(1).cadastrarEspecie("Rosa", "Planta", true, 4);


        int resp2 = 4;

        int resp3 = 1;
        boolean resp4 = false;
        
        for(int i = 0; i < areas.get(resp3).getEspecies().size(); i++){
            System.out.println(areas.get(resp3).getEspecies().get(i).getId());
            if (areas.get(resp3).getEspecies().get(i).getId() == resp2) {
                resp4 = true;

            }
            System.out.println(resp4);
        }

        if (resp4 == true){
            System.out.println("Essa espécie tá na sua área correta.");
        }
        else{
            System.out.println("Essa espécie não está na sua área correta. Muito obrigado pela cooperação!");
        }
    }
}
