package StudenskyZivot;
// ako trieda VesmirneTelesa
public class StudenskeOrganizacie {
    private long pocet_ludi;
    private String name;

    public StudenskeOrganizacie(String name) {
        setPocet_ludi(20);
        setName(name);
    }

    public void Konkurz(long nove_cleny, long byvali_clenovia){
        setPocet_ludi(getPocet_ludi() - byvali_clenovia + nove_cleny);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public long getPocet_ludi() {
        return pocet_ludi;
    }

    private void setPocet_ludi(long pocet_ludi) {
        this.pocet_ludi = pocet_ludi;
    }
}
