public class Mage extends RPG_characters{
    Accessories_ring[] rings;
    public Mage(String name) {
        super(name);
        HP = 90;
        MP = 60;
        this.rings = new Accessories_ring[1];
    }
    public void wear_ring(ring o){
        rings[0] = o;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("RPG_characters Class: Mage");
    }
    public void use_spell(RPG_characters o){
        if(rings[0] == null){
            System.out.println("Can't use Magic");

        }else if(o.currentHp <=0){
            System.out.println("This Guy already dead!!");
        }else if(o.take_weapon_shield){
            o.currentHp = o.currentHp - (rings[0].get_magic() - o.green_dragon.defense);

        }else {
            o.currentHp = o.currentHp - rings[0].get_magic();
        }
    }

}
