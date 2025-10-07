package com.example.CronogramaRMD.cronograma;

import com.example.CronogramaRMD.model.CronogramasRepository;
import com.example.CronogramaRMD.model.DadosCadastroCronograma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remedios")

public class CronogramasRMD {

    @Autowired
    private CronogramasRepository cronogramasRepository;

    @PostMapping
    public void cronogramasRMD(@RequestBody DadosCadastroCronograma cronogramaRMD) {
        cronogramasRepository}


}
