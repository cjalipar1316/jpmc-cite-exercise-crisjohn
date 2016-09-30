import objects.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //code here.
        /*
        buak
         */
//DATATYPES
       /*
        byte num = 27;
        short mediumRangeDecimalVariable = 929;
        int decimalVariableUpto = 4983;
        long largeDecimalVariableFrom = 8201983091820301L;
        long largeDecimalVariableUpto = 2809280977957657599L;
        float numberWithDecimalPlaces = 232323.8f;
        double veryLargeNumberWithDecimalPlaces = 172.992342349;
        boolean isTrueOrFalse = false;
        char singleCharacter = '\u0065';

        decimalVariableUpto = largeDecimalVariableUpto;

        String someText = "this is a string variable";


        System.out.println("Hello World!");


        System.out.println(veryLargeNumberWithDecimalPlaces);
*/
//ENCASULATION, INHERITANCE and POLYMORPHISM
//
//        Person person = new Person("Cris John","Alipar","crisjohnalipar@gmail.com","cjalipar1316");
//        person.setFirstName("Cris John");
//        person.setLastName("Alipar");

//        String theFirstName = person.getFirstName();
//        String introduceYourSelf = person.introduceYourSelf();

//        System.out.println(introduceYourSelf);

/*
        Employee manager = new Employee();
        manager.setFirstName("Daniel");
        manager.setLastName("Tibon");
        manager.setDepartment("CITE");

        String introduceYourselfManager = manager.introduceYourself();

        System.out.println(introduceYourselfManager);



        Customer poop = new Customer();
        poop.setFirstName("Polly");
        poop.setLastName("Cops");
        poop.setAddress("Los Angeles, California");

        String introduceYourselfPoop = poop.introduceYourself();
        int  noOfProduct = poop.noOfProducts(1090);

        String introduceYourselfPoopBuy = poop.introduceYourself(noOfProduct+" "+"Coconut Milk");

        System.out.println(introduceYourselfPoop);
        System.out.println(introduceYourselfPoopBuy);

        int id = 67;

        if(id == 68){
            System.out.println("Yehey its 68!");
        }else if(id == 60){
            System.out.println("Yehey its 60!");
        }else{
            System.out.println("Yehey its 67!");
        }

        int n = 1;
        int m = 0;*/
/*
        while( n <= 6){
            System.out.print("["+n+"] ");

            n++;
        }*/

        /*while( n <= 6){

            m += n;

            n++;
            System.out.print(m);
        }*/

        /*do{
            System.out.print("["+n+"] ");
            n++;
        }while(n <= 6);*/


       /* for(n = 1 ; n <= 6 ; n++){
            System.out.print("["+n+"] ");
        }*/

        /*for(n = 1 ; n <= 6 ; n++){
            m += n;
        }

        System.out.print(m);*/


        /*String[] myInstructor = {"Neil","Bert","Amille"};
        for(int i = 0; i <3 ; i++){
            if( myInstructor[i] == "Bert"){
                myInstructor[i] = "Amante";
                System.out.println(myInstructor[i]);
            }else{
                System.out.println(myInstructor[i]);
            }

        }*/

        for(int i = 0; i < 7 ; i++){
            System.out.print(MyCollection.myFriends()+" ");
            System.out.print(MyCollection.relationship()+" ");
            System.out.print(MyCollection.myGirlFriends()+" ");
        }

//        MyCollection.myGirlFriends();








        /* TODO create an animal class with three properties and setter and getter(String, int and boolean) */

//        Animal animal = new Animal();
//        animal.setNameOfSpecies("Leopard");
//        animal.setLifeSpan(15);
//        animal.setAlive(true);
//
//        String theNameOfSpecies = animal.getNameOfSpecies();
//        int lifeSpan = animal.getLifeSpan();
//        boolean isAlive = animal.isAlive();
//
//
//        System.out.println("Name of Species : "+theNameOfSpecies);
//        System.out.println("Life span : "+lifeSpan+" years");
//        System.out.println("Still Alive? "+isAlive);
//

        /* POLYMORPHISM
        1 OVERLOAD
        2 OVERRIDE
        */





    }
}
