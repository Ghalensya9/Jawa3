/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStorage;

import java.util.ArrayList;

/**
 *
 * @author A-13
 */
// Implementasi MemoryStorage menggunakan ArrayList
public class MemoryStorage implements DataStorage {

    private final ArrayList<String> data;

    public MemoryStorage() {
        this.data = new ArrayList<>();
    }

    public void writeData(String data) {
        this.data.add(data);
    }

    public String readData() {
        StringBuilder sb = new StringBuilder();
        this.data.forEach(item -> {
            sb.append(item);
        });
        return sb.toString();
    }
}