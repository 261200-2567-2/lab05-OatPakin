public class RPG_characters {
    String name;
    int level = 1;
    int HP ;
    int MP;
    double r = 100;//base speed
    double speed;

    double currentHp;

    protected boolean take_weapon_sword = false;
    protected equipment_swords ex_calibre;
    protected boolean take_weapon_shield = false;
    protected equipment_shield green_dragon;

    public  RPG_characters(String name) {
        this.name = name;

        HP = 100;
        MP = 50;
        set_Max_speed();
        System.out.println("LINK STARTED");
        System.out.println(name + " JOIN GAME");

        this.currentHp = HP;
    }
    public void levelUp() {
        level++;
        HP = HP +10;
        MP = MP +2;
        set_Max_speed();
        System.out.println(name + " level up");
        this.currentHp = HP;
    }
    private void set_Max_speed(){
        if(take_weapon_sword && take_weapon_shield){
            speed = r*(0.1+0.03*level) - (r*(0.1+0.04*ex_calibre.level) + r*(0.1+0.08*green_dragon.level));
        }else if(take_weapon_sword) {
            speed = r*(0.1+0.03*level) - r*(0.1+0.04*ex_calibre.level);
        }else if(take_weapon_shield){
            speed = r*(0.1+0.03*level) - r*(0.1+0.08*green_dragon.level);
        }else {
            speed = r*(0.1+0.03*level);
        }
    }
    public void equipment_sword(equipment_swords o){
        take_weapon_sword = true;
        this.ex_calibre = o;
        set_Max_speed();
        equipment_swords.is_equipped = true;
        System.out.println(name + " equip sword");
    }
    public void takeoff_sword(){
        take_weapon_sword = false;

        set_Max_speed();
        equipment_swords.is_equipped = false;
        System.out.println(name + " takeoff sword");
    }
    public void equipment_shield(equipment_shield o){
        take_weapon_shield = true;
        this.green_dragon = o;
        set_Max_speed();
        equipment_shield.is_equipped = true;
        System.out.println(name + " equip shield");
    }
    public void takeoff_shield(){
        take_weapon_shield = false;

        set_Max_speed();
        equipment_shield.is_equipped = false;
        System.out.println(name + " takeoff shield");
    }
    public void Attack(RPG_characters o){
        if(speed <= 0){
            System.out.println("Can't Attack");
        }else if(!take_weapon_sword){
            System.out.println("Please take your sword");
        }else if(o.currentHp <=0){
            System.out.println("This Guy already dead!!");
        }else if(o.take_weapon_shield){
            o.currentHp = o.currentHp - (ex_calibre.damage - o.green_dragon.defense);
        }else {
            o.currentHp = o.currentHp - ex_calibre.damage;
        }
    }
    public void get_current_hp(){
        System.out.println("Your current HP is: " + currentHp);
    }
    public void display() {
        System.out.println("RPG_characters Name: " + name);
        System.out.println("RPG_characters Level: " + level);
        System.out.println("RPG_characters HP: " + HP);
        System.out.println("RPG_characters MP: " + MP);
        System.out.println("RPG_characters run_speed: " + speed);
        if (take_weapon_sword){
            System.out.println("RPG_characters damage: " + ex_calibre.damage);
        }
        if (take_weapon_shield){
            System.out.println("RPG_characters defence: " + green_dragon.defense);
        }

    }
}
