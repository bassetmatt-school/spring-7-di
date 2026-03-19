package guru.springframework.spring7di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class DataSourceServiceProd implements DataSourceService {
    @Override
    public String getDataSourceStr() {
        return "Yay, we're in prod!";
    }
}
