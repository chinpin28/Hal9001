package Liftoff;

public class UserStats{
private String name;
private int age;
private int height;
private double weight;
private int hunger;
private int  mood;
private int stress;
public UserStats(String n,int a,int h, double w){
    name=n;
    age=a;
    height=h;
    weight=w;
    hunger=0;// hunger should increase when not eating
    mood=5;
    stress=0;//stress increases during tasks or emergencies
}

public String getName(){
    return name;
}
public int getAge(){
    return age;
}
public int getHeight(){
    return height;
}
public double getWeight(){
    return weight;
}
public int getHunger(){
    return hunger;    
}
public int getMood(){
    return mood;
}
public int getStress(){
    return stress;
}
public void setName(String n){
     name=n;
}
public void setAge(int n){
     age=n;
}
public void setHeight(int n){
     height=n;
}
public void setWeight(double n){
     weight=n;
}
public void setHunger(int n){
     hunger=n;    
}
public void setMood(int n){
mood=n;
}
public void setStress(int n){
    stress=n;
}
public void changeWeight(double n){
    weight+=n;
}
public void changeStress(int n){
    stress+=n;
}
public void changeMood(int n){
    mood+=n;
}
public void changeHunger(int n){
    hunger+=n;
}

}