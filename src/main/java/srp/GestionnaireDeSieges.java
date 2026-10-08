package srp;

public class GestionnaireDeSieges {
    private final VolRepository volRepository;
//prednre un vol et l'assigner a un passager
    public GestionnaireDeSieges(VolRepository volRepository) {
        this.volRepository = volRepository;
    }

    public Siege assigner(int volId, PassagerType passagerType) {
        Vol vol = volRepository.findById(volId);
        return vol.assignerSiege(passagerType);
    }
}