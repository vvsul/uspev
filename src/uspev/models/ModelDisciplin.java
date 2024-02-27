
package uspev.models;


public class ModelDisciplin {
    Integer id, ciclid;
    String name;

    public ModelDisciplin(Integer id, Integer ciclid, String name) {
        this.id = id;
        this.ciclid = ciclid;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCiclid() {
        return ciclid;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCiclid(Integer ciclid) {
        this.ciclid = ciclid;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    
    
   
}
