package exceptions.transporter;

public class DemoEpisode42 {
    public static void main(String[] args) {
        Starship Enterprise = new Starship("Enterprise", new Transporter());
        Enterprise.beamUp("Captain Kirk","Riga IV");
    }

}
