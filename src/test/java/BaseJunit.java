import java.util.HashMap;

import com.tngtech.java.junit.dataprovider.DataProvider;
import org.junit.runners.model.FrameworkMethod;

public class BaseJunit {
  @DataProvider(cache = false)
  public static Object[][] dataProvider(FrameworkMethod method) {
    System.out.println(method.getName());
    return new Object[][] { { new HashMap<String, Object>(), new HashMap<String, Object>() } };
  }
}
