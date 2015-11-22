// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package at.co.federmann.gtd.domain;

import at.co.federmann.gtd.domain.Goal;
import at.co.federmann.gtd.domain.GtdAction;
import org.joda.time.LocalDate;

privileged aspect GtdAction_Roo_JavaBean {
    
    public String GtdAction.getId() {
        return this.id;
    }
    
    public void GtdAction.setId(String id) {
        this.id = id;
    }
    
    public String GtdAction.getName() {
        return this.name;
    }
    
    public void GtdAction.setName(String name) {
        this.name = name;
    }
    
    public void GtdAction.setPriority(Integer priority) {
        this.priority = priority;
    }
    
    public void GtdAction.setStatus(Integer status) {
        this.status = status;
    }
    
    public String GtdAction.getDescription() {
        return this.description;
    }
    
    public void GtdAction.setDescription(String description) {
        this.description = description;
    }
    
    public Goal GtdAction.getGoal() {
        return this.goal;
    }
    
    public void GtdAction.setGoal(Goal goal) {
        this.goal = goal;
    }
    
    public Integer GtdAction.getEffortEstimation() {
        return this.effortEstimation;
    }
    
    public void GtdAction.setEffortEstimation(Integer effortEstimation) {
        this.effortEstimation = effortEstimation;
    }
    
    public LocalDate GtdAction.getEntryDate() {
        return this.entryDate;
    }
    
    public void GtdAction.setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }
    
    public LocalDate GtdAction.getDueDate() {
        return this.dueDate;
    }
    
    public void GtdAction.setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    
    public LocalDate GtdAction.getStartDate() {
        return this.startDate;
    }
    
    public void GtdAction.setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    
    public LocalDate GtdAction.getDoneDate() {
        return this.doneDate;
    }
    
    public void GtdAction.setDoneDate(LocalDate doneDate) {
        this.doneDate = doneDate;
    }
    
}
