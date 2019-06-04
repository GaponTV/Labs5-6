package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



@RestController
public class DemoApplicationController {

    @RequestMapping("/laba_five")
    public List<String> PolindromCheck(@RequestBody String[] MyStringArray)
    {
        List<String> ResultString = new ArrayList<String>(Arrays.asList(MyStringArray));
        return ResultString.stream().map(u->PalindromeCheck.check(u).toString()).collect(Collectors.toList());
    }

    @RequestMapping("/laba_six_one")
    public String maxString(@RequestBody List<String> list) {
        return list.stream()
                .max(Comparator.comparing(String::length))
                .get();
    }

    @RequestMapping("/laba_six_two")
    public  double product(@RequestBody ArrayList<Integer> list) {

        Optional<Integer> sum =list.stream()
                .reduce((acc,x)->acc*x);
        double product = (double)sum.get();
        return product;
    }

    @RequestMapping("/laba_six_three")
    public List<Integer> stringToInt(@RequestBody List<String> list) {
        return list.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());
    }

}







