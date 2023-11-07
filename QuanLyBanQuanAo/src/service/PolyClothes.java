/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;

/**
 *
 * @author ADMIN
 */
abstract public class PolyClothes<ModelType, KeyType> {

    abstract protected List<ModelType> selectBySQL(String sql, Object[] args);

    abstract public List<ModelType> selectAll();

    abstract public void insert(ModelType model);

    abstract public void update(ModelType model);

    abstract public void delete(KeyType id);

    abstract public ModelType selectByID(KeyType id);

}
