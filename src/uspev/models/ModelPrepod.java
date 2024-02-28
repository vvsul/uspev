
package uspev.models;

public class ModelPrepod {
    Integer id;
    String nameString;

    public ModelPrepod(Integer id, String nameString) {
        this.id = id;
        this.nameString = nameString;
    }

    public Integer getId() {
        return id;
    }

    public String getNameString() {
        return nameString;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }
    
    
    }
