package slavik.sendbox.test.interface_implement_exception;

import java.io.IOException;
import java.io.InterruptedIOException;

/**
 * Created by vymi1016 on 02/02/2017.
 */
public interface Test1 {
   void  test() throws IOException, InterruptedIOException;
}
