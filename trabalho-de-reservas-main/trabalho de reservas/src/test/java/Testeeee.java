import org.example.Area;
import org.example.especies;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testeeee {
    private Assertions Assertion;
    public Area ar = new Area("a",20,20,20);
    public especies es = new especies("a","planta",true,0);
    @Test
    public void taFuncionando(){
        ar.cadastrarEspecie(es.getNome(),es.getTipo(), es.getAmeacada(), es.getId());
        ar.escreverCSV("tabelaReserva - Página1.csv");
        ar.lerCSV("tabelaReserva - Página1.csv");
    }




}
