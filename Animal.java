package com.objects;

class Predator{
    Predator lion(){
        System.out.println("king of the jungle");
        return this;
    }
}

class Animal 
{
	Predator p = new Predator();
    Predator predator = p.lion();
	
    void instanceMethod(){
        System.out.println(predator);
    }
}
class testPredator{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.instanceMethod();
    }
}

