from Model.VendingMachine.VendingMachine import VendingMachine
from Model.Products.BottleOfWater import BottleOfWater
from Model.Products.HotDrinks import HotDrinks
from UI.UIConsole import UIConsole


class Service:
    def start(self):
        console = UIConsole()
        listHotDrinks = [HotDrinks('Coffee', 200, 0.3, 80),
                         HotDrinks('Tea', 100, 0.4, 70),
                         HotDrinks('Milk', 300, 1.0, 65)]
        listBottleOfWater = [BottleOfWater('Cola', 300, 0.5),
                             BottleOfWater('Sprite', 350, 0.45),
                             BottleOfWater('Fanta', 320, 0.43)]
        vendingMachine1 = VendingMachine()
        vendingMachine2 = VendingMachine()
        console.printMessage(
            '-----Лист горячих напитков добавлен в торговый автомат-----')
        vendingMachine1.listProducts = listHotDrinks
        console.printListProduct(vendingMachine1.listProducts)
        console.printMessage(
            '-----Лист бутилированных напитков добавлен в торговый автомат-----')
        vendingMachine2.listProducts = listBottleOfWater
        console.printListProduct(vendingMachine2.listProducts)
        console.printMessage('-----В горячие напитки добавлено какао-----')
        vendingMachine1.addAtList(HotDrinks('Какао', 250, 0.5, 70))
        console.printListProduct(vendingMachine1.listProducts)
        console.printMessage(
            '-----В бутилированные напитки добавлена минералка-----')
        vendingMachine2.addAtList(BottleOfWater('Минералка', 150, 0.5))
        console.printListProduct(vendingMachine2.listProducts)
        console.printMessage('-----Получение Tea из торгового автомата-----')
        console.printMessage(vendingMachine1.getProduct('Tea'))
        console.printMessage(
            '-----Получение Sprite из торгового автомата-----')
        console.printMessage(vendingMachine2.getProduct('Sprite'))
