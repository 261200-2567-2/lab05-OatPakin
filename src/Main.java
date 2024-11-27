public class Main {
    public static void main(String[] args) {

    Fighter o = new Fighter("pp");
    boot p = new boot("lllll");
    o.wear_boots(p);
    p.level_up();
    o.display();
    o.get_final_speed();
    Fighter o2 = new Fighter("p0p");
    equipment_swords k = new equipment_swords("p0p");
    o.equipment_sword(k);
    o.Attack(o2);
        System.out.println(o2.currentHp);
        o2.healing();
        o2.healing();
        o2.healing();
        o2.healing();

        o2.get_current_hp();
        Mage m = new Mage("p0p");
        ring d = new ring("ooooo");
        d.level_up();
        m.wear_ring(d);
        m.use_spell(o2);
        o2.get_current_hp();
        d.display();

    }
}