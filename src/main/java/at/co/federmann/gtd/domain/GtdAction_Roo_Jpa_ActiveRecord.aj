// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package at.co.federmann.gtd.domain;

import at.co.federmann.gtd.domain.GtdAction;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect GtdAction_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager GtdAction.entityManager;
    
    public static final List<String> GtdAction.fieldNames4OrderClauseFilter = java.util.Arrays.asList("name");
    
    public static final EntityManager GtdAction.entityManager() {
        EntityManager em = new GtdAction().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long GtdAction.countGtdActions() {
        return entityManager().createQuery("SELECT COUNT(o) FROM GtdAction o", Long.class).getSingleResult();
    }
    
    public static List<GtdAction> GtdAction.findAllGtdActions() {
        return entityManager().createQuery("SELECT o FROM GtdAction o", GtdAction.class).getResultList();
    }
    
    public static List<GtdAction> GtdAction.findAllGtdActions(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM GtdAction o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, GtdAction.class).getResultList();
    }
    
    public static GtdAction GtdAction.findGtdAction(Long id) {
        if (id == null) return null;
        return entityManager().find(GtdAction.class, id);
    }
    
    public static List<GtdAction> GtdAction.findGtdActionEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM GtdAction o", GtdAction.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    public static List<GtdAction> GtdAction.findGtdActionEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM GtdAction o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, GtdAction.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void GtdAction.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void GtdAction.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            GtdAction attached = GtdAction.findGtdAction(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void GtdAction.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void GtdAction.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public GtdAction GtdAction.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        GtdAction merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}