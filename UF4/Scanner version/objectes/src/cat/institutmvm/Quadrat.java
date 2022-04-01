package cat.institutmvm;

import java.util.Scanner;

public class Quadrat {
    Integer costat1,costat2,costat3,costat4;

    public Integer getCostat1(){
        Scanner n = new Scanner(System.in);
        System.out.println("Introdueix la mesura del costat 1:");
        costat1 = Integer.valueOf(n.nextLine());
        return this.costat1;
    }

    public void setCostat1(Integer costat1){
            this.costat1 = costat1;

    }

    public Integer getCostat2(){
        Scanner n = new Scanner(System.in);
        System.out.println("Introdueix la mesura del costat 2:");
        costat2 = Integer.valueOf(n.nextLine());
        return this.costat2;
    }

    public void setCostat2(Integer costat2){
        this.costat2 = costat2;

    }

    public Integer getCostat3(){
        Scanner n = new Scanner(System.in);
        System.out.println("Introdueix la mesura del costat 3:");
        costat3 = Integer.valueOf(n.nextLine());
        return this.costat3;
    }

    public void setCostat3(Integer costat3){
        this.costat3 = costat3;

    }

    public Integer getCostat4(){
        Scanner n = new Scanner(System.in);
        System.out.println("Introdueix la mesura del costat 4:");
        costat4 = Integer.valueOf(n.nextLine());
        return this.costat4;
    }

    public void setCostat4(Integer costat4){
        this.costat4 = costat4;

    }

    public void Quadrat() {
        System.out.println("Quadrat:\n\tCostat 1: "+getCostat1()+
                " cm\n\tCostat 2: "+getCostat2()+
                " cm\n\tCostat 3: "+getCostat3()+
                " cm\n\tCostat 4: "+getCostat4()+" cm");
    }

}
