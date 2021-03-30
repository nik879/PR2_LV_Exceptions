package exceptions.transporter;

public class Transporter {
    public void beam(String person,String from,String to, boolean urgent) throws TransporterMalfunctionException {
        if (urgent == true && Math.random()<0.5) {
            throw new TransporterMalfunctionException("The transport was not successful");
        }
        System.out.println("beam " + person + "from " + from + "to " + to);
    }
    public void shutdown() {
        System.out.println("shutdown is initiated...");
    }
}
