package com.xworkz.vastra.dao.impl;

import com.xworkz.vastra.dao.DBConstant;
import com.xworkz.vastra.dao.VastraDAO;
import com.xworkz.vastra.dto.VastraDTO;
import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public class VastraDAOImpl implements VastraDAO {
    @Override
    public boolean save(VastraDTO vastraDTO) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String sql="Insert INTO vastra(name,category,brand,price,size) values(?,?,?,?,?)";
        try (Connection connection= DriverManager.getConnection(DBConstant.URL.getValue(),DBConstant.USER.getValue(), DBConstant.PASSWORD.getValue())){
            PreparedStatement ps= connection.prepareStatement(sql);
            ps.setString(1, vastraDTO.getName());
            ps.setString(2, vastraDTO.getCategory());
            ps.setString(3, vastraDTO.getBrand());
            ps.setDouble(4, vastraDTO.getPrice());
            ps.setString(5, vastraDTO.getSize());
            int row=ps.executeUpdate();
            System.out.println("The row updated: "+row);
            return row>0;
        }
    }

    @Override
    public VastraDTO getName(String name) throws ClassNotFoundException, SQLException {
        String search="Select * from vastra where name=?";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection connection=DriverManager.getConnection(DBConstant.URL.getValue(),DBConstant.USER.getValue(), DBConstant.PASSWORD.getValue())){
            PreparedStatement ps1=connection.prepareStatement(search);
            ps1.setString(1,name);
            ResultSet rs= ps1.executeQuery();
            while (rs.next()){
                System.out.println("Getting the details of vastra by the help of name");
                int id= rs.getInt(1);
                String namez=rs.getString(2);
                String category=rs.getString(3);
                String brand=rs.getString(4);
                Double price= rs.getDouble(5);
                String size=rs.getString(6);
                System.out.println("Calling the vastra dto");
                VastraDTO dto=new VastraDTO(id,namez,category,brand,price,size);
                System.out.println("The details of the dto "+dto);
                return dto;
            }
        }
        return null;
    }

    @Override
    public VastraDTO getId(int id) throws ClassNotFoundException, SQLException {
        String searchById="Select * from vastra where id=?";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection connection=DriverManager.getConnection(DBConstant.URL.getValue(),DBConstant.USER.getValue(), DBConstant.PASSWORD.getValue())) {
            PreparedStatement preparedStatement=connection.prepareStatement(searchById);
            preparedStatement.setString(1, String.valueOf(id));
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                System.out.println("Getting the Vastra details by the help of id: ");
                int idz=rs.getInt(1);
                String name=rs.getString(2);
                String category=rs.getString(3);
                String brand=rs.getString(4);
                Double price=rs.getDouble(5);
                String size= rs.getString(6);
                System.out.println("Getting the Vastra Dto by the help of ID: ");
                VastraDTO vastraDTO=new VastraDTO(id,name,category,brand,price,size);
                System.out.println("The searched data as found"+vastraDTO);
                return vastraDTO;
            }
        }
        return null;
    }

    @Override
    public boolean updateVastra(VastraDTO vastraDTO) throws ClassNotFoundException, SQLException {
        String update="Update vastra set name=?,category=?,brand=?,price=?,size=? where id=?";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection=DriverManager.getConnection(DBConstant.URL.getValue(),DBConstant.USER.getValue(), DBConstant.PASSWORD.getValue())){
            PreparedStatement ps=connection.prepareStatement(update);
            ps.setString(1, vastraDTO.getName());
            ps.setString(2, vastraDTO.getCategory());
            ps.setString(3, vastraDTO.getBrand());
            ps.setDouble(4, vastraDTO.getPrice());
            ps.setString(5, vastraDTO.getSize());
            ps.setInt(6, vastraDTO.getId());

            int rowAffected= ps.executeUpdate();
            System.out.println("The no of rows updated "+rowAffected);
            return rowAffected>0;

        }
    }

    @Override
    public boolean deleteById(int id) throws ClassNotFoundException, SQLException {
        String sql="Delete from vastra where id=?";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection=DriverManager.getConnection(DBConstant.URL.getValue(),DBConstant.USER.getValue(), DBConstant.PASSWORD.getValue())){
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setInt(1,id);
            int rows = ps.executeUpdate();
            return rows > 0;
        }
    }

}
