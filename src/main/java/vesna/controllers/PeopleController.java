package vesna.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vesna.dao.UserDAOImpl;

@Controller
@RequestMapping("/people")
public class UsersController {
    @Autowired
    private UserDAOImpl userDAO;
    @GetMapping
    public String index(Model model) {
        model.addAttribute("users",userDAO.index());
        return "people/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("user",userDAO.show(id));
return "people/show";
    }

}
