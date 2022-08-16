package com.sandwich.repository.impl;

import com.sandwich.model.Spices;
import com.sandwich.repository.ISpicesRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SpicesRepository implements ISpicesRepository {
    private static List<Spices> list = new ArrayList<>();

    static {
        list.add(new Spices("Lettuce"));
        list.add(new Spices("Tomato"));
        list.add(new Spices("Mustard"));
        list.add(new Spices("Sprout"));
    }

    @Override
    public List<Spices> spicesList() {
        return list;
    }
}
