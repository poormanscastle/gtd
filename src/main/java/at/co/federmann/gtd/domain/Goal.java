package at.co.federmann.gtd.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * a goal is something you want to achieve. Like moving to New York, open up a new fitness center, seeing a movie.
 * Actions are the steps that get you there.
 * <p>
 * goals can be organized in goal hierarchies. E.g. a goal may be to become fluent in Chinese. Sub-goals are doing
 * the exams for HSK 1, HSK 2, HSK 3, HSK 4, HSK 5, HSK 6, and Business Chinese. These 7 goals may have sub-goals,
 * like learn HSK 1 vocables, learn HSK 1 grammar, read starter stories, learn Chinese songs. The leaves in this
 * hierarchy will most probably be the actions which are necessary to achieve a goal or sub-goal.
 * <p>
 * every activity should support one of the goals (in life).
 */
@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooSerializable
public class Goal {

    /**
     * using UUID as the primary key and entity id shall make the use case feasible to create
     * actions offline on client apps like on ios or android and later sync data with servers.
     */
    @Id
    @GeneratedValue(generator = "hibernate-uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id", unique = true)
    private String id;

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

    /**
     * goals can be organized in hierarchies. this field points to the parent goal.
     */
    private Goal parentGoal;

    /**
     * goals can be organized in hierarchies. this field lists the child goals of this goal.
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parentGoal")
    private List<Goal> childGoals = new ArrayList<Goal>();
}
