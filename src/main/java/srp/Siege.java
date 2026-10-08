package srp;

public class Siege {
    private boolean disponible;
    private PassagerType type;

    public boolean hasBeenAssigned(PassagerType passagerType) {
        if (!disponible)
            return  false;
        if (type != passagerType)
            return false;

        disponible = false;
        return true;
//        if (disponible && type == passagerType) {
//            disponible = false;
//            return true;
//        } else {
//            return false;
//        }
    }
}

