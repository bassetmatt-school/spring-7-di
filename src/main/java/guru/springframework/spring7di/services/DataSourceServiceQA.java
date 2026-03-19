package guru.springframework.spring7di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class DataSourceServiceQA implements DataSourceService {
    @Override
    public String getDataSourceStr() {
        return "This is the QA site";
    }
}
