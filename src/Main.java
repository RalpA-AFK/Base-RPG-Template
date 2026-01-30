import javax.swing.SwingUtilities;
import javax.swing.JFrame;
public class Main {

    public static void main(String[] args) {
        Weapon sword = new Weapon("Iron Sword", 20, 7);
        Weapon shield = new Weapon("Iron shield", 0, 2);
        Weapon bow = new Weapon("Daedalus", 40, 23);
        Weapon dagger = new Weapon("Black Steel Dagger", 10, 25);
        Weapon rosary = new Weapon("Unyielding Cross", 10, 8);
        Weapon staff = new Weapon("Inferno staff", 30, 12);

        Character warrior = new Warrior("John", sword, shield);
        Character mage = new Mage("Margret", staff);
        Character archer = new Archer("Sheila", bow, dagger);
        Character priest = new Priest("Constantine", rosary);

        Status flame = new Status("Flame",5,3);
        Status bleed = new Status("Bleed", 2,2);
        Status freeze = new Status("freeze",true,1);
        Status frosted = new Status("Frosted",true,2);
        Status weakened = new Status("weakened",true,2);
        Status holyDown = new Status("Holy Down",true,1);
        Status holyUp = new Status("Holy Up",true, 1);
        Status regen = new Status("Regen",true,3);
        Status dmgUp = new Status("DMG Up", true,2);
        Status blockUp = new Status("Block Buffed",true,2);

        Character[] characters = {warrior, mage, archer, priest};
        for(Character c : characters ) {
            c.attack();
            c.defend();
            System.out.println();
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrameDemo frame1 = new JFrameDemo();
            }
        });

    }
}