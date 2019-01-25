package com.springboot.web.application.findresults;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FindResultsControllers {
    @RequestMapping("/findResults")
    public String findResults(){
    	System.out.println("In the Random Finder Dashboard Controller");
        return "findResults";
    }
}

