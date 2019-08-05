package ru.ivozklyakov.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ivozklyakov.springBoot.dao.entity.TaxEnum;
import ru.ivozklyakov.springBoot.dao.repository.TaxEnumRepo;

import java.util.HashMap;
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
        getOperType(model);
        return "taxenum";
    }

    @PostMapping("enum")
    public String filterTaxEnum(@RequestParam String enumSysName, Map<String, Object> map) {
        if (enumSysName != null && !enumSysName.isEmpty()) {
            Iterable<TaxEnum> taxEnums = taxEnumRepo.findByEnumSysName(enumSysName);
            map.put("taxenum", taxEnums);
            getOperType(map);
            return "taxenum";
        }
        return getAllEnum(map);
    }

    @PostMapping("filter")
    public String getEnumBySysName(@RequestParam String operType, Map<String, Object> map) {
        Iterable<TaxEnum> taxEnums = taxEnumRepo.findBySysName(operType);
        map.put("taxenum", taxEnums);
        getOperType(map);
        return "taxenum";
    }

    private void getOperType(Map<String, Object> map) {
        Iterable<Map<String, String>> operType = taxEnumRepo.findOperType();
        map.put("objecttype", operType);

    }
}
