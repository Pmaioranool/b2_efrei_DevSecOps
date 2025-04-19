package com.example.DevSecOps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ServiceWeb {

    ArrayList<Chicken> Chickens = new ArrayList<Chicken>();

    public ServiceWeb() {
        Chicken Chicken = new Chicken("jockey", "none", 2);
        Chickens.add(Chicken);
        Chicken = new Chicken("Jeff", "A", 5);
        Chickens.add(Chicken);
        Chicken = new Chicken("Geoff", "B", 1);
        Chickens.add(Chicken);
        Chicken = new Chicken("Danny", "C", 3);
        Chickens.add(Chicken);
    }

    @GetMapping("/Chickens/{name}")
    public Chicken disBonjour(@PathVariable("name") String name) {
        int i = 0;
        while (i < Chickens.size() && Chickens.get(i).getName().equals(name) == false) {
            i++;
        }
        if (i < Chickens.size()) {
            return Chickens.get(i);
        } else {
            return null;
        }
    }
}