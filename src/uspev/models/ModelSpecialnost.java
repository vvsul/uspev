
package uspev.models;

public class ModelSpecialnost {
    Integer id;
    String name;

    public ModelSpecialnost(Integer id, String name) {
        this.id = id;
        this.name = name;
        
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
