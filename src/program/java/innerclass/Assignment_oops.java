package program.java.innerclass;

abstract class Pen {
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen {
    void write() {
        System.out.println("Write");
    }
    void refill() {
        System.out.println("Refill");
    }
    void changeNib() {
        System.out.println("Change the nib");
    }
}

class Monkey {
    void jump() {
        System.out.println("Jump");
    }
    void bite() {
        System.out.println("Bite");
    }
}

interface BasicAnimal {
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("Speak");
    }

    @Override
    public void eat() {
        System.out.println("Eat");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep");
    }
}

public class Assignment_oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FountainPen fp = new FountainPen();
        fp.changeNib();

        Human h = new Human();
        h.sleep();
        
        Monkey m = new Human();
        m.jump();
        m.bite();
       
        BasicAnimal ba = new Human();
        ba.eat();
        ba.sleep();

	}

}
