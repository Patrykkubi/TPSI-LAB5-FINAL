package tpsi.web;
import java.util.ArrayList;
import java.util.List;

public class Student {

 private String firstName;
    private String lastName;
    private String email;
    
    
    
    public Student(String firstName, String lastName, String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getEmail(){
        return this.email;
    }
    public String getLastName(){
        return this.lastName;
    }
}
