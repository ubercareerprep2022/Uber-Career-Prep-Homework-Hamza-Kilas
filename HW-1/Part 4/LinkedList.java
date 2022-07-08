public class LinkedList <T> {
        private class LinkedListLink<T>{
            private LinkedListLink<T> next;
            private T element;
    
            LinkedListLink(T element)
            {
                this.element = element;
                next = null;
            }
        }
    
        int size;
        LinkedListLink<T> head;
    
        public LinkedList()
        {
            size = 0;
            head = null;
        }
    
        public LinkedListLink<T> elementAt(int index)
        {
            LinkedListLink<T> cur = head;
            for (int i=0; i<index; i++)
            {
                cur = cur.next;
            }
    
            return cur;
        }
    
        public int size() {
            return size;
        }
    
        public void insert(int index, T element)
        {
            if (index < 0 || index > size)
            {
                return;
            }
    
            LinkedListLink<T> tmp = new LinkedListLink<T>(element);
    
            if (index == 0)
            {
                tmp.next = head;
                head = tmp;
                size++;
                return;
            }
    
            LinkedListLink<T> cur = elementAt(index-1);
    
            tmp.next = cur.next;
            cur.next = tmp;
            size++;
        }
    
        public void push(T element)
        {
            insert(size,element);
        }
    
    
        public void remove(int index)
        {
            if (index < 0 || index > size-1)
            {
                return;
            }
    
            if (index == 0)
            {
                head = head.next;
                size--;
                return;
            }
    
            LinkedListLink<T> cur = elementAt(index-1);
    
            cur.next = cur.next.next;
            size--;
        }

        public LinkedListLink<T> pop(){  
            if (head == null)
                return null;
        
            if (head.next == null) {
                size = 0;
                head = null;                
                return head;
            }

            LinkedListLink<T> beforeLast = head;
            while (beforeLast.next.next != null){
                beforeLast = beforeLast.next;
            }
            
            beforeLast.next = null;
            size--;
            return head;
        }

        public LinkedListLink<T> reverse() {
            LinkedListLink<T> cur = null; 
            LinkedListLink<T> beg = head;
            LinkedListLink<T> before = null;

            while (beg != null) { 
                cur = beg; 
                beg = beg.next; 
                cur.next = before; 
                before = cur; 
                head = cur;
            }
            return head;
               
        }
    
        
        public String printList()
        {
            LinkedListLink<T> cur = head;
            String returnString = "[";
    
            for (int i=0; i<size; i++)
            {
                returnString += cur.element.toString();
                if (i < size - 1)
                {
                    returnString += ", ";
                }
    
                cur = cur.next;
            }
    
            returnString += "]";
    
            return returnString;
        }

}