package com.xworkz.vastra.dao;

import com.xworkz.vastra.dto.VastraDTO;

import java.sql.SQLException;

public interface VastraDAO {
    boolean save(VastraDTO vastraDTO) throws ClassNotFoundException, SQLException;
    VastraDTO getName(String name) throws ClassNotFoundException, SQLException;
    VastraDTO getId(int id) throws ClassNotFoundException, SQLException;
    boolean updateVastra(VastraDTO vastraDTO) throws ClassNotFoundException, SQLException;
    boolean deleteById(int id) throws ClassNotFoundException, SQLException;
}
