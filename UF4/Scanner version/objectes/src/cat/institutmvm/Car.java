package cat.institutmvm;
import java.util.Scanner;
public class Car {

    String brand,name_model, enrollment;
    float height,width;

    public String getBrand(){
        Scanner n= new Scanner(System.in);//Crea una variable tipus scanner.
        System.out.println("Introdueix la marca del cotxe:");//Mostra per pantalla
        brand = n.nextLine();//Afegim la variable tipus scanner a la variable tipus String i llegeix el input.
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getName_model(){
        Scanner n = new Scanner(System.in);
        System.out.println("Introdueix el model del cotxe:");
        name_model = n.nextLine();
        return this.name_model;
    }

    public void setName_model(String name_model){
        this.name_model = name_model;
    }

    public String getEnrollment(){
        Scanner n = new Scanner(System.in);
        System.out.println("Introdueix la matricula:");
        enrollment = n.nextLine();
        return this.enrollment;
    }

    public void setEnrollment(String enrollment){
        this.enrollment = enrollment;
    }

    public float getHeight(){
        Scanner n = new Scanner(System.in);
        System.out.println("Introdueix la alçada del cotxe:");
        height = Float.parseFloat(n.nextLine());
        return this.height;
    }
    public void setHeight(float height){
        this.height = height;
    }

    public float getWidth(){
        width = (float) 3.00;
        Scanner n = new Scanner(System.in);
        System.out.println("Introdueix la amplada del cotxe:");
        width = Float.parseFloat(n.nextLine());
        return this.width;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public void Car() {
        System.out.println("Cotxe:\n\tMarca: "+getBrand()+
                "\n\tModel: "+getName_model()+
                "\n\tMatricula: "+getEnrollment()+
                "\n\tAlçada: "+getHeight()+
                " metres\n\tAmplada: "+getWidth()+" metres");
    }
}
