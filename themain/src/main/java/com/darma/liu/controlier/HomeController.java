package com.darma.liu.controlier;

import com.darma.liu.beans.AnnotateBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;

import java.util.Locale;

@Controller
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class HomeController {

    private AnnotateBean aBean;

    @Autowired
    public void setAnnotateBean(AnnotateBean Bean) {
        this.aBean = Bean;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        System.out.println("Annotation Bean hashcode: " + aBean.hashCode());

        model.addAttribute("duolaoo","memcha" + aBean.getStudentId());
        model.addAttribute("duolaoo","zouni");

        return "products";
    }


}
