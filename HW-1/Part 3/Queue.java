public class Queue <T>{
    private Object [] elements;
    private int size;           // 2 variables, one for the array of the objects and a int variable for size

    /**
     * Default constructor
     */
    public Queue(){
        elements = null;
        size = 0;           // sets size and elements to null and 0 respectively as a default constructor
    }

    /**
     * size method
     * returns the size
     * @return size
     */
    public int size() {
        return size;
    }// returns the int variable of size

    /**
     * dequeue method
     * removes the top element and returns it
     * @return front
     */
    public T dequeue() {
        if (size == 0){
            return null;    // an if statement for if the queue is empty we can't remove anything so we return null
        }
        Object [] temp = new Object[size - 1];     // set object to a size 1 smaller than it was
        T front = (T) elements[0];      // find the front element and store it to return it later
        size--; // decrement size

        for (int i = 0; i < size; i++){
            temp [i] = elements[i + 1];     // using a for loop and a temp variable copy the elements while leaving out the first one
        }

        elements = temp;        // set our temp variable to elements

        return front;       // return the front
    }

    /**
     * isEmpty method
     * @return boolean(true/false)
     */
    public boolean isEmpty() {
        if (size == 0){
                return true;         // an if statement for if the stack is empty 
        }
        return false;
    } // returns true or false if empty

    /**
     * Front method
     * gets the top element and returns it
     * @return front
     */
    public T front() {
        if (size == 0){
            return null;    // an if statement for if the queue is empty we can't get anything so we return null
        }
        T front = (T) elements[0];  // get's the front element

        return front; // returns front
    }

    /**
     * Rear method
     * gets the top element and returns it
     * @return front
     */
    public T rear() {
        if (size == 0){
            return null;    // an if statement for if the queue is empty we can't get anything so we return null
        }
        T rear = (T) elements[size - 1];  // get's the rear element

        return rear; // returns rear
    }


    /**
     * enqueue method
     * adds a element to the end of the queue.
     * @param element
     */
    public void enqueue(T element) {
        size++;     // increments size
        Object [] temp = new Object[size]; // set the length of elements to the newly updated size

        for (int i = 0; i < size; i++){
            if (i == size - 1){         // for loop that copies the elements to the temp variable and on it's last iteration copies
                temp[i] = element;      // the paramater 'element' into the last index of the queue then breaks
                break;
            }

            temp [i] = elements[i];

        }
        elements = temp; // sets temp to elements
    }
}
