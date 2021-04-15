package com.test.demo.entities;

import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public  class RequestHandler {

    private Object VacansiesAnswer;

    public int get_count_vacancies(String sity, String zp)
    {
        int count;
        int code_reg = get_reg(sity);
        int ZP = get_zp(zp);
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "https://api.hh.ru/vacancies?$salary="+ ZP +"$area="+ code_reg + "&text=Programer";
        System.out.println(fooResourceUrl);
        System.out.println(code_reg);
        System.out.println(ZP);
        ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl + "/1", String.class);
        System.out.println(response.getBody());
        count = get_count_of_vacancies(response);
        return count;
    }
    private int get_count_of_vacancies(ResponseEntity<String> a)
    {
        int count;
        Gson gson = new Gson();
        VacansiesAnswer VAnswer = gson.fromJson(a.getBody(), VacansiesAnswer.class);
        count = VAnswer.getFound();
        System.out.println(VAnswer.getItems().get(0).getName());
        return count;
    }
    private int get_zp(String zp)//получить зарплату
    {
        return Integer.parseInt (zp);
    }

    private int get_reg(String sity)//получить локацию
    {
        int code_reg = -1;

        if (sity.equals("MSK"))
        {
            code_reg = 1;
        }
        else if(sity.equals("NSK"))
        {
            code_reg = 4;
        }
        else if(sity.equals("SP"))
        {
            code_reg = 2;
        }
        return code_reg;
    }
}
