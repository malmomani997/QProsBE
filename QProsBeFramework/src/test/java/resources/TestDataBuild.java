package resources;


import Pojos.CreateUsersPojo;

public class TestDataBuild {

    public CreateUsersPojo createdUser(int id, String username, String firstName, String lastName, String email, String phone){

      return new CreateUsersPojo(id , username , firstName , lastName , email , "12345678" , phone , 0);
    }

    public CreateUsersPojo updateUser(String username, String firstName, String phone){

        return new CreateUsersPojo(username , firstName , phone );
    }
}
