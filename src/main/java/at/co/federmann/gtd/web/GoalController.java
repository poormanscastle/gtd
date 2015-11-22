package at.co.federmann.gtd.web;
import at.co.federmann.gtd.domain.Goal;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/goals")
@Controller
@RooWebScaffold(path = "goals", formBackingObject = Goal.class)
public class GoalController {
}
