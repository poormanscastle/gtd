package at.co.federmann.gtd.web;
import at.co.federmann.gtd.domain.GtdAction;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/gtdactions")
@Controller
@RooWebScaffold(path = "gtdactions", formBackingObject = GtdAction.class)
public class GtdActionController {
}
