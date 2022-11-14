import com.company.space.Vesmir;
import com.company.space.vesmirneTelesa.Planeta;
import com.company.space.vesmirneTelesa.Slnecna_sustava;
import com.company.space.Galaxia;
import com.company.space.vesmirneTelesa.Zem;
import com.company.zive_tvory.Delfin;
import com.company.zive_tvory.Tvor;
import com.company.zive_tvory.bezstavovce.hmyz.Mucha;
import com.company.zive_tvory.stavovce.ryby.Kapor;
import com.company.zive_tvory.stavovce.ryby.Orlik;
import com.company.zive_tvory.stavovce.ryby.Pstruh;

import java.util.Date;

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

        Date dNow = new Date();
        Kapor vianocnykapor = new Kapor(50);
        Pstruh cervenarybka = new Pstruh(20);
        Orlik orlikObycajny = new Orlik(6);
        cervenarybka.born(dNow);
        orlikObycajny.born(dNow);
        vianocnykapor.born(dNow);
        cervenarybka.hybsa(55,55,55);
        vianocnykapor.hybsa(10,15,87);
        orlikObycajny.hybsa(99,33,45);
        vianocnykapor.die(dNow);
        cervenarybka.die(dNow);

        Mucha vinnaMucha = new Mucha();

        MatickaZem.addTvor(vinnaMucha);
        MatickaZem.addTvor(orlikObycajny);
        MatickaZem.addTvor(vianocnykapor);
        MatickaZem.addTvor(cervenarybka);
        for (int i=0; i<50; i++){
           // MatickaZem.addTvor(new Ryba(5));
          //  MatickaZem.addTvor(new Vtak(5));
          //  MatickaZem.addTvor(new Kapor(50));
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