package StudenskyZivot;
//ako hviezda
public class KontrolneOrgany {
        private Boolean pomahat;
        private String name;

    public KontrolneOrgany(String name) {
        this.name = name;
    }

    public void svetit(Boolean pomoct, String MenoOrganizacie){

        setPomahat(false);
        if(MenoOrganizacie == "PCklub" && this.name == "UVT"){
            setPomahat(true);
        }
        if(this.name == "UbytovacieOddelenia"){
            setPomahat(true);
        }
        if(MenoOrganizacie == "StudentskaZrada" && this.name == "AkademickySenat"){
            setPomahat(true);
        }

    }

    public void setPomahat(Boolean pomahat) {
        this.pomahat = pomahat;
    }
}
