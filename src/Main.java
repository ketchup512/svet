import com.company.space.Vesmir;
import com.company.space.vesmirneTelesa.Hviezda;
import com.company.space.vesmirneTelesa.Planeta;
import com.company.space.vesmirneTelesa.Slnecna_sustava;
import com.company.space.Galaxia;
import com.company.space.vesmirneTelesa.Zem;
import com.company.zive_tvory.Ryba;
import com.company.zive_tvory.Vtak;
import com.company.zive_tvory.Delfin;
import com.company.zive_tvory.Tvor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Vesmir svetos = new Vesmir();
        Galaxia Mliecna_cesta = new Galaxia("Galaxy");
        Galaxia Syzranova = new Galaxia("SyzranovaGalaxy");
        svetos.start();
        System.out.println(Galaxia.getSprava());
        Slnecna_sustava m_sustava = new Slnecna_sustava();
        Planeta Mercury = new Planeta("Merkury", 76543456, 23456543);
        Planeta Neptun = new Planeta("Neptun",5432,2345);
        Planeta Uran = new Planeta("Uran",2345,6543);
        Zem MatickaZem = new Zem("Zem", 59722*Math.pow(10,24),12756);

        for (int i=0; i<50; i++){
            MatickaZem.addTvor(new Ryba());
            MatickaZem.addTvor(new Vtak());
            MatickaZem.addTvor(new Delfin());
        }
        Tvor[] poleTvorov = MatickaZem.getPoleTvorov();

        for (int i=0; i< MatickaZem.getPocet_Tvorov(); i++){
            poleTvorov[i].hybsa(10,10,10);
        }
        m_sustava.addTeleso(Mercury);
        m_sustava.addTeleso(Uran);
        m_sustava.addTeleso(Neptun);

        Mliecna_cesta.addSustava(m_sustava);
        Mliecna_cesta.addSustava(m_sustava);
        System.out.println(Galaxia.getSprava());

        Syzranova.addSustava(m_sustava);
        System.out.println(Galaxia.getSprava());
        svetos.stop();

    }
}