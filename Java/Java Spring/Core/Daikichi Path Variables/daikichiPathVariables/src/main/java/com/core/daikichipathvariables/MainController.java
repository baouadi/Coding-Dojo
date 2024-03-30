package com.core.daikichipathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
    @RequestMapping("/daikichi/{courseId}/{moduleId}")
    public String index(@PathVariable("courseId") String courseId,
                        @PathVariable("moduleId") String moduleId) {
        if (courseId.equals("travel")) {
            return "Congratulations! You will soon travel to " + moduleId;
        } else if (courseId.equals("lotto")) {
        	Integer number = Integer.valueOf(moduleId);
            if (number % 2 == 0) {
                return "You will take a grand journey in the near future, but be weary of tempting offers";
            } else {
                return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
            }
        }
        return "404 Parametre not found";
    }
}
