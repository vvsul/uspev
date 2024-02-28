
package uspev.models;

public class ModelGruppa {
    Integer id, otdelenieid, spewbalnostid,kurs;
    String nameString;

    public ModelGruppa(Integer id, Integer otdelenieid, Integer spewbalnostid, Integer kurs, String nameString) {
        this.id = id;
        this.otdelenieid = otdelenieid;
        this.spewbalnostid = spewbalnostid;
        this.kurs = kurs;
        this.nameString = nameString;
    }

    public Integer getId() {
        return id;
    }

    public Integer getOtdelenieid() {
        return otdelenieid;
    }

    public Integer getSpewbalnostid() {
        return spewbalnostid;
    }

    public Integer getKurs() {
        return kurs;
    }

    public String getNameString() {
        return nameString;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOtdelenieid(Integer otdelenieid) {
        this.otdelenieid = otdelenieid;
    }

    public void setSpewbalnostid(Integer spewbalnostid) {
        this.spewbalnostid = spewbalnostid;
    }

    public void setKurs(Integer kurs) {
        this.kurs = kurs;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }
    
}
