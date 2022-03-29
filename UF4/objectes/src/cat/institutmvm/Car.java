package cat.institutmvm;

public class Car {

    String brand,name_model, enrollment;
    float height,width;

    public String getBrand(){
        brand = "Hyundai";
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getName_model(){
        name_model = "Kona";
        return this.name_model;
    }

    public void setName_model(String name_model){
        this.name_model = name_model;
    }

    public String getEnrollment(){
        enrollment = "5426KRY";
        return this.enrollment;
    }

    public void setEnrollment(String enrollment){
        this.enrollment = enrollment;
    }

    public float getHeight(){
        height = (float)2.00;
        return this.height;
    }
    public void setHeight(float height){
        this.height = height;
    }

    public float getWidth(){
        width = (float) 3.00;
        return this.width;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public void Car() {
        System.out.println("Cotxe:\n\tMarca: "+getBrand()+"\n\tModel: "+getName_model()+"\n\tMatricula: "+getEnrollment()+"\n\tAlçada: "+getHeight()+"\n\tAmplada: "+getWidth());
    }
}
