public class SuperHero extends Person{
    private String alterEgo;

    public SuperHero(String governmentName, String alterEgo){
        super(governmentName);
        this.alterEgo = alterEgo;
    }

    public String getName() {
        return alterEgo;
    }

    public String getSecretIdentity(){
        return super.getName();
    }

    public static void main(String[] args) {
        SuperHero theManofSteel = new SuperHero("Clark Kent", "Superman");

        System.out.println("theManofSteel.getName() = " + theManofSteel.getName());
        System.out.println("theManofSteel.getSecretIdentity() = " + theManofSteel.getSecretIdentity());

    }
}
