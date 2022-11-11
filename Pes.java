
public class Pes implements UmiSePorovnat{

    int Vaha =245;

    public int mojeVaha(){
        return Vaha;
    }
    public int mujDruh () {
        int h = 4;
        return h;
    }

    public Boolean jsemVetsiNez (UmiSePorovnat druhyPrvek){
        Pes x = (Pes) druhyPrvek;
        if (mojeVaha()> x.mojeVaha()){
            return true;
        } else {
            return false;
        }

    }
}


