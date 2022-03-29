package cat.institutmvm;

public class Chair {
    String type,color,material,shop;
    float price;
    Integer units;

    public String getType(){
        type = "Cadira comú";
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }

    public String getColor(){
        color = "noguera";
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getMaterial(){
        material = "Fusta";
        return this.material;
    }

    public void setMaterial(String  material){
        this.material = material;
    }

    public String getShop (){
        shop = "IKEA";
        return this.shop;
    }

    public void setShop(String shop){
        this.shop = shop;
    }

    public float getPrice(){
        price = (float) 20.50;
        return this.price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public  Integer getUnits(){
        units = 5;
        return this.units;
    }

    public void setUnits(Integer units){
        this.units = units;
    }

    public void Chair() {
        System.out.println("Cadira:\n\tTipus: "+getType()+"\n\tColor: "+getColor()+"\n\tMaterial: "+getMaterial()+"\n\tBotiga: "+getShop()+"\n\tPreu: "+getPrice()+" €\n\tUnitats: "+ getUnits());
    }
}
