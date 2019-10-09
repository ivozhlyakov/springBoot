package ru.ivozklyakov.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ivozklyakov.springBoot.dao.dto.OperationDto;
import ru.ivozklyakov.springBoot.dao.dto.TaxEnumDto;
import ru.ivozklyakov.springBoot.dao.entity.TaxEnum;
import ru.ivozklyakov.springBoot.dao.repository.OperationRepo;
import ru.ivozklyakov.springBoot.dao.repository.TaxEnumLngRepo;
import ru.ivozklyakov.springBoot.dao.repository.TaxEnumRepo;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    Iterable<TaxEnumDto> taxEnums = Collections.emptyList();
    Long operTypeId = -100L;

    @Autowired
    private TaxEnumRepo taxEnumRepo;
    @Autowired
    private TaxEnumLngRepo taxEnumLngRepo;
    @Autowired
    private OperationRepo operationRepo;

    @GetMapping("/main")
    public String getObjectType(@RequestParam(required = false) String operType,
                                Model model,
                                @PageableDefault(sort = {"BASEOPERID"}, direction = Sort.Direction.DESC) Pageable pageable) {
        getOperType(model);
        if (operType != null && !operType.isEmpty()) {
            taxEnums = taxEnumLngRepo.findBySysName(operType, "ru", "OBJECT_TYPE");
            operTypeId = taxEnums.iterator().next().getId();
        }

        Page<Map> operationDtoPage = operationRepo.findCorpAct(operTypeId, pageable);
        model.addAttribute("page", operationDtoPage);
        model.addAttribute("taxenum", taxEnums);
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
    private void getOperType(Model map) {
        Iterable<Map<String, String>> operType = taxEnumRepo.findOperType();
        map.addAttribute("objecttype", operType);

    }
}
