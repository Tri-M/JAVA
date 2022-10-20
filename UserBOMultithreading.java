import java.util.*;
import java.lang.*;

class User{
    String username,mobileNo;

    User(String username,String mobileNo){
        this.username=username;
        this.mobileNo=mobileNo;
    }

    public String getUsername(){
        return username;
    }

    public String getMobileNo(){
        return mobileNo;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public void setMobileNo(String mobileNo){
        this.mobileNo=mobileNo;
    }

    public String toString(){
        return "Username: "+username+" Mobile No: "+mobileNo;
    }


}

class UserBO extends Thread
{   User u;
    Thread t;
    public List<User> userList=new ArrayList<User>();
    public static List<String> message=new ArrayList<String>();
    public UserBO(User u){
        this.u=u;
        t=new Thread(this);
        t.start();
    }
    @Override
    public void run(){
        synchronized(u){
            message.add(u.getUsername());
            message.add(u.getMobileNo());
            System.out.println(message);
            u.toString();
        }
       
    }

    public void start(){
        // System.out.println("message :"+message);
        if(t==null){
            t=new Thread(this);
            t.start();
        }
    }
  
}

public class Main{
    public static void main(String[] args) {
        
        User obj=new User("trisha", "90909");
        User u1=new User("hello", "90909");
        User u2=new User("hi", "90909");
        UserBO obj1=new UserBO(obj);
        obj1.start();
        UserBO obj2=new UserBO(u1);
        obj2.start();
        UserBO obj3=new UserBO(u2);
        obj3.start();
        
    }
}
