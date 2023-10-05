import java.util.*;

class Vehicles{
    public void Vehicles(){
        System.out.println("Vehicle class");
    }
    public void vehType(){
        System.out.println("Four Wheelers");
    }
}

class Model extends Vehicles{
    public void Model(){
        System.out.println("SUV");
    }
    public void driveTrain(){
        System.out.println("4WD");
    }
}

class Brand extends Model{
    public void Brand(){
        System.out.println("Mercedes");
    }
    public void modelName(){
        System.out.println("G900");
    }
}

public class Test{
    public static void main(String[] args){
        Brand v = new Brand();
        v.Vehicles();
        v.vehType();
        v.Model();
        v.Brand();
        v.modelName();
        v.driveTrain();
    }
}