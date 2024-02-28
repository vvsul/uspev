
package uspev.models;

public class ModelStudent {
    Integer id, gruppaid;
    String name;

    public ModelStudent(Integer id, Integer gruppaid, String name) {
        this.id = id;
        this.gruppaid = gruppaid;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getGruppaid() {
        return gruppaid;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setGruppaid(Integer gruppaid) {
        this.gruppaid = gruppaid;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
