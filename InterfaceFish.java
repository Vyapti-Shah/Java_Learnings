public class InterfaceFish implements InterfacePrey,InterfacePredator {
    
    @Override
    public void hunt(){
        System.out.println("The Fish is hunting other smaller fishes");
    }
    
    @Override
    public void flee(){
        System.out.println("The Fish is fleeing from other bigger fishes");
    }
}
