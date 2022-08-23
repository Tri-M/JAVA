import java.util.*;
public class Player {
    String name;
    int age;
    String Country;
    public String getName(){
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    Player(){}
    Player(String name,int age, String Country){

    }
    public String toString(){
        return "Name:"+this.name+" Age:"+this.age;

    }

    public static void main(String[] args) {
        Player p = new Player();
        p.setName("Trisha");
        System.out.println(p.getName());
    }
}

