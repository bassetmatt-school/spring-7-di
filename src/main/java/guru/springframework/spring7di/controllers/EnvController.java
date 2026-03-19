package guru.springframework.spring7di.controllers;

import guru.springframework.spring7di.services.DataSourceService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvController {

    private final DataSourceService dataSourceService;


    public EnvController(DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    public String getDataSourceStr(){
        return dataSourceService.getDataSourceStr();
    }
}
