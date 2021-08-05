package com.learning.examples.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompartorwithoutGenreic {
	public static void main(String[] args) {
        List<Cars> carslist = new ArrayList<>();
        carslist.add(new Cars("Viper","Sports",1125412342l));
        carslist.add(new Cars("Supra","Sports",1244560087l));
        carslist.add(new Cars("Royce","Sedan",1111412341l));
        carslist.add(new Cars("Patriot","OffRoad",9831441244l));
        System.out.println("The cars before sorting\n\n");
        carslist.forEach((car)->System.out.println(car.name+" "+car.type+" "+car.ID));
        //Now we sort by the name
        Collections.sort(carslist, new NameComparator());
        System.out.println("\n\nThe cars after sorting by the car names\n\n");
        carslist.forEach((car)->System.out.println(car.name+" "+car.type+" "+car.ID));
        System.out.println("\n\nThe cars after sorting them by their type\n\n");
        //Now we sort the values by their type. 
        Collections.sort(carslist,new TypeComparator());
        carslist.forEach((car)->System.out.println(car.name+" "+car.type+" "+car.ID));
        
    }

}
