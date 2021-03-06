package modelo;
// Generated 18/11/2013 07:17:07 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Citas generated by hbm2java
 */
public class Citas  implements java.io.Serializable {


     private long id;
     private Categorias categorias;
     private Vehiculos vehiculos;
     private String name;
     private int createdBy;
     private Date createdAt;
     private Integer updatedBy;
     private Date updatedAt;
     private boolean deleted;
     private Date fechaCita;
     private int serviciosId;
     private Set<Inventarios> inventarioses = new HashSet<Inventarios>(0);
     private Set<CitasServicios> citasServicioses = new HashSet<CitasServicios>(0);

    public Citas() {
    }

	
    public Citas(long id, Categorias categorias, Vehiculos vehiculos, String name, int createdBy, Date createdAt, boolean deleted, Date fechaCita, int serviciosId) {
        this.id = id;
        this.categorias = categorias;
        this.vehiculos = vehiculos;
        this.name = name;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.deleted = deleted;
        this.fechaCita = fechaCita;
        this.serviciosId = serviciosId;
    }
    public Citas(long id, Categorias categorias, Vehiculos vehiculos, String name, int createdBy, Date createdAt, Integer updatedBy, Date updatedAt, boolean deleted, Date fechaCita, int serviciosId, Set<Inventarios> inventarioses, Set<CitasServicios> citasServicioses) {
       this.id = id;
       this.categorias = categorias;
       this.vehiculos = vehiculos;
       this.name = name;
       this.createdBy = createdBy;
       this.createdAt = createdAt;
       this.updatedBy = updatedBy;
       this.updatedAt = updatedAt;
       this.deleted = deleted;
       this.fechaCita = fechaCita;
       this.serviciosId = serviciosId;
       this.inventarioses = inventarioses;
       this.citasServicioses = citasServicioses;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public Categorias getCategorias() {
        return this.categorias;
    }
    
    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }
    public Vehiculos getVehiculos() {
        return this.vehiculos;
    }
    
    public void setVehiculos(Vehiculos vehiculos) {
        this.vehiculos = vehiculos;
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
    public Date getFechaCita() {
        return this.fechaCita;
    }
    
    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }
    public int getServiciosId() {
        return this.serviciosId;
    }
    
    public void setServiciosId(int serviciosId) {
        this.serviciosId = serviciosId;
    }
    public Set<Inventarios> getInventarioses() {
        return this.inventarioses;
    }
    
    public void setInventarioses(Set<Inventarios> inventarioses) {
        this.inventarioses = inventarioses;
    }
    public Set<CitasServicios> getCitasServicioses() {
        return this.citasServicioses;
    }
    
    public void setCitasServicioses(Set<CitasServicios> citasServicioses) {
        this.citasServicioses = citasServicioses;
    }




}


