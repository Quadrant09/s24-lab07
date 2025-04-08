package frogger;

public class Frogger {

    private final Road road;
    private int position;
    private final Records records;
    private final FroggerID id;

    public Frogger(Road road, int position, Records records, String firstName, String lastName,
                   String phoneNumber, String zipCode, String state, String gender) {
        this.road = road;
        this.position = position;
        this.records = records;
        this.id = new FroggerID(firstName, lastName, phoneNumber, zipCode, state, gender);
    }

    public boolean move(boolean forward) {
        int nextPosition = this.position + (forward ? 1 : -1);
        if (!road.isValidPosition(nextPosition) || road.isOccupied(nextPosition)) {
            return false;
        }
        this.position = nextPosition;
        return true;
    }

    public boolean recordMyself() {
        return records.addRecord(this.id);
    }
}
