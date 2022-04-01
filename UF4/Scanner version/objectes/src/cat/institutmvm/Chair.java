package cat.institutmvm;
import java.util.Scanner;


public class Chair {
    String type,color,material,shop;
    float price;
    Integer units;

    public String getType(){
        Scanner n = new Scanner(System.in);
        System.out.println("Introdueix tipus de cadira:");
        type = n.nextLine();
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }

    public String getColor(){
        Scanner n = new Scanner(System.in);
        System.out.println("Introdueix el color de la cadira:");
        color = n.nextLine();
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getMaterial(){
        Scanner n = new Scanner(System.in);
        System.out.println("Introdueix el material de la cadira:");
        material = n.nextLine();
        return this.material;
    }

    public void setMaterial(String  material){
        this.material = material;
    }

    public String getShop (){
        Scanner n = new Scanner(System.in);
        System.out.println("Introdueix la botiga on s'ha comprat:");
        shop = n.nextLine();
        return this.shop;
    }

    public void setShop(String shop){
        this.shop = shop;
    }

    public float getPrice(){
        Scanner n = new Scanner(System.in);
        System.out.println("Introdueix el preu de la cadira:");
        price = Float.parseFloat(n.nextLine());
        return this.price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public  Integer getUnits(){
        units = 5;
        Scanner n = new Scanner(System.in);
        System.out.println("Introdueix el numero de unitats:");
        units = Integer.valueOf(n.nextLine());
        return this.units;
    }

    public void setUnits(Integer units){
        this.units = units;
    }

    public void Chair() {
        System.out.println("Cadira:\n\tTipus: "+getType()+
                "\n\tColor: "+getColor()+
                "\n\tMaterial: "+getMaterial()+
                "\n\tBotiga: "+getShop()+
                "\n\tPreu: "+getPrice()+" €\n\tUnitats: "+ getUnits());
    }
}
