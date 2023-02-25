from car import Car
from account import Account 

if __name__ == "__main__":
    print("hola mundo")
    
    car = Car("AMS134", Account("Led red", "anda758"))
    print(vars(car))