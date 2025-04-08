package frogger;

import java.util.ArrayList;
import java.util.List;

public class Records {
    private final List<FroggerID> records = new ArrayList<>();

    public boolean addRecord(FroggerID id) {
        if (records.contains(id)) {
            return false;
        }
        records.add(id);
        return true;
    }
}
