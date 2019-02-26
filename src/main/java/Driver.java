public class Driver {

    private final Route route;

    public Driver(String input) {
        this.route = new Route(input);
    }

    public Integer nextStop(){
        return this.route.nextStop();
    }
}
