package ch.heigvd.res.stpatrick;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;



/**
 * 
 * @author Olivier Liechti
 */
public class Application {

  IStreamProcessorsFactory processorsFactory = new StreamProcessorsFactory();
  
  public IStreamProcessorsFactory getStreamProcessorsFactory() {
    return processorsFactory;
  }

  IStreamDecoratorController getStreamDecoratorController() {
    return null;
  }
  
  public void process (StringReader inputReader,  StringWriter outputWriter){
      outputWriter.write(inputReader.toString());
      try{
            outputWriter.close();
      }catch (Exception e){
          
      }
      
  }
}
