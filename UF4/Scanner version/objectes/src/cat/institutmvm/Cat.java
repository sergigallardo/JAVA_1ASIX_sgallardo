package cat.institutmvm;

import java.util.Scanner;

public class Cat {
    String name,type,gender,sterilitzed;
    Integer age;
    float weight;

    public String getName(){

        Scanner n = new Scanner(System.in);
        System.out.println("Introdueix el nom del gat:");
        name = n.nextLine();
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        Scanner n = new Scanner(System.in);
        System.out.println("Com es el gat:");
        type = n.nextLine();
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getGender(){
        gender = "Femella";
        Scanner n = new Scanner(System.in);
        System.out.println("Introdueix el genere  del gat:");
        gender = n.nextLine();
        return this.gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public String getSterilitzed(){
        Scanner n = new Scanner(System.in);
        System.out.println("El gat esta esterilitzat?:");
        sterilitzed = n.nextLine();
        return this.sterilitzed;
    }

    public void setSterilitzed(String sterilitzed){
        this.sterilitzed = sterilitzed;
    }

    public Integer getAge(){
        Scanner n = new Scanner(System.in);
        System.out.println("Introdueix la edat del gat:");
        age = Integer.valueOf(n.nextLine());
        return this.age;
    }
    public void setAge(Integer  age){
        this.age = age;
    }

    public float getWeight(){
        Scanner n = new Scanner(System.in);
        System.out.println("Introdueix la edat del gat:");
        weight = Float.parseFloat(n.nextLine());
        return  this.weight;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public void Cat() {
        System.out.println("Gat:\n\tNom: "+getName()+
                "\n\tTipus: "+getType()+
                "\n\tGenere: "+getGender()+
                "\n\tEsterilitzat: "+getSterilitzed()+
                "\n\tEdat: "+getAge()+
                " anys\n\tPes: "+ getWeight()+" kg");
    }
}
