package com.xworkz.vastra.controller;

import com.xworkz.vastra.dto.VastraDTO;
import com.xworkz.vastra.service.VastraService;
import com.xworkz.vastra.service.impl.VastraServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@Controller
@RequestMapping("/")
public class VastraController {
    public VastraController(){
        System.out.println("The VastraController constructor initiated");
    }
    @Autowired
    VastraService vastraService;
    @PostMapping("/vastra")
    public String addVastra(VastraDTO vastraDTO) throws SQLException, ClassNotFoundException {
        System.out.println("The Vastra DTO is processing");
        System.out.println(vastraDTO);
        boolean saved= vastraService.validAndSave(vastraDTO);
        if (saved){
            return "Response";
        }
        else {
            return "Error";
        }
    }
    @GetMapping("/cloth")
    public String searchByName(@RequestParam("name")String name, Model model) throws Exception {
        System.out.println("The name of the cloth: "+name);
       VastraDTO vastraDTO=vastraService.getName(name);
        System.out.println("Searched Data "+vastraDTO);
        model.addAttribute("searchedData",vastraDTO);
        return "Search";
    }

    @GetMapping("/outfit")
    public String searchById(@RequestParam("id") int id,Model model) throws Exception {
         System.out.println("The id entered by you:"+id);
         VastraDTO dto=vastraService.getId(id);
        System.out.println("Searched data by the help of ID: "+dto);
        model.addAttribute("searchId",dto);
        return "SearchById";
    }
    @GetMapping("/getVastraInfo/{id}")
    public String getVastraInfo(@PathVariable("id") int id, Model model) throws Exception {
        VastraDTO vastraDTO=vastraService.getId(id);
        model.addAttribute("dto",vastraDTO);
        return "Update";
    }

    @PostMapping("/updateVastra")
    public String updateVastra(VastraDTO vastraDTO,Model model) throws SQLException, ClassNotFoundException {
        System.out.println("Updating the vastra dto");
        boolean outfit=vastraService.updateVastra(vastraDTO);
        if(outfit){
            model.addAttribute("successMessage","Your data updated succesfully");
        }
        else{
            model.addAttribute("errorMessage","Your data not updated successfully,Please retry .............");
        }
        return "Update";
    }
    @PostMapping("/deleteVastra")
    public String deleteVastra(@RequestParam("id") int id,Model model) throws SQLException, ClassNotFoundException {
        System.out.println("Deleting by the help of ID:");
        boolean delete= vastraService.deleteVastra(id);
        if(delete){
            model.addAttribute("successMessage","Your data deleted");
        }
        else{
            model.addAttribute("errorMessage","Your data not deleted");
        }
        return "SearchById";
    }

}
