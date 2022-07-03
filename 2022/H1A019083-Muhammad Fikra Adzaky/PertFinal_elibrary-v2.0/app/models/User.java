package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
import play.data.validation.*;
 
@Entity
public class User extends Model {
 	
   @Required
   @MaxSize(15)
   @MinSize(4)
   @Match(value="^\\w*$", message="Not a valid username")
   public String username;

   @Required
   @MaxSize(15)
   @MinSize(5)
   public String password;
   
   @Required
   @MaxSize(100)
   public String name;

   public User(String username, String password, String name) {
      this.username = username;
      this.password = password;
      this.name = name;
   }

   public String toString()  {
       return "User(" + username + ")";
   }
	
}