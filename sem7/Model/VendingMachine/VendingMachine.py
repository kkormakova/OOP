from Model.Products.Product import Product


class VendingMachine():
    def __init__(self):
        listProducts = list()
        self._listProducts = listProducts

    @property
    def listProducts(self):
        return self._listProducts

    @listProducts.setter
    def listProducts(self, new_listProducts):
        self._listProducts = new_listProducts

    def addAtList(self, product: Product):
        self._listProducts.append(product)

    def getProduct(self, name):
        for el in self.listProducts:
            if el.name == name:
                return el
            else:
                return "Не найдено!"
