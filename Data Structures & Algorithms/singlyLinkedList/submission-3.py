class ListNode:
    def __init__(self, val, nextnode=None):
        self.val = val
        self.next = nextnode

class LinkedList:
    
    def __init__(self):
        self.head = ListNode(-1)
        self.size = 0
    
    def get(self, index: int) -> int:
        if self.size == 0 or index >= self.size:
            return -1
        it = 0
        nodeIter = self.head.next
        while it != index:
            nodeIter = nodeIter.next
            it += 1
        return nodeIter.val

    def insertHead(self, val: int) -> None:
        newNode = ListNode(val,self.head.next)
        self.head.next = newNode
        self.size += 1

    def insertTail(self, val: int) -> None:
        if self.size == 0:
            self.head.next = ListNode(val)
        else:
            nodeIter = self.head.next
            while nodeIter.next is not None:
                nodeIter = nodeIter.next
            newNode = ListNode(val)
            nodeIter.next = newNode
        self.size += 1

    def remove(self, index: int) -> bool:
        if self.size == 0 or index >= self.size:
            return False
        deletedNode = self.head.next
        if index == 0:
            self.head.next = deletedNode.next
            del deletedNode
        else:
            iter = 1
            preDeletedNode = self.head.next
            deletedNode = preDeletedNode.next
            while iter < index:
                preDeletedNode = deletedNode
                deletedNode = preDeletedNode.next
                iter += 1
            preDeletedNode.next = deletedNode.next
            del deletedNode
        self.size -= 1
        return True

    def getValues(self) -> List[int]:
        if self.size == 0:
            return []
        iter = self.head.next
        returnList = []
        while iter is not None:
            returnList.append(iter.val)
            iter = iter.next
        return returnList
