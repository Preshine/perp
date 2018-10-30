package com.preshine.calc.api.service;

import com.preshine.calc.api.model.CalculateUnit;

public abstract class AbstractCalculate implements Calculate<CalculateUnit> {

    @Override
    public void prepare(CalculateUnit calculateUnit) {

    }

    public abstract void execute(CalculateUnit calculateUnit);

    public abstract boolean complete(CalculateUnit calculateUnit);
}
