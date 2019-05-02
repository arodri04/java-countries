package home.country;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/population")
public class PopulationController
{
    @RequestMapping(value = "/size/{people}")
    public ResponseEntity<ArrayList<Country>> checkPop(@PathVariable int people)
    {
        ArrayList<Country> tempCoun = CountryApplication.ourCountryList
        .findCountries(c -> c.getPopulation() >= people);
        return new ResponseEntity<ArrayList<Country>>(tempCoun, HttpStatus.OK);
    }

//    @RequestMapping(value = "/min")
//    public ResponseEntity<ArrayList<Country>> checkPop()
//    {
//        ArrayList<Country> tempCoun = CountryApplication.ourCountryList
//                .findCountries(c -> c.getPopulation() >= people);
//        return new ResponseEntity<ArrayList<Country>>(tempCoun, HttpStatus.OK);
//    }
}
