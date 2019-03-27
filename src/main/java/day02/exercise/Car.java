package day02.exercise;

public class Car {
    private String color;
    private String type;

    public Car(String 红色, String 轿车) {
        this.type = "轿车";
        this.color = "红色";
    }

    public Car(int type, int color) {
        this.type = "轿车";
        this.color = "黑色";
    }


    public void ShowColor(){
        String showColor="";
    };
     public void ShowType(){
        String showType="";
    };


    public static void main(String[] args) {
        Car car2=new Car("红色","轿车");
    }
}