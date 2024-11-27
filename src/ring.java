public class ring implements Accessories_ring{
    protected int magic = 10;
    protected String name;
    protected int level =1;
    public ring(String name) {
        this.name = name;
    }
    @Override
    public void level_up(){
        level++;
        magic += 2;
    };
    @Override
    public int get_magic(){
        return magic;
    }
    public void display(){
        System.out.println("Ring Name: " + name);
        System.out.println("Ring Level: " + level);
        System.out.println("Ring Magic: " + magic);
    }
}
