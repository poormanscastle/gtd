/*
 *    Copyright 2015 Georg Federmann
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package at.co.federmann.gtd.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Runway: Current Actions.
 * this is the accumulated list of all the actions you need to take - all the phone calls you have to make, the e-mails
 * you have to respond to, the errands you've got to run, and the agendas you want to communicate to your boss and your spouse.
 * You've probably have three hundred to five hundred hours' worth of these things to do iy you stopped the world right
 * now and got no more input from yourself or anyone else.
 *
 * Each action should support one of your goals (in life).
 */
@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooSerializable
public class GtdAction {

    /**
     * a short textual highlevel label giving a quick idea what this action is about in plain text.
     */
    @NotNull
    private String name;

    /**
     * lets the user define priorities for the given action.
     */
    @NotNull
    @Min(0L)
    @Max(4L)
    private Integer priority;

    // allow enum to be mapped to the priorityId stored in persistence
    public Priority getPriority() {
        return Priority.resolvePriority(priority);
    }

    // allow enum to be mapped to the priorityId stored in persistence
    public void setPriority(Priority priority) {
        this.priority = priority.getId();
    }

    /**
     * lets the user define a color code for the given activity's status
     */
    @NotNull
    @Min(0L)
    @Max(2L)
    private Integer status;

    // allow enum to be mapped to the statusId stored in persistence
    public Status getStatus() {
        return Status.resolveStatus(status);
    }

    public void setStatus(Status status) {
        this.status = status.getId();
    }

    /**
     * freetext to explain in detail what this activity is about. is considered to be markdown formatted.
     */
    @NotNull
    private String description;
}
