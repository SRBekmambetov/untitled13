import java.util.List;

public class Country {

    private List<People> peopleList;
    private String nameCountry;

    public Country(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public List<People> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(List<People> peopleList) {
        this.peopleList = peopleList;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "peopleList=" + peopleList +
                ", nameCountry='" + nameCountry + '\'' +
                '}';
    }
}
