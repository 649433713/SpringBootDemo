package springboot.girl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.girl.domain.Girl;
import springboot.girl.properties.GirlProperties;

/**
 * Created by yinywf on 2017/10/10
 */
@RestController
public class HelloController {


    @Autowired
    private GirlProperties girlProperties;


//    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    @GetMapping("/hello")
    public Girl say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        Girl girl = new Girl();
        girl.setId(1);
        girl.setAge(16);
        girl.setCupSize("F");
        return girl;
    }
}
