package ie.atu.week5;

public class Store {

    private String name;
    private String email;
    private String detail;

    public Store(String name, String email, String detail) {
        this.name = name;
        this.email = email;
        this.detail = detail;
    }


    public Store() {
    }

    public Store(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getDetail() {

        return detail;
    }

    public void setDetail(String detail) {

        this.detail = detail;
    }
}
