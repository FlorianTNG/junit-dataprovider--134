import java.util.Map;

import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class MyTest2 extends BaseJunit {
  @Test
  @UseDataProvider(value = "dataProvider", location = BaseJunit.class)
  public void getProduct(Map<String, Object> input, Map<String, Object> expected) {

  }

  @Test
  @UseDataProvider(value = "dataProvider", location = BaseJunit.class)
  public void getDuplicationProductDetail(Map<String, Object> input, Map<String, Object> expected) {

  }
}
