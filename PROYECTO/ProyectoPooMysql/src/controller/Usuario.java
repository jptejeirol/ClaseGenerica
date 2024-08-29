package controller;
import controller.services.ServicesUsuario;


/**
 *
 * @author juan_
 */
public class Usuario {

    private String username, password, email, name, userId;
    ServicesUsuario serUsu = new ServicesUsuario();
    
    public Usuario (String username, String password, String email, String name){
        //this.userId = UUID.randomUUID().toString();
        this.username= username;
        this.password= password;
        this.email= email;
        this.name= name;
        this.userId= serUsu.setId();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
        public String toString() {
            return username+", "+password+", "+email+", "+name;
                    }
}
