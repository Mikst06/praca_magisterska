package ug.master.mstempin.pattern.mediator;

import ug.master.mstempin.pattern.mediator.with._2.ComponentA;
import ug.master.mstempin.pattern.mediator.with._2.ComponentB;
import ug.master.mstempin.pattern.mediator.with._2.Mediator;
import ug.master.mstempin.pattern.mediator.without._2.ComponentA_without;
import ug.master.mstempin.pattern.mediator.without._2.ComponentB_without;

public class MediatorService {

    private static MediatorService instance;

    public static MediatorService getInstance() {
        if ( instance == null ) {
            instance = new MediatorService();
        }
        return instance;
    }

    public void _2_components_MEDIATOR(){
        ComponentA componentA = new ComponentA();
        ComponentB componentB = new ComponentB();
        Mediator mediator = new Mediator();

        mediator.registerComponent(componentA);
        mediator.registerComponent(componentB);

        componentA.communicateWithB();
        componentB.communicateWithA();
    }

    public void _2_components_WITHOUT(){
        ComponentA_without componentA = new ComponentA_without();
        ComponentB_without componentB = new ComponentB_without();

        componentA.setComponentB(componentB);
        componentB.setComponentA(componentA);

        componentA.communicateWithComponentB();
        componentB.communicateWithComponentA();
    }

    public void _4_components_MEDIATOR(){
        ug.master.mstempin.pattern.mediator.with._4.ComponentA componentA = new ug.master.mstempin.pattern.mediator.with._4.ComponentA();
        ug.master.mstempin.pattern.mediator.with._4.ComponentB componentB = new ug.master.mstempin.pattern.mediator.with._4.ComponentB();
        ug.master.mstempin.pattern.mediator.with._4.ComponentC componentC = new ug.master.mstempin.pattern.mediator.with._4.ComponentC();
        ug.master.mstempin.pattern.mediator.with._4.ComponentD componentD = new ug.master.mstempin.pattern.mediator.with._4.ComponentD();

        ug.master.mstempin.pattern.mediator.with._4.Mediator mediator = new ug.master.mstempin.pattern.mediator.with._4.Mediator();

        mediator.registerComponent(componentA);
        mediator.registerComponent(componentB);
        mediator.registerComponent(componentC);
        mediator.registerComponent(componentD);

        componentA.communicateWithB();
        componentA.communicateWithC();
        componentA.communicateWithD();

        componentB.communicateWithA();
        componentB.communicateWithC();
        componentB.communicateWithD();

        componentC.communicateWithA();
        componentC.communicateWithB();
        componentC.communicateWithD();

        componentD.communicateWithA();
        componentD.communicateWithB();
        componentD.communicateWithC();
    }

    public void _4_components_WITHOUT(){
        ug.master.mstempin.pattern.mediator.without._4.ComponentA_without componentA = new ug.master.mstempin.pattern.mediator.without._4.ComponentA_without();
        ug.master.mstempin.pattern.mediator.without._4.ComponentB_without componentB = new ug.master.mstempin.pattern.mediator.without._4.ComponentB_without();
        ug.master.mstempin.pattern.mediator.without._4.ComponentC_without componentC = new ug.master.mstempin.pattern.mediator.without._4.ComponentC_without();
        ug.master.mstempin.pattern.mediator.without._4.ComponentD_without componentD = new ug.master.mstempin.pattern.mediator.without._4.ComponentD_without();

        componentA.setComponentB(componentB);
        componentA.setComponentC(componentC);
        componentA.setComponentD(componentD);

        componentB.setComponentA(componentA);
        componentB.setComponentC(componentC);
        componentB.setComponentD(componentD);

        componentC.setComponentA(componentA);
        componentC.setComponentB(componentB);
        componentC.setComponentD(componentD);

        componentD.setComponentA(componentA);
        componentD.setComponentC(componentC);
        componentD.setComponentB(componentB);

        componentA.communicateWithComponentB();
        componentA.communicateWithComponentC();
        componentA.communicateWithComponentD();

        componentB.communicateWithComponentA();
        componentB.communicateWithComponentC();
        componentB.communicateWithComponentD();

        componentC.communicateWithComponentA();
        componentC.communicateWithComponentB();
        componentC.communicateWithComponentD();

        componentD.communicateWithComponentA();
        componentD.communicateWithComponentB();
        componentD.communicateWithComponentC();
    }

    public void _6_components_MEDIATOR(){
        ug.master.mstempin.pattern.mediator.with._6.ComponentA componentA = new ug.master.mstempin.pattern.mediator.with._6.ComponentA();
        ug.master.mstempin.pattern.mediator.with._6.ComponentB componentB = new ug.master.mstempin.pattern.mediator.with._6.ComponentB();
        ug.master.mstempin.pattern.mediator.with._6.ComponentC componentC = new ug.master.mstempin.pattern.mediator.with._6.ComponentC();
        ug.master.mstempin.pattern.mediator.with._6.ComponentD componentD = new ug.master.mstempin.pattern.mediator.with._6.ComponentD();
        ug.master.mstempin.pattern.mediator.with._6.ComponentE componentE = new ug.master.mstempin.pattern.mediator.with._6.ComponentE();
        ug.master.mstempin.pattern.mediator.with._6.ComponentF componentF = new ug.master.mstempin.pattern.mediator.with._6.ComponentF();

        ug.master.mstempin.pattern.mediator.with._6.Mediator mediator = new ug.master.mstempin.pattern.mediator.with._6.Mediator();

        mediator.registerComponent(componentA);
        mediator.registerComponent(componentB);
        mediator.registerComponent(componentC);
        mediator.registerComponent(componentD);
        mediator.registerComponent(componentE);
        mediator.registerComponent(componentF);

        componentA.communicateWithB();
        componentA.communicateWithC();
        componentA.communicateWithD();
        componentA.communicateWithE();
        componentA.communicateWithF();

        componentB.communicateWithA();
        componentB.communicateWithC();
        componentB.communicateWithD();
        componentB.communicateWithE();
        componentB.communicateWithF();

        componentC.communicateWithA();
        componentC.communicateWithB();
        componentC.communicateWithD();
        componentC.communicateWithE();
        componentC.communicateWithF();

        componentD.communicateWithA();
        componentD.communicateWithB();
        componentD.communicateWithC();
        componentD.communicateWithE();
        componentD.communicateWithF();

        componentE.communicateWithA();
        componentE.communicateWithB();
        componentE.communicateWithC();
        componentE.communicateWithD();
        componentE.communicateWithF();

        componentF.communicateWithA();
        componentF.communicateWithB();
        componentF.communicateWithC();
        componentF.communicateWithD();
        componentF.communicateWithE();
    }

    public void _6_components_WITHOUT(){
        ug.master.mstempin.pattern.mediator.without._6.ComponentA_without componentA = new ug.master.mstempin.pattern.mediator.without._6.ComponentA_without();
        ug.master.mstempin.pattern.mediator.without._6.ComponentB_without componentB = new ug.master.mstempin.pattern.mediator.without._6.ComponentB_without();
        ug.master.mstempin.pattern.mediator.without._6.ComponentC_without componentC = new ug.master.mstempin.pattern.mediator.without._6.ComponentC_without();
        ug.master.mstempin.pattern.mediator.without._6.ComponentD_without componentD = new ug.master.mstempin.pattern.mediator.without._6.ComponentD_without();
        ug.master.mstempin.pattern.mediator.without._6.ComponentE_without componentE = new ug.master.mstempin.pattern.mediator.without._6.ComponentE_without();
        ug.master.mstempin.pattern.mediator.without._6.ComponentF_without componentF = new ug.master.mstempin.pattern.mediator.without._6.ComponentF_without();

        componentA.setComponentB(componentB);
        componentA.setComponentC(componentC);
        componentA.setComponentD(componentD);
        componentA.setComponentE(componentE);
        componentA.setComponentF(componentF);

        componentB.setComponentA(componentA);
        componentB.setComponentC(componentC);
        componentB.setComponentD(componentD);
        componentB.setComponentE(componentE);
        componentB.setComponentF(componentF);

        componentC.setComponentB(componentB);
        componentC.setComponentA(componentA);
        componentC.setComponentD(componentD);
        componentC.setComponentE(componentE);
        componentC.setComponentF(componentF);

        componentD.setComponentB(componentB);
        componentD.setComponentA(componentA);
        componentD.setComponentC(componentC);
        componentD.setComponentE(componentE);
        componentD.setComponentF(componentF);

        componentE.setComponentB(componentB);
        componentE.setComponentA(componentA);
        componentE.setComponentD(componentD);
        componentE.setComponentC(componentC);
        componentE.setComponentF(componentF);

        componentF.setComponentB(componentB);
        componentF.setComponentA(componentA);
        componentF.setComponentD(componentD);
        componentF.setComponentE(componentE);
        componentF.setComponentC(componentC);

        componentA.communicateWithComponentB();
        componentA.communicateWithComponentC();
        componentA.communicateWithComponentD();
        componentA.communicateWithComponentE();
        componentA.communicateWithComponentF();

        componentB.communicateWithComponentA();
        componentB.communicateWithComponentC();
        componentB.communicateWithComponentD();
        componentB.communicateWithComponentE();
        componentB.communicateWithComponentF();

        componentC.communicateWithComponentA();
        componentC.communicateWithComponentB();
        componentC.communicateWithComponentD();
        componentC.communicateWithComponentE();
        componentC.communicateWithComponentF();

        componentD.communicateWithComponentA();
        componentD.communicateWithComponentB();
        componentD.communicateWithComponentC();
        componentD.communicateWithComponentE();
        componentD.communicateWithComponentF();

        componentE.communicateWithComponentA();
        componentE.communicateWithComponentB();
        componentE.communicateWithComponentC();
        componentE.communicateWithComponentD();
        componentE.communicateWithComponentF();

        componentF.communicateWithComponentA();
        componentF.communicateWithComponentB();
        componentF.communicateWithComponentC();
        componentF.communicateWithComponentD();
        componentF.communicateWithComponentE();
    }
}
