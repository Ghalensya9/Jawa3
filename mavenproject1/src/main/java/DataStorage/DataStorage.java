/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStorage;

/**
 *
 * @author A-1
 */
public interface DataStorage {

    public void writeData(String data_stored_in_memory);

    public String readData();
    
}
