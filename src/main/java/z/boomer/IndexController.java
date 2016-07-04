/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.boomer;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author DovahYol
 */
@Controller
public class IndexController {
	
    @RequestMapping(value={"/","/home"},method=RequestMethod.GET)
    public String init(Map<String,Object> model){
            return "home";
    }	
	
}
