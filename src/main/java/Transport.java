import javax.annotation.PostConstruct;

public abstract class Transport {

    @PostConstruct
    private void readyToWork() {
        System.out.println(this.getClass().getSimpleName() + " - готов к работе!");
    }
}
