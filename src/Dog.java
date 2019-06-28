// add own comments

public class Dog extends  Animal{

    public Dog (){
        System.out.println("Now I am a dog!");
    }

    @Override
    public String sleep(){
        return "A dog sleeps...";
    }

    @Override
    public String eat(){
        return "A dog eats...";
    }

    public String bark(){
        return "woof...";
    }
}
