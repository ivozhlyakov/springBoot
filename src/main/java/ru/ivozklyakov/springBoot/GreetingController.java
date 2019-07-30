package ru.ivozklyakov.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ivozklyakov.springBoot.dao.entity.TaxEnum;
import ru.ivozklyakov.springBoot.dao.repository.TaxEnumRepo;

import java.util.List;
import java.util.Map;

@RestController
public class GreetingController {

    @Autowired
    private TaxEnumRepo taxEnumRepo;


    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        model.put("some", "Let's begin!!!");
        return "main";
    }


    @GetMapping("/taxenum")
    public ResponseEntity<?> getAllEnum(Pageable pageable) {
        return ResponseEntity.ok(taxEnumRepo.findAll(pageable));
    }

}
