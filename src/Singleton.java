import com.company.space.Vesmir;

public class Singleton {
    private static Singleton instance = null;
    private Vesmir svetos;
    private Singleton() {
    }


    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }

    public void takeVesmir(Vesmir svetos){
        this.svetos = svetos;

        System.out.println("Vesmir teraz uz ma stvoritela");
    }
}
