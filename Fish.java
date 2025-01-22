public class Fish implements Predator,Prey {
    @Override
    public void hunt(){
        System.out.println("the fish is hunting");
    }
    public void flee(){
        System.out.println("the fish is being hunted");
    }
}
