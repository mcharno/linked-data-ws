package net.charno.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by charno on 9/3/16.
 */
@Controller
@RequestMapping("/dbpedia")
public class DbpediaController {

    @RequestMapping(value="/lookup/{term}")
    public String lookupTerm(@PathVariable String term, ModelAndView model) {
        model.addObject(term);
        return "dbpedia-term";
    }
}
