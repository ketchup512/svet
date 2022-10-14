package StudenskyZivot;
//ako Planeta
public class PCklub extends StudenskeOrganizacie{


    private long pocet_pripojenych;
    private Boolean daco_pokazene;
    public PCklub(String name) {
        super(name);
        setDaco_pokazene(false);
    }

    public void pripojit(long pocet_pripojenych){
        setPocet_pripojenych(pocet_pripojenych);
    }

    public void oprava_sieti(Boolean pokazene){
        if(pokazene){
           setDaco_pokazene(false);
        }
    }

    public Boolean getDaco_pokazene() {
        return daco_pokazene;
    }

    private void setDaco_pokazene(Boolean daco_pokazene) {
        this.daco_pokazene = daco_pokazene;
    }

    public long getPocet_pripojenych() {
        return pocet_pripojenych;
    }

    private void setPocet_pripojenych(long pocet_pripojenych) {
        this.pocet_pripojenych = pocet_pripojenych;
    }
}
