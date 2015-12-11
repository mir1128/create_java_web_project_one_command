import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DevelopmentProfileConfig {
    @Bean
    public CDPlayer cdPlayer() {
        return new DevelopCDPlayer();
    }
}
