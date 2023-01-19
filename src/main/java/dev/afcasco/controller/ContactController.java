package dev.afcasco.controller;

import dev.afcasco.entity.Contact;
import dev.afcasco.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/list")
    public String listContacts(Model model){
        model.addAttribute(contactService.getContacts());
        return "list-contacts";


    }

    @RequestMapping("/index")
    public String save() {
        Contact test = new Contact();
        test.setFirstName("Alex");
        contactService.save(test);
        return "/index.jsp";
    }


}
