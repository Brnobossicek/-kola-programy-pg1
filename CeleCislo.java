public class CeleCislo implements UmiSePorovnat, Comparable{
    int cislo;

    public CeleCislo(int cislo) {
        this.cislo = cislo;
    }

    @Override
    public Boolean jsemVetsiNez(UmiSePorovnat druhyPrvek) {
        CeleCislo x = (CeleCislo) druhyPrvek;
        if (cislo>x.cislo){
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Object o){
        CeleCislo x = (CeleCislo) o;
        if (cislo>x.cislo){
            return 1;
        } if (cislo==x.cislo){
            return 0;
        }else {
            return -1;
        }
    }
}
