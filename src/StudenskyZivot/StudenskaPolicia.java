package StudenskyZivot;
//ako vesmirne teleso satelit
public class StudenskaPolicia extends StudenskaZrada{
    private long pocet_pokut;
    private Boolean obchadzka;
    private long[] hucne_izby = new long[500];
    public StudenskaPolicia(String name, long pocet_pokut) {
        super(name);
        setPocet_pokut(pocet_pokut);
    }

    public void vypisat_pokutu(){
        setPocet_pokut(getPocet_pokut() - 1);
    }
    public void obchadzka(Boolean bola){
        setObchadzka(bola);
    }

    public Boolean getObchadzka() {
        return obchadzka;
    }

    public void setObchadzka(Boolean obchadzka) {
        this.obchadzka = obchadzka;
    }

    public long getPocet_pokut() {
        return pocet_pokut;
    }

    private void setPocet_pokut(long pocet_pokut) {
        this.pocet_pokut = pocet_pokut;
    }

}
