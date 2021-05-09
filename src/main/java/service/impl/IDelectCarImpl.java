package service.impl;

import dao.IAddCar;
import dao.impl.IAddCarImpl;
import service.IDelectCar;

public class IDelectCarImpl implements IDelectCar {
    IAddCar iAddCar=new IAddCarImpl();
    @Override
    public void delectCar(int cid) {
        iAddCar.delectCar(cid);
    }
}
