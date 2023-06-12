package customException;

public class AgeLessThanZeroException  extends  IllegalArgumentException{

  AgeLessThanZeroException(String message) {
    super(message);
  }

  public AgeLessThanZeroException(Throwable cause){
    super(cause);
  }

}
