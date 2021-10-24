import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, CsvValidationException {

        FileReader file = new FileReader("src/main/resources/example.csv");

//        try (CSVReader csvReader = new CSVReader(file)) {
//            String[] values = null;
//            while ((values = csvReader.readNext()) != null) {
//                System.out.println(Arrays.asList(values));
//            }
//        }

        List<Person> beans = new CsvToBeanBuilder<Person>(file)
                .withType(Person.class)
                .build()
                .parse();

        for (Person p : beans) {
            System.out.println(p.getTitle() + " " + p.getName() + ", " + p.getAge() + "years");
        }

    }

}
