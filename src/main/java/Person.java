import com.opencsv.bean.CsvBindByName;

public class Person {

    @CsvBindByName
    private String name;

    @CsvBindByName
    private String title;

    @CsvBindByName
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
