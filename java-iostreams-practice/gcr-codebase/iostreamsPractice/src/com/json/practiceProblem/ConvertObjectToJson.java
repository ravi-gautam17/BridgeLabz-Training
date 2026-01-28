package com.json.practiceProblem;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertObjectToJson {
    public static void main(String[] args) throws Exception {
        Car car = new Car("Toyota", "Camry", 2023);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(car);

        System.out.println(json);
    }
}
