package io.swagger.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import io.swagger.model.Menu;
import io.swagger.model.MenuPopup;
import io.swagger.model.OneOfinlineResponse200;
import io.swagger.model.Sbz002bReq;
import io.swagger.model.Sbz002bRes0000;
import io.swagger.model.Sbz002bRes0001;
import io.swagger.service.Sbz002Service;

@Service
public class Sbz002ServiceImpl implements Sbz002Service {

	@Override
	public OneOfinlineResponse200 execute(Sbz002bReq in) {
		String reqItem1 = in.getReqItem1();
		if (reqItem1.startsWith("0")) {
			Sbz002bRes0000 res = new Sbz002bRes0000();

			res.setMenu(createSampleMenu());
			res.setStatusCode("0000");

			return res;

		} else {

			Sbz002bRes0001 res = new Sbz002bRes0001();
			res.setStatusCode("0001");

			return res;
		}
	}

	private Menu createSampleMenu() {
      Menu menu = new Menu();
      menu.setId("m0001");
      menu.setValue("File");

      List<MenuPopup> popupList = new ArrayList<MenuPopup>();
      menu.setPopup(popupList);

      MenuPopup popup1 = new MenuPopup();
      popup1.setValue("New");
      popup1.setOnclick("CreateNewDoc()");
      popupList.add(popup1);


      MenuPopup popup2 = new MenuPopup();
      popup2.setValue("Open");
      popup2.setOnclick("OpenDoc()");
      popupList.add(popup2);

      MenuPopup popup3 = new MenuPopup();
      popup3.setValue("Close");
      popup3.setOnclick("CloseDoc()");
      popupList.add(popup3);

      return menu;
	}

}
