package com.example.CronogramaRMD.cronograma;

import com.example.CronogramaRMD.model.DadosCadastroCronograma;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remedios")

public class CronogramaRMD {

    @PostMapping
    public void cronogramaRMD(@RequestBody DadosCadastroCronograma cronogramaRMD) {System.out.println(cronogramaRMD);}


}
