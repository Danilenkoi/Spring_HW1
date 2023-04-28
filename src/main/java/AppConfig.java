import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean
    public Car getCarBean() {
        return new Car();
    }
    @Bean("carDriver")
    public Driver getCarDriverBean() {
        return new Driver(getCarBean());
    }

    @Bean
    public Bus getBusBean() {
        return new Bus();
    }
    @Bean("busDriver")
    public Driver getBusDriverBean() {
        return new Driver(getBusBean());
    }

    @Bean
    public Pickup getPickupBean() {
        return new Pickup();
    }

    @Bean("pickupDriver")
    public Driver getPickupDriverBean() {
        return new Driver(getPickupBean());
    }
}
