package com.xworkz.vastra.service;

import com.xworkz.vastra.dto.VastraDTO;

import java.sql.SQLException;

public interface VastraService {
    boolean validAndSave(VastraDTO vastraDTO) throws SQLException, ClassNotFoundException;
    VastraDTO getName(String name) throws Exception;
    VastraDTO getId(int id) throws Exception;
    boolean updateVastra(VastraDTO vastraDTO) throws SQLException, ClassNotFoundException;
    boolean deleteVastra(int id) throws SQLException, ClassNotFoundException;
}
