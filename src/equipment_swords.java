public class equipment_swords extends equipment{
    int d = 10;  //base damage
    double damage;
    public equipment_swords(String o) {
        this.name = o;
        Set_damage();
        System.out.println("sword "+o+" created");
    }
    public void levelUp() {
        if(is_equipped == false) {
            level++;
            Set_damage();
            System.out.println("sword level up");
        }else {
            System.out.println("please take off all your swords before upgrade");
        }
    }
    private void Set_damage() {
        damage = d*(1+0.1*level);
    }
    public void Print_equipment() {
        System.out.println("equipment_swords level: " + level);
        System.out.println("equipment_swords damage: " + damage);
    }
}
