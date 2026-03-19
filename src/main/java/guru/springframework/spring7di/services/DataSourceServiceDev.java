package guru.springframework.spring7di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class DataSourceServiceDev implements DataSourceService {
    @Override
    public String getDataSourceStr() {
        return "This is dev zone";
    }
}
