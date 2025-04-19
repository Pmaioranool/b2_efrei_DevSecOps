package com.example.DevSecOps;

public class Chicken {

    String Name;
    String Breed;
    int Age;
    boolean IsLayingEggs = false;

    public Chicken(String Name, String Breed, int Age) {
        this.Name = Name;
        this.Breed = Breed;
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public String getBreed() {
        return Breed;
    }

    public int getAge() {
        return Age;
    }

    public boolean isLayingEggs() {
        return IsLayingEggs;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setBreed(String Breed) {
        this.Breed = Breed;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setLayingEggs(boolean isLayingEggs) {
        IsLayingEggs = isLayingEggs;
    }
}