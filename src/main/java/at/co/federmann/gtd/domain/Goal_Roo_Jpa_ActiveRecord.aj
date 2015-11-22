// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package at.co.federmann.gtd.domain;

import at.co.federmann.gtd.domain.Goal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Goal_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Goal.entityManager;
    
    public static final List<String> Goal.fieldNames4OrderClauseFilter = java.util.Arrays.asList("name", "description");
    
    public static final EntityManager Goal.entityManager() {
        EntityManager em = new Goal().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Goal.countGoals() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Goal o", Long.class).getSingleResult();
    }
    
    public static List<Goal> Goal.findAllGoals() {
        return entityManager().createQuery("SELECT o FROM Goal o", Goal.class).getResultList();
    }
    
    public static List<Goal> Goal.findAllGoals(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Goal o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Goal.class).getResultList();
    }
    
    public static Goal Goal.findGoal(Long id) {
        if (id == null) return null;
        return entityManager().find(Goal.class, id);
    }
    
    public static List<Goal> Goal.findGoalEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Goal o", Goal.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    public static List<Goal> Goal.findGoalEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Goal o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Goal.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Goal.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Goal.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Goal attached = Goal.findGoal(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Goal.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Goal.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Goal Goal.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Goal merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
