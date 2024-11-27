public class boot implements Accessories_boot{
    protected String name;
    protected double speed_up = 10;
    protected int level;

    public boot (String name){
        this.name = name;
    }
    @Override
    public void level_up(){
        level++;
        speed_up = speed_up + 5;
    }
    @Override
    public double getSpeed_up(){
        return speed_up;
    }
    public void display(){
        System.out.println("Boot Name: " + name);
        System.out.println("Boot Level: " + level);
        System.out.println("Boot Speed up: " + speed_up);
    }
}
