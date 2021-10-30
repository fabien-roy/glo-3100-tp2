package ca.ulaval.glo3100.keypass;

import java.util.Map;

public class KeyPass {
    private Map<Integer, KeyPassEntry> entries;

    public KeyPass(Map<Integer, KeyPassEntry> entries) {
        this.entries = entries;
    }

    // TODO : Add javadoc
    public void add(KeyPassEntry entry) {
        int index = entries.size() + 1;
        entries.put(index, entry);
    }
}
