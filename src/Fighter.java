public class Fighter extends RPG_characters{
    Accessories_boot[] boots =new boot[1];;
    public Fighter(String name) {
        super(name);
        HP = 120;
        MP = 30;

    }
    public void get_final_speed(){
        System.out.println("Your speed is " + (speed+boots[0].getSpeed_up()));
    }
    public void wear_boots(boot p) {
        boots[0] = p;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("RPG_characters Class: Fighter");
    }
    @Override
    public void Attack(RPG_characters o){
        if(boots.length == 0){
            super.Attack(o);
        }else {
            if(speed +boots[0].getSpeed_up() <= 0){
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
    }
    public void healing(){
        int heal = HP/10;
        if(currentHp == HP){
            System.out.println("You healed!");
        }else if(currentHp+heal >= HP){
            currentHp = HP;
            System.out.println("You healed!");
        }else {
            currentHp = currentHp + heal;
            System.out.println("You healed!");
        }
    }
}
