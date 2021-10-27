/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import entity.Shoe;
import entity.History;
import entity.Custumer;
import java.util.List;

/**
 *
 * @author pupil
 */
public interface Keeping {
    public void saveShoes(List<Shoe> shoes);
    public List<Shoe> loadShoes();
    public void saveCustumers(List<Custumer> custumers);
    public List<Custumer> loadCustumers();
    public void saveHistories(List<History> histories);
    public List<History> loadHistories();
    
}