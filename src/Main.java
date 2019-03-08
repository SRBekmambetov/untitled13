import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Country> countryList = new ArrayList<>();
        Country country1 = new Country("USA");
        List<People> peopleList1 = new ArrayList<>();
        peopleList1.add(new People("Kevin", 27));
        peopleList1.add(new People("Arnold", 28));
        peopleList1.add(new People("Serg", 35));
        country1.setPeopleList(peopleList1);
        Country country2 = new Country("Russia");
        List<People> peopleList2 = new ArrayList<>();
        peopleList2.add(new People("Aleksey", 40));
        peopleList2.add(new People("Fedor", 37));
        peopleList2.add(new People("Ivan", 25));
        country2.setPeopleList(peopleList2);
        Country country3 = new Country("Germany");
        List<People> peopleList3 = new ArrayList<>();
        peopleList3.add(new People("Vander", 38));
        peopleList3.add(new People("Arkin", 18));
        peopleList3.add(new People("Philip", 25));
        country3.setPeopleList(peopleList3);
        countryList.add(country1);
        countryList.add(country2);
        countryList.add(country3);

        List<People> listPeople1 = countryList.stream().forEach(p -> p.getPeopleList().stream().filter(q -> q.getAge() > 28).collect(Collectors.toList()));
    }
}
