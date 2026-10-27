class DynamicArray:
    
    def __init__(self, capacity: int):
        self.elements = []
        self.capacity = capacity

    def get(self, i: int) -> int:
        return self.elements[i]

    def set(self, i: int, n: int) -> None:
        self.elements[i] = n

    def pushback(self, n: int) -> None:
        if self.getSize() == self.capacity:
            self.resize()
        self.elements.append(n)

    def popback(self) -> int:
        return self.elements.pop()

    def resize(self) -> None:
        self.capacity = self.capacity * 2

    def getSize(self) -> int:
        return len(self.elements)
    
    def getCapacity(self) -> int:
        return self.capacity