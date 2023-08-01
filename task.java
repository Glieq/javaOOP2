class Building {
    private int health;

    public Building(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
}

class Hero {
    private int health;
    private int magicEnergy;

    public Hero(int health, int magicEnergy) {
        this.health = health;
        this.magicEnergy = magicEnergy;
    }

    public int getHealth() {
        return health;
    }

    public int getMagicEnergy() {
        return magicEnergy;
    }
}

class NeutralCharacter {
    private int health;

    public NeutralCharacter(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
}

class Render {
    public void showIndicator(Object obj) {
        if (obj instanceof Building) {
            Building building = (Building) obj;
            System.out.println("Building health: " + building.getHealth());
        } else if (obj instanceof Hero) {
            Hero hero = (Hero) obj;
            System.out.println("Hero health: " + hero.getHealth());
            System.out.println("Hero magic energy: " + hero.getMagicEnergy());
        } else if (obj instanceof NeutralCharacter) {
            NeutralCharacter character = (NeutralCharacter) obj;
            System.out.println("Neutral character health: " + character.getHealth());
        } else {
            System.out.println("Unknown object type");
        }
    }
}

public class task {
    public static void main(String[] args) {
        Building building = new Building(100);
        Hero hero = new Hero(150, 50);
        NeutralCharacter character = new NeutralCharacter(80);

        Render renderer = new Render();
        renderer.showIndicator(building);
        renderer.showIndicator(hero);
        renderer.showIndicator(character);
    }
}
