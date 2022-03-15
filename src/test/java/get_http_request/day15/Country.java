package get_http_request.day15;

public class Country {

    /* “country”: {
        “id”: 3,
        “name”: “USA”,
        “states”: null
    },
    */
    //1)DEĞİŞKENLERİ PRİVATE YAP
    private int id;
    private String name;
    private String states;

    //2)GET VE SETTER YAP

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    //3)PARAMETRELİ VE PARAMETRESİZ CONSTRUCTOR OLUŞTUR


    public void user() {
    }

    //4)TOSTRİNG OLUŞTUR
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", states='" + states + '\'' +
                '}';
    }

    public Country(int id, String name, String states) {
        this.id = id;
        this.name = name;
        this.states = states;

    }
}
