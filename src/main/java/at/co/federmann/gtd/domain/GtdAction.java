package at.co.federmann.gtd.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;

/**
 * Runway: Current Actions.
 * this is the accumulated list of all the actions you need to take - all the phone calls you have to make, the e-mails
 * you have to respond to, the errands you've got to run, and the agendas you want to communicate to your boss and your spouse.
 * You've probably have three hundred to five hundred hours' worth of these things to do iy you stopped the world right
 * now and got no more input from yourself or anyone else.
 */
@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooSerializable
public class GtdAction {

    /**
     * a short textual highlevel label giving a quick idea what this action is about
     */
    @NotNull
    private String name;
}
