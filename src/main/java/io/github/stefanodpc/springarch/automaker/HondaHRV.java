package io.github.stefanodpc.springarch.automaker;

import java.awt.Color;

public class HondaHRV extends Car {
    public HondaHRV(Engine engine){
        super(engine);
        setModel("HRV");
        setColor(Color.WHITE);
        setAutomaker(Automaker.HONDA);
    }
}
