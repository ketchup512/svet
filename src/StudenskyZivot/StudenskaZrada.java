package StudenskyZivot;
//ako vesmirne teleso black hole
public class StudenskaZrada extends StudenskeOrganizacie{

    private long mnoztvo_peniazi;
    private long pocet_pripojenych;

    public StudenskaZrada(String name) {
        super(name);
    }

    public void OrganizaciaParty(){
        setMnoztvo_peniazi(getMnoztvo_peniazi()/2);
    }
    public long getMnoztvo_peniazi() {
        return mnoztvo_peniazi;
    }

    public void setMnoztvo_peniazi(long pocet_pripojenych) {
        this.mnoztvo_peniazi = pocet_pripojenych * 27;
    }

    public void poslat_peniaze_net(){
        setMnoztvo_peniazi(getMnoztvo_peniazi()-(pocet_pripojenych*16));
    }

    public long getPocet_pripojenych() {
        return pocet_pripojenych;
    }
}
