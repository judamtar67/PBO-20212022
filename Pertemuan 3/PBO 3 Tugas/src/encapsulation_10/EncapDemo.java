/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation_10;

/**
 *
 * @author Asus-PC
 */
public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if(newAge>30){
            age=30;
        }else if(newAge<18){
            age=18;
        }else{
            age=newAge;
        }
    }
    
}
