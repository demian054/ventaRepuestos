package modelo;
// Generated 18/11/2013 07:17:07 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Categorias generated by hbm2java
 */
public class Categorias  implements java.io.Serializable {


     private long id;
     private String name;
     private int createdBy;
     private Date createdAt;
     private Integer updatedBy;
     private Date updatedAt;
     private boolean deleted;
     private String table;
     private Set<Servicios> servicioses = new HashSet<Servicios>(0);
     private Set<Citas> citases = new HashSet<Citas>(0);

    public Categorias() {
    }

	
    public Categorias(long id, String name, int createdBy, Date createdAt, boolean deleted, String table) {
        this.id = id;
        this.name = name;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.deleted = deleted;
        this.table = table;
    }
    public Categorias(long id, String name, int createdBy, Date createdAt, Integer updatedBy, Date updatedAt, boolean deleted, String table, Set<Servicios> servicioses, Set<Citas> citases) {
       this.id = id;
       this.name = name;
       this.createdBy = createdBy;
       this.createdAt = createdAt;
       this.updatedBy = updatedBy;
       this.updatedAt = updatedAt;
       this.deleted = deleted;
       this.table = table;
       this.servicioses = servicioses;
       this.citases = citases;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public int getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Integer getUpdatedBy() {
        return this.updatedBy;
    }
    
    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }
    public Date getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    public boolean isDeleted() {
        return this.deleted;
    }
    
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
    public String getTable() {
        return this.table;
    }
    
    public void setTable(String table) {
        this.table = table;
    }
    public Set<Servicios> getServicioses() {
        return this.servicioses;
    }
    
    public void setServicioses(Set<Servicios> servicioses) {
        this.servicioses = servicioses;
    }
    public Set<Citas> getCitases() {
        return this.citases;
    }
    
    public void setCitases(Set<Citas> citases) {
        this.citases = citases;
    }




}


