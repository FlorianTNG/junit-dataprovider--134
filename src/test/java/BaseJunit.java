import java.util.HashMap;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.runner.RunWith;
import org.junit.runners.model.FrameworkMethod;

@RunWith(DataProviderRunner.class)
public class BaseJunit {
  @DataProvider(cache = false)
  public static Object[][] dataProvider(FrameworkMethod method) {
    System.out.println(method.getName());
    return new Object[][] { { new HashMap<String, Object>(), new HashMap<String, Object>() } };
  }
}
