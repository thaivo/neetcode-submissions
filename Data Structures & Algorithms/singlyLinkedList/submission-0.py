class LinkedList:
    
    def __init__(self):
        self.lst = []
    
    def get(self, index: int) -> int:
        return self.lst[index] if index < len(self.lst) else -1

    def insertHead(self, val: int) -> None:
        self.lst.insert(0, val)

    def insertTail(self, val: int) -> None:
        self.lst.append(val)

    def remove(self, index: int) -> bool:
        if index >= len(self.lst):
            return False
        self.lst.pop(index)
        return True

    def getValues(self) -> List[int]:
        return self.lst
