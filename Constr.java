public class Constr{
    int modelyear;
    String modelname;
    public Constr(int year, String name){
        modelyear=year;
        modelname=name;
    }
    public static void main(String[] args){
        Constr car= new Constr(2020,"BMW");
        System.out.println(car.modelname+ " "+ car.modelyear);
    }
}