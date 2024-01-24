package ug.master.mstempin.pattern.adapter;

import org.apache.commons.lang3.RandomStringUtils;
import ug.master.mstempin.pattern.adapter.model.advanced.Advanced;
import ug.master.mstempin.pattern.adapter.model.basic.Basic;

public class AdapterService {

    private static AdapterService instance;
    private final String bigString = RandomStringUtils.random(1000);
    private final String hugeString = RandomStringUtils.random(10000);

    public static AdapterService getInstance() {
        if ( instance == null ) {
            instance = new AdapterService();
        }
        return instance;
    }

    public void basicToClientObjectWithAdapter(){
        Basic basic = new Basic("test", 123, true);
        BasicAdaper basicAdaper = new BasicAdaper(basic);
        basicAdaper.action();
    }

    public void advancedToClientObjectWithAdapter(){
        Basic basic1 = new Basic("test", 123, true);
        Basic basic2 = new Basic("test", 123, true);
        Basic basic3 = new Basic("test", 123, true);
        Advanced advanced = new Advanced(basic1, basic2, basic3);
        AdvancedAdapter advancedAdapter = new AdvancedAdapter(advanced);
        advancedAdapter.action();
    }

    public void basicToClientObjectWithoutAdapter(){
        Basic basic = new Basic("test", 123, true);
        ClientObject clientObject = new ClientObject(
                basic.getF_string(),
                basic.getF_integer(),
                basic.getF_boolean());
        clientObject.action();
    }

    public void advancedToClientObjectWithoutAdapter(){
        Basic basic1 = new Basic("test", 123, true);
        Basic basic2 = new Basic("test", 123, true);
        Basic basic3 = new Basic("test", 123, true);
        Advanced advanced = new Advanced(basic1, basic2, basic3);
        ClientObject clientObject = new ClientObject(
                advanced.getA().getF_string() + advanced.getB().getF_string() + advanced.getC().getF_string(),
                advanced.getA().getF_integer() + advanced.getB().getF_integer() + advanced.getC().getF_integer(),
                advanced.getA().getF_boolean() && advanced.getB().getF_boolean() && advanced.getC().getF_boolean());
        clientObject.action();
    }

    public void advancedToClientObjectWithAdapter_BIG_DATA(){
        Basic basic1 = new Basic(bigString, 123, true);
        Basic basic2 = new Basic(bigString, 123, true);
        Basic basic3 = new Basic(bigString, 123, true);
        Advanced advanced = new Advanced(basic1, basic2, basic3);
        AdvancedAdapter advancedAdapter = new AdvancedAdapter(advanced);
        advancedAdapter.action();
    }

    public void advancedToClientObjectWithoutAdapter_BIG_DATA(){
        Basic basic1 = new Basic(bigString, 123, true);
        Basic basic2 = new Basic(bigString, 123, true);
        Basic basic3 = new Basic(bigString, 123, true);
        Advanced advanced = new Advanced(basic1, basic2, basic3);
        ClientObject clientObject = new ClientObject(
                advanced.getA().getF_string() + advanced.getB().getF_string() + advanced.getC().getF_string(),
                advanced.getA().getF_integer() + advanced.getB().getF_integer() + advanced.getC().getF_integer(),
                advanced.getA().getF_boolean() && advanced.getB().getF_boolean() && advanced.getC().getF_boolean());
        clientObject.action();
    }

    public void advancedToClientObjectWithAdapter_HUGE_DATA(){
        Basic basic1 = new Basic(hugeString, 123, true);
        Basic basic2 = new Basic(hugeString, 123, true);
        Basic basic3 = new Basic(hugeString, 123, true);
        Advanced advanced = new Advanced(basic1, basic2, basic3);
        AdvancedAdapter advancedAdapter = new AdvancedAdapter(advanced);
        advancedAdapter.action();
    }

    public void advancedToClientObjectWithoutAdapter_HUGE_DATA(){
        Basic basic1 = new Basic(hugeString, 123, true);
        Basic basic2 = new Basic(hugeString, 123, true);
        Basic basic3 = new Basic(hugeString, 123, true);
        Advanced advanced = new Advanced(basic1, basic2, basic3);
        ClientObject clientObject = new ClientObject(
                advanced.getA().getF_string() + advanced.getB().getF_string() + advanced.getC().getF_string(),
                advanced.getA().getF_integer() + advanced.getB().getF_integer() + advanced.getC().getF_integer(),
                advanced.getA().getF_boolean() && advanced.getB().getF_boolean() && advanced.getC().getF_boolean());
        clientObject.action();
    }
}
