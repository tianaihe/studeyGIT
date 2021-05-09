package dao;

import domain.Car;

import java.util.List;

public interface ICarDao {
    public List<Car> selectCar(int num);
}
