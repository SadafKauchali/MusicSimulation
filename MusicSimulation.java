// Interface
interface Playable {
    void play();
}

// Abstract class
abstract class Instrument implements Playable {
    public void tune() {
        System.out.println("Instrument is being tuned.");
    }

    // Abstract method
    abstract void repair();
}

// Final class
final class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Guitar is playing music.");
    }

    @Override
    public void repair() {
        System.out.println("Repairing the Guitar.");
    }
}

// Main class
public class MusicSimulation {
    public static void main(String[] args) {
        Guitar myGuitar = new Guitar();
        myGuitar.tune();
        myGuitar.play();
        myGuitar.repair();
    }
}
