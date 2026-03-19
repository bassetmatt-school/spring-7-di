package guru.springframework.spring7di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class DataSourceServiceUAT implements DataSourceService {
    @Override
    public String getDataSourceStr() {
        return "Users, it's time to Accept, or something";
    }
}
