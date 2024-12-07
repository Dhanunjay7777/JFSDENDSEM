package klu.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import klu.model.ClientManager;
import klu.model.Department;

@RestController
@RequestMapping("/")
public class ClientDemo 
{

	@Autowired
	ClientManager CM;
	
	@PostMapping("/addDep")
    public String register(HttpServletRequest request,HttpServletResponse response)throws IOException {


        Department D = new Department(); // Create a new Consumer object

        String name = request.getParameter("name");
        String location = request.getParameter("location");
        String hname = request.getParameter("hname");

        D.setName(name);
        D.setLocation(location);
        D.setHname(hname);


        String result =  CM.insertdep(D); 
        if ("redirectLogin".equals(result)) {
            response.sendRedirect("insert");  //here instead of this keep another file and then in that login link
            return null; 
        }
        else {
            return result;
        }    }

	
	
	@PostMapping("/delDep")
    public String delete(HttpServletRequest request,HttpServletResponse response)throws IOException {



        String depid = request.getParameter("depid");
        
        


        String result =  CM.deletedep(depid); 
        if ("redirectdelete".equals(result)) {
            response.sendRedirect("delete");  //here instead of this keep another file and then in that login link
            return null; 
        }
        else {
            return result;
        }    }

}
