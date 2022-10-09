package io.swagger.service.component;

import org.apache.commons.lang3.NotImplementedException;
import org.springframework.stereotype.Component;
import io.swagger.model.Menu;

@Component
public class MenuBiz {
  
  public Menu getMenu() {
    throw new NotImplementedException("'getMenu' not impremented.");
  }

}
