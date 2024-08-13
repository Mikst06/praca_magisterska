package ug.master.mstempin.pattern.composite;

import ug.master.mstempin.pattern.composite.withPattern.BasicObject;
import ug.master.mstempin.pattern.composite.withPattern.CompoundObject;
import ug.master.mstempin.pattern.composite.withoutPattern.BasicObject_without;
import ug.master.mstempin.pattern.composite.withoutPattern.CompoundObject_without;

public class CompositeService {

    private static CompositeService instance;

    public static CompositeService getInstance() {
        if ( instance == null ) {
            instance = new CompositeService();
        }
        return instance;
    }

    public void _300KB_WithComposite(){
        CompoundObject mainObject = new CompoundObject();
        CompoundObject subCompound = new CompoundObject();
        BasicObject mainBasic = new BasicObject(new byte[100000]);
        BasicObject subBasic1 = new BasicObject(new byte[100000]);
        BasicObject subBasic2 = new BasicObject(new byte[100000]);
        subCompound.addObject(subBasic1);
        subCompound.addObject(subBasic2);
        mainObject.addObject(mainBasic);
        mainObject.addObject(subCompound);
        mainObject.action();
    }

    public void _300KB_WithoutComposite(){
        CompoundObject_without mainObject = new CompoundObject_without();
        CompoundObject_without subCompound = new CompoundObject_without();
        BasicObject_without mainBasic = new BasicObject_without(new byte[100000]);
        BasicObject_without subBasic1 = new BasicObject_without(new byte[100000]);
        BasicObject_without subBasic2 = new BasicObject_without(new byte[100000]);
        subCompound.addObject(subBasic1);
        subCompound.addObject(subBasic2);
        mainObject.addObject(mainBasic);
        mainObject.addObject(subCompound);
        mainObject.action();
    }

    public void _500KB_WithComposite(){
        CompoundObject mainObject = new CompoundObject();
        CompoundObject subCompound = new CompoundObject();
        BasicObject mainBasic = new BasicObject(new byte[100000]);
        BasicObject subBasic1 = new BasicObject(new byte[200000]);
        BasicObject subBasic2 = new BasicObject(new byte[200000]);
        subCompound.addObject(subBasic1);
        subCompound.addObject(subBasic2);
        mainObject.addObject(mainBasic);
        mainObject.addObject(subCompound);
        mainObject.action();
    }

    public void _500KB_WithoutComposite(){
        CompoundObject_without mainObject = new CompoundObject_without();
        CompoundObject_without subCompound = new CompoundObject_without();
        BasicObject_without mainBasic = new BasicObject_without(new byte[100000]);
        BasicObject_without subBasic1 = new BasicObject_without(new byte[200000]);
        BasicObject_without subBasic2 = new BasicObject_without(new byte[200000]);
        subCompound.addObject(subBasic1);
        subCompound.addObject(subBasic2);
        mainObject.addObject(mainBasic);
        mainObject.addObject(subCompound);
        mainObject.action();
    }

    public void _800KB_WithComposite(){
        CompoundObject mainObject = new CompoundObject();
        CompoundObject subCompound = new CompoundObject();
        BasicObject mainBasic = new BasicObject(new byte[200000]);
        BasicObject subBasic1 = new BasicObject(new byte[300000]);
        BasicObject subBasic2 = new BasicObject(new byte[300000]);
        subCompound.addObject(subBasic1);
        subCompound.addObject(subBasic2);
        mainObject.addObject(mainBasic);
        mainObject.addObject(subCompound);
        mainObject.action();
    }

    public void _800KB_WithoutComposite(){
        CompoundObject_without mainObject = new CompoundObject_without();
        CompoundObject_without subCompound = new CompoundObject_without();
        BasicObject_without mainBasic = new BasicObject_without(new byte[200000]);
        BasicObject_without subBasic1 = new BasicObject_without(new byte[300000]);
        BasicObject_without subBasic2 = new BasicObject_without(new byte[300000]);
        subCompound.addObject(subBasic1);
        subCompound.addObject(subBasic2);
        mainObject.addObject(mainBasic);
        mainObject.addObject(subCompound);
        mainObject.action();
    }

    //-------------------------------------------------------------------------------------------------

    public void WithComposite_Level1(){
        CompoundObject mainObject = new CompoundObject();
        //Level 1
        CompoundObject subCompound = new CompoundObject();
        BasicObject mainBasic = new BasicObject(new byte[800000]);
        mainObject.addObject(mainBasic);
        mainObject.addObject(subCompound);

        mainObject.action();
    }

    public void WithoutComposite_Level1(){
        CompoundObject_without mainObject = new CompoundObject_without();
        //Level 1
        CompoundObject_without subCompound = new CompoundObject_without();
        BasicObject_without mainBasic = new BasicObject_without(new byte[800000]);
        mainObject.addObject(mainBasic);
        mainObject.addObject(subCompound);

        mainObject.action();
    }

    public void WithComposite_Level2(){
        CompoundObject mainObject = new CompoundObject();
        //Level 1
        CompoundObject subCompound = new CompoundObject();
        BasicObject mainBasic = new BasicObject(new byte[400000]);
        mainObject.addObject(mainBasic);
        mainObject.addObject(subCompound);

        //Level 2
        CompoundObject subsubCompound = new CompoundObject();
        BasicObject subBasic = new BasicObject(new byte[400000]);
        subCompound.addObject(subBasic);
        subCompound.addObject(subsubCompound);

        mainObject.action();
    }

    public void WithoutComposite_Level2(){
        CompoundObject_without mainObject = new CompoundObject_without();
        //Level 1
        CompoundObject_without subCompound = new CompoundObject_without();
        BasicObject_without mainBasic = new BasicObject_without(new byte[400000]);
        mainObject.addObject(mainBasic);
        mainObject.addObject(subCompound);

        //Level 2
        CompoundObject_without subsubCompound = new CompoundObject_without();
        BasicObject_without subBasic = new BasicObject_without(new byte[400000]);
        subCompound.addObject(subBasic);
        subCompound.addObject(subsubCompound);

        mainObject.action();
    }

    public void WithComposite_Level3(){
        CompoundObject mainObject = new CompoundObject();
        //Level 1
        CompoundObject subCompound = new CompoundObject();
        BasicObject mainBasic = new BasicObject(new byte[300000]);
        mainObject.addObject(mainBasic);
        mainObject.addObject(subCompound);

        //Level 2
        CompoundObject subsubCompound = new CompoundObject();
        BasicObject subBasic = new BasicObject(new byte[250000]);
        subCompound.addObject(subBasic);
        subCompound.addObject(subsubCompound);

        //Level 3
        CompoundObject subsubsubCompound = new CompoundObject();
        BasicObject subsubBasic = new BasicObject(new byte[250000]);
        subsubCompound.addObject(subsubBasic);
        subsubCompound.addObject(subsubsubCompound);

        mainObject.action();
    }

    public void WithoutComposite_Level3(){
        CompoundObject_without mainObject = new CompoundObject_without();
        //Level 1
        CompoundObject_without subCompound = new CompoundObject_without();
        BasicObject_without mainBasic = new BasicObject_without(new byte[300000]);
        mainObject.addObject(mainBasic);
        mainObject.addObject(subCompound);

        //Level 2
        CompoundObject_without subsubCompound = new CompoundObject_without();
        BasicObject_without subBasic = new BasicObject_without(new byte[250000]);
        subCompound.addObject(subBasic);
        subCompound.addObject(subsubCompound);

        //Level 3
        CompoundObject_without subsubsubCompound = new CompoundObject_without();
        BasicObject_without subsubBasic = new BasicObject_without(new byte[250000]);
        subsubCompound.addObject(subsubBasic);
        subsubCompound.addObject(subsubsubCompound);

        mainObject.action();
    }
}
