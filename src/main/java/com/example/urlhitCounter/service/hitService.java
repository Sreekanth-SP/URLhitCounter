package com.example.urlhitCounter.service;
import com.example.urlhitCounter.model.hitModel;
import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class hitService {
    HashMap<String,Integer> hm=new HashMap<>();
    public hitModel getCount(String username) {

        hm.put(username,hm.getOrDefault(username,0)+1);
        hitModel visitor=new hitModel(username,hm.get(username));
        return visitor;
    }
}
