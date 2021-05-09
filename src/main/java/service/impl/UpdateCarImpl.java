package service.impl;

import dao.IUpdateCar;
import dao.impl.IUpdateCarImpl;
import domain.Car;
import service.Add;
import service.UpdateCar;

public class UpdateCarImpl implements UpdateCar, Add {
   IUpdateCar iUpdateCar= new IUpdateCarImpl();

    @Override
    public void updateCar(int cid,String number,String brand ,int price) {
        iUpdateCar.updateCar(cid, number, brand, price);
    }

    @Override
    public String a() {
        return null;
    }
   // Add.a()
}
