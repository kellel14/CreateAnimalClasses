public class Bunny extends Animal {
    public Bunny(){
        System.out.println("Now I am a bunny!");
    }

    @Override
    public String sleep(){
        return "A bunny sleeps.";
    }

    @Override
    public String eat (){

        return "A bunny eats";
    }

    public String hop(){
        return "hippity hoppity...";
    }
}
