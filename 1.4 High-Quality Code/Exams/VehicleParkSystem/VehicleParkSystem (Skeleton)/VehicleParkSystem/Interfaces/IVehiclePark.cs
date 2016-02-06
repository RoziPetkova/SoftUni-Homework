namespace VehicleParkSystem.Interfaces
{
    using System;

    using VehicleParkSystem.Models;

    interface IVehiclePark
    {
        // TODO: Documentar esse m�todo
        string InsertCar(Car car, int sector, int placeNumber, DateTime time);

        // TODO: Documentar esse m�todo
        string InsertMotorbike(Motorbike motorbike, int sector, int placeNumber, DateTime startTime);

        // TODO: Documentar esse m�todo
        string InsertTruck(Truck truck, int sector, int placeNumber, DateTime time);

        // TODO: Documentar esse m�todo
        string ExitVehicle(string licensePlate, DateTime endTime, decimal amountPaid);

        // TODO: Documentar esse m�todo
        string GetStatus();

        // TODO: Documentar esse m�todo
        string FindVehicleByLincensePlate(string licensePlate);

        // TODO: Documentar esse m�todo
        string FindVehiclesByOwner(string owner);
    }
}