package config;

import bean.ReportOperation;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import properties.ReportProperties;

@Configuration
@ConditionalOnClass(ReportOperation.class)
@EnableConfigurationProperties(ReportProperties.class)
public class ReportAutoConfiguration {
    @Bean
    public ReportOperation reportOperation(ReportProperties reportProperties) {
        ReportOperation reportOperation = new ReportOperation(reportProperties.getMsg());
        return reportOperation;
    }
}
