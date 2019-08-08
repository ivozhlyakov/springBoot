package ru.ivozklyakov.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ivozklyakov.springBoot.dao.dto.TaxEnumDto;
import ru.ivozklyakov.springBoot.dao.entity.TaxEnum;
import ru.ivozklyakov.springBoot.dao.repository.TaxEnumLngRepo;
import ru.ivozklyakov.springBoot.dao.repository.TaxEnumRepo;

import java.util.Collections;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private TaxEnumRepo taxEnumRepo;
    @Autowired
    private TaxEnumLngRepo taxEnumLngRepo;

    @GetMapping("/main")
    public String getObjectType(@RequestParam(required = false) String operType, Map<String, Object> model) {
        getOperType(model);
        Iterable<TaxEnumDto> taxEnums = Collections.emptyList();
        if (operType != null && !operType.isEmpty()) {
            taxEnums = taxEnumLngRepo.findBySysName(operType, "ru");
        }
        model.put("taxenum", taxEnums);
        return "main";
    }

  /*  @PostMapping("/main")
    public String filterTaxEnum(@RequestParam String enumSysName, Map<String, Object> map) {
        if (enumSysName != null && !enumSysName.isEmpty()) {
            Iterable<TaxEnum> taxEnums = taxEnumRepo.findByEnumSysName(enumSysName);
            map.put("taxenum", taxEnums);
            getOperType(map);
            return "main";
        }
        return getAllEnum(map);
    }

    @PostMapping("filter")
    public String getEnumBySysName(@RequestParam(required = false) String operType, Map<String, Object> map) {
        if (operType != null || !operType.isEmpty()) {
            Iterable<TaxEnumDto> taxEnums = taxEnumLngRepo.findBySysName(operType, "ru");
            map.put("taxenum", taxEnums);
        }
        getOperType(map);
        return "main";
    }
*/
    private void getOperType(Map<String, Object> map) {
        Iterable<Map<String, String>> operType = taxEnumRepo.findOperType();
        map.put("objecttype", operType);

    }
}