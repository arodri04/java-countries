package home.country;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountryApplication
{
    public static CountryList ourCountryList;
    public static void main(String[] args) {
        ourCountryList = new CountryList();
        SpringApplication.run(CountryApplication.class, args);
    }

}
