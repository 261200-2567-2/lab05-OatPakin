public class equipment_shield extends equipment{
    int s = 10; //base defence
    double defense;
    public equipment_shield(String o) {
        this.name = o;
        Set_defence();
        System.out.println("shield "+ o +" created");
    }
    public void levelUp() {
        if(is_equipped == false) {
            level++;
            Set_defence();
            System.out.println("shield level up");
        }else {
            System.out.println("please take off all your shield before upgrade");
        }
    }
    private void Set_defence(){
        defense = s*(1+0.05*level);
    }
    public void Print_equipment(){
        System.out.println("equipment_shield level: " + level);
        System.out.println("equipment_shield defense: " + defense);
    }
}
