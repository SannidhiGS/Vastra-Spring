package com.xworkz.vastra.service.impl;

import com.xworkz.vastra.dao.VastraDAO;
import com.xworkz.vastra.dao.impl.VastraDAOImpl;
import com.xworkz.vastra.dto.VastraDTO;
import com.xworkz.vastra.service.VastraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
@Component
public class VastraServiceImpl implements VastraService {
    public VastraServiceImpl(){
        System.out.println("The VastraServiceImpl Constructor is created");
    }
    @Autowired
    VastraDAO vastraDAO;


    @Override
    public boolean validAndSave(VastraDTO vastraDTO) throws SQLException, ClassNotFoundException {
        System.out.println("Checking the validation");
        boolean inValid=false;
        if(vastraDTO.getName().length()<0){
            inValid=true;
        }
        if(vastraDTO.getCategory().length()<0){
            inValid=true;
        }
        if(vastraDTO.getBrand().length()<0){
            inValid=true;
        }
        if (vastraDTO.getPrice()==0){
            inValid=true;
        }
        if(vastraDTO.getSize().length()<0){
            inValid=true;
        }
        boolean save=vastraDAO.save(vastraDTO);
        return save;
    }

    @Override
    public VastraDTO getName(String name) throws Exception {
        if(name==null  || name.length()==0){
            throw new Exception("Your name is not valid");
        }
        return vastraDAO.getName(name) ;
    }

    @Override
    public VastraDTO getId(int id) throws Exception {
        if(id==0){
            throw new Exception("Your id is not valid");
        }
        return vastraDAO.getId(id);
    }

    @Override
    public boolean updateVastra(VastraDTO vastraDTO) throws SQLException, ClassNotFoundException {
        System.out.println("Checking the validation");
        boolean inValid=false;
        if(vastraDTO.getName().length()<0){
            inValid=true;
        }
        if(vastraDTO.getCategory().length()<0){
            inValid=true;
        }
        if(vastraDTO.getBrand().length()<0){
            inValid=true;
        }
        if (vastraDTO.getPrice()==0){
            inValid=true;
        }
        if(vastraDTO.getSize().length()<0){
            inValid=true;
        }
        if(inValid){
            System.out.println("Your data is not valid");
        }
        return vastraDAO.updateVastra(vastraDTO);
    }

    @Override
    public boolean deleteVastra(int id) throws SQLException, ClassNotFoundException {
        return vastraDAO.deleteById(id);
    }
}
