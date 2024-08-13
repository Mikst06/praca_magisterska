package ug.master.mstempin.pattern.adapter;

import ug.master.mstempin.pattern.adapter.model.BaseObject300KB;
import ug.master.mstempin.pattern.adapter.model.BaseObject500KB;
import ug.master.mstempin.pattern.adapter.model.BaseObject800KB;
import ug.master.mstempin.pattern.creational.factory.simple.model.BaseObjectC;

public class AdapterService {

    private static AdapterService instance;

    public static AdapterService getInstance() {
        if ( instance == null ) {
            instance = new AdapterService();
        }
        return instance;
    }

    public void _300KB_WithAdapter(){
        BaseObject300KB baseObject300KB = new BaseObject300KB();
        AdapterObject300KB adapterObject300KB = new AdapterObject300KB(baseObject300KB);
        adapterObject300KB.action();
    }

    public void _300KB_WithoutAdapter(){
        BaseObject300KB baseObject300KB = new BaseObject300KB();
        ClientObject clientObject = new ClientObject(
                baseObject300KB.getBaseByte()
        );
        clientObject.action();
    }

    public void _500KB_WithAdapter(){
        BaseObject500KB baseObject500KB = new BaseObject500KB();
        AdapterObject500KB adapterObject500KB = new AdapterObject500KB(baseObject500KB);
        adapterObject500KB.action();
    }

    public void _500KB_WithoutAdapter(){
        BaseObject500KB baseObject500KB = new BaseObject500KB();
        ClientObject clientObject = new ClientObject(
                baseObject500KB.getBaseByte()
        );
        clientObject.action();
    }

    public void _800KB_WithAdapter(){
        BaseObject800KB baseObject800KB = new BaseObject800KB();
        AdapterObject800KB adapterObject800KB = new AdapterObject800KB(baseObject800KB);
        adapterObject800KB.action();
    }

    public void _800KB_WithoutAdapter(){
        BaseObject800KB baseObject800KB = new BaseObject800KB();
        ClientObject clientObject = new ClientObject(
                baseObject800KB.getBaseByte()
        );
        clientObject.action();
    }
}
