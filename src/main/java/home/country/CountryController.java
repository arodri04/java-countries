package home.country;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/names")
public class CountryController
{
    @RequestMapping(value = "/all")
    public ResponseEntity<?> GetAllCountries()
    {
        CountryApplication.ourCountryList.countryList.sort((c1, c2)-> c1.getName().compareToIgnoreCase(c2.getName()));
        return new ResponseEntity<>(CountryApplication.ourCountryList.countryList, HttpStatus.OK);
    }

    @RequestMapping(value = "/start/{letter}")
    public ResponseEntity<?> CounName(@PathVariable char letter)
    {
        ArrayList<Country> tempCoun = CountryApplication.ourCountryList
                .findCountries(c -> c.getName().toUpperCase().charAt(0) == Character.toUpperCase(letter));
        return new ResponseEntity<>(tempCoun, HttpStatus.OK);
    }
    @RequestMapping(value = "/size/{number}")
    public ResponseEntity<?> CounName(@PathVariable int number)
    {
        ArrayList<Country> tempCoun = CountryApplication.ourCountryList
                .findCountries(c -> c.getName().length() >= number);
        return new ResponseEntity<>(tempCoun, HttpStatus.OK);
    }
}
