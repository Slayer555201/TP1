package entity;
// Generated 20.11.2019 9:29:10 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Gruppyi generated by hbm2java
 */
@Entity
@Table(name="gruppyi"
    ,catalog="gr"
    , uniqueConstraints = @UniqueConstraint(columnNames="Nazvanie") 
)
public class Gruppyi  implements java.io.Serializable {


     private Integer shifr;
     private String nazvanie;
     private Date dataFormir;
     private int kodPlana;
     private String status;
     private Date statusDate;
 private List<Studentyi> studentyis;

    public Gruppyi() {
    }

	
    public Gruppyi(String nazvanie, Date dataFormir, int kodPlana) {
        this.nazvanie = nazvanie;
        this.dataFormir = dataFormir;
        this.kodPlana = kodPlana;
    }
    public Gruppyi(String nazvanie, Date dataFormir, int kodPlana, String status, Date statusDate, List<Studentyi> studentyis) {
       this.nazvanie = nazvanie;
       this.dataFormir = dataFormir;
       this.kodPlana = kodPlana;
       this.status = status;
       this.statusDate = statusDate;
       this.studentyis = studentyis;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Shifr", unique=true, nullable=false)
    public Integer getShifr() {
        return this.shifr;
    }
    
    public void setShifr(Integer shifr) {
        this.shifr = shifr;
    }

    
    @Column(name="Nazvanie", unique=true, nullable=false, length=50)
    public String getNazvanie() {
        return this.nazvanie;
    }
    
    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DataFormir", nullable=false, length=10)
    public Date getDataFormir() {
        return this.dataFormir;
    }
    
    public void setDataFormir(Date dataFormir) {
        this.dataFormir = dataFormir;
    }

    
    @Column(name="KodPlana", nullable=false)
    public int getKodPlana() {
        return this.kodPlana;
    }
    
    public void setKodPlana(int kodPlana) {
        this.kodPlana = kodPlana;
    }

    
    @Column(name="Status", length=50)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="StatusDate", length=10)
    public Date getStatusDate() {
        return this.statusDate;
    }
    
    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="gruppyi")
    public List<Studentyi> getStudentyis() {
        return this.studentyis;
    }
    
    public void setStudentyis(List<Studentyi> studentyis) {
        this.studentyis = studentyis;
    }




}


