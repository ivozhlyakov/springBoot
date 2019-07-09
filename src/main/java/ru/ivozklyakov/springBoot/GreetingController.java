package ru.ivozklyakov.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ivozklyakov.springBoot.dao.TaxEnumRepo;
import ru.ivozklyakov.springBoot.dao.entity.TaxEnum;

import java.util.Map;

@Controller
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
    public String getAllEnum(Map<String, Object> model) {
        Iterable<TaxEnum> taxEnums = taxEnumRepo.findAll();
        model.put("taxenum", taxEnums);
        return "taxenum";
    }

}
