
package uspev.models;


public class ModelOcenki {
    Integer id,disciplinidInteger,prepodid,studentid,ocenka;
    String date;

    public ModelOcenki(Integer id, Integer disciplinidInteger, Integer prepodid, Integer studentid, Integer ocenka, String date) {
        this.id = id;
        this.disciplinidInteger = disciplinidInteger;
        this.prepodid = prepodid;
        this.studentid = studentid;
        this.ocenka = ocenka;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public Integer getDisciplinidInteger() {
        return disciplinidInteger;
    }

    public Integer getPrepodid() {
        return prepodid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public Integer getOcenka() {
        return ocenka;
    }

    public String getDate() {
        return date;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDisciplinidInteger(Integer disciplinidInteger) {
        this.disciplinidInteger = disciplinidInteger;
    }

    public void setPrepodid(Integer prepodid) {
        this.prepodid = prepodid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public void setOcenka(Integer ocenka) {
        this.ocenka = ocenka;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
