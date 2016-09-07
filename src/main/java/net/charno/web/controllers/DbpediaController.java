package net.charno.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by charno on 9/3/16.
 */
@Controller
@RequestMapping("/dbpedia")
public class DbpediaController {

    @RequestMapping("/lookup/{term}")
    @ResponseBody
    public String lookupTerm(@RequestParam String term) {
        return "Your looking up " + term;
    }
}
