package chatroom;

import com.google.auth.oauth2.GoogleCredentials;
import com.mrjaffesclass.apcs.messenger.*;
import com.google.firebase.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * The model represents the data that the app uses.
 * @author Roger Jaffe
 * @version 1.0
 */
public class Model {

  // Messaging system for the MVC
  private final Messenger mvcMessaging;

  // Model's data variables
  private int variable1;
  private int variable2;
  private Chat[] chatLog;
  private String username;
  private boolean loggedIn;
  /**
   * Model constructor: Create the data representation of the program
   * @param messages Messaging class instantiated by the Controller for 
   *   local messages between Model, View, and controller
   */
  public Model(Messenger messages) throws FileNotFoundException, IOException {
    mvcMessaging = messages;
    
FileInputStream serviceAccount =
  new FileInputStream("path/to/serviceAccountKey.json");

FirebaseOptions options = new FirebaseOptions.Builder()
  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
  .setDatabaseUrl("https://chatroom-c7710-default-rtdb.firebaseio.com")
  .build();

FirebaseApp.initializeApp(options);


  }
  
  /**
   * Getter function for variable 1
   * @return Value of variable1
   */
  public int getVariable1() {
    return variable1;
  }

  /**
   * Setter function for variable 1
   * @param v New value of variable1
   */
  public void setVariable1(int v) {
    variable1 = v;
    // When we set a new value to variable 1 we need to also send a
    // message to let other modules know that the variable value
    // was changed
    mvcMessaging.notify("model:variable1Changed", variable1, true);
  }
  
  /**
   * Getter function for variable 1
   * @return Value of variable2
   */
  public int getVariable2() {
    return variable2;
  }
  
  /**
   * Setter function for variable 2
   * @param v New value of variable 2
   */
  public void setVariable2(int v) {
    variable2 = v;
    // When we set a new value to variable 2 we need to also send a
    // message to let other modules know that the variable value
    // was changed
    mvcMessaging.notify("model:variable2Changed", variable2, true);
  }
  
  public void initFirebase() throws FileNotFoundException, IOException{
      
FileInputStream serviceAccount =
      new FileInputStream("./chatroom.json");
    
    FirebaseOptions options = new FirebaseOptions.Builder()
      .setCredentials(GoogleCredentials.fromStream(serviceAccount))
      .setDatabaseUrl("https://chatroom-c7710-default-rtdb.firebaseio.com")
      .build();
     try {
       if (FirebaseApp.getInstance(FirebaseApp.DEFAULT_APP_NAME) != null) {
         return;
        }
     } catch (IllegalStateException e) {
     
     }

    FirebaseApp.initializeApp(options);
    
  }

}
