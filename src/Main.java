import com.company.space.Vesmir;
import com.company.space.vesmirneTelesa.Hviezda;
import com.company.space.vesmirneTelesa.Planeta;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Vesmir svetos = new Vesmir();
        svetos.start();
        svetos.stop();

        Planeta pcklubJ13 = new Planeta("Jedlikova13", 20000, 10);
        Planeta pcklubJ9 = new Planeta("Jedlikova9", 20000, 20);
        Planeta pcklubJ5 = new Planeta("Jedlikova5", 20000, 8);
        Planeta pcklubR = new Planeta("Rampova", 20000, 5);
        Planeta pcklubFU = new Planeta("Rampova", 20000, 6);
        Planeta pcklubBN = new Planeta("BozenyNemcovej", 20000, 3);

        Hviezda UVT = new Hviezda();
    }
}