package klu.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import klu.repository.ClientRepository;


@Service
public class ClientManager {

@Autowired
ClientRepository CR;
	public String insertdep(Department d) 
	{
		try
		{

			CR.save(d);
			return "success";
		}
		catch (Exception e)
		{
			return e.getMessage();
		}
	}
	public String deletedep(String depid) {
		try
		{
		int rowsAffected = CR.deleteById(depid);
		 if (rowsAffected > 0) {
	            return "redirectdelete"; 
	        }
		 else
		 {
	            return "No Department found with that ID."; 

		 }
		}
		catch (Exception e) 
		{
			return e.getMessage();
		}
	}

	}

	
	
	

