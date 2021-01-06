# LinkedList 구현

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

# 3을 가진 Node 를 만드려면 아래와 같이 하면 됩니다!
node = Node(3) # 현재는 next 가 없이 하나의 노드만 있습니다. [3]

class LinkedList:
    def __init__(self, value):
        self.head = Node(value)  # head 에 시작하는 Node 를 연결합니다.

    def append(self, value):     # LinkedList 가장 끝에 있는 노드에 새로운 노드를 연결합니다.
        cur = self.head         
        while cur.next is not None: # cur의 다음이 끝에 갈 때까지 이동합니다. 
            cur = cur.next          
        cur.next = Node(value)

    def print_all(self):
        cur = self.head
        while cur is not None:
            print(cur.data)
            cur = cur.next

    def get_node(self, index):
        node = self.head
        count = 0
        while count < index:
            node = node.next
            count += 1
        return node

    def add_node(self, index, value):
        new_node = Node(value)
        if index == 0:
            new_node.next = self.head
            self.head = new_node
            return

        node = self.get_node(index - 1)
        next_node = node.next
        node.next = new_node
        new_node.next = next_node


linked_list = LinkedList(5)
linked_list.append(12)
# 이렇게 되면 5 -> 12 형태로 노드를 연결한 겁니다!
linked_list.append(8)
# 이렇게 되면 5 -> 12 -> 8 형태로 노드를 연결한 겁니다!
linked_list.get_node(0) 
# -> 5를 들고 있는 노드를 반환해야 합니다!
linked_list.add_node(0, 3)
linked_list.print_all()