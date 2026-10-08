package srp;

import srp.exceptions.AucunSiegeDisponibleException;

import java.util.ArrayList;
import java.util.List;

public class Vol {
    private final List<Siege> sieges = new ArrayList<>();

    public Siege assignerSiege(PassagerType passagerType) {
        for(Siege siege: sieges) {
            if (siege.hasBeenAssigned(passagerType)) {
                return siege;
            }
        }
        throw new AucunSiegeDisponibleException();
    }
}
