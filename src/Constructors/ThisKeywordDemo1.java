package Constructors;
class Central{
    int k;
    double l;
    Central(int k,double l){
        this.k=k;
        this.l=l;
    }
    void displayInfo(){
        System.out.println(this);
        System.out.println("K= "+k);
        System.out.println("L= "+l);
    }
}
public class ThisKeywordDemo1 {
    public static void main(String[]args){
        Central c1=new Central(10,56.43);
        c1.displayInfo();
        System.out.println(c1);
    }
}
