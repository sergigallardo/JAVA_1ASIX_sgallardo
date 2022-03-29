package cat.institutmvm;

public class Cat {
    String name,type,gender,sterilitzed;
    Integer age;
    float weight;

    public String getName(){
        name = "Yuuki";
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        type = "Atrigrat gris ataronjat";
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getGender(){
        gender = "Femella";
        return this.gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public String getSterilitzed(){
        sterilitzed = "Si";
        return this.sterilitzed;
    }

    public void setSterilitzed(String sterilitzed){
        this.sterilitzed = sterilitzed;
    }

    public Integer getAge(){
        age = 4;
        return this.age;
    }
    public void setAge(Integer  age){
        this.age = age;
    }

    public float getWeight(){
        weight = (float) 4.5;
        return  this.weight;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public void Cat() {
        System.out.println("Gat:\n\tNom: "+getName()+"\n\tTipus: "+getType()+"\n\tGenere: "+getGender()+"\n\tEsterilitzat: "+getSterilitzed()+"\n\tEdat: "+getAge()+" anys\n\tPes: "+ getWeight()+" kg");
    }
}
