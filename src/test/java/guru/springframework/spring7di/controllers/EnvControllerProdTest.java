package guru.springframework.spring7di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("prod")
@SpringBootTest
class EnvControllerProdTest {

    @Autowired
    EnvController envController;

    @Test
    void getDataSourceStr() {
        System.out.println(envController.getDataSourceStr());
    }
}