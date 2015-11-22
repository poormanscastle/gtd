package at.co.federmann.gtd.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;

/**
 *
 * a goal is something you want to achieve. Like moving to New York, open up a new fitness center, seeing a movie.
 * Actions are the steps that get you there.
 *
 * every activity should support one of the goals (in life).
 */
@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooSerializable
public class Goal {

    /**
     * a short descriptive name for this goal, like learn Business English or open up a French Cusisine restaurant
     */
    @NotNull
    private String name;

    /**
     * a detailed description of this goal to clarify things. is intended to be marked up with markdown.
     */
    @NotNull
    private String description;
}
