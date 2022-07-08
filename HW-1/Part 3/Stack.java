
public class Stack <T>{
        private Object [] elements;
        private int size;       // 2 variables, one for the array of the objects and a int variable for size
        
        
        /**
         * Default constructor
         */
        public Stack(){
                elements = null;        // sets size and elements to null and 0 respectively as a default constructor
                size = 0;
        }
        
        /**
         * size method
         * returns the size
         * @return size
         */
        public int size() {
                return size;
        } // returns the int variable of size

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
         * pop method
         * removes the top element and returns it
         * @return front
         */
        public T pop() {
                if (size == 0){
                return null;         // an if statement for if the stack is empty we can't remove anything so we return null
                }
        
                size--;// decrement size
        
                Object [] temp = new Object[size];          // set the temp object to the size
        
        
                T top = (T) elements[0];        // find the front element and store it to return it later
        
                for (int i = 0; i < size; i++){
                temp [i] = elements[i + 1]; // using a for loop and a temp variable copy the elements while leaving out the first one
                }
        
                elements = temp;
        
        return top;
        }
        
        
        /**
         * top method
         * gets the top element and returns it
         * @return front
         */
        public T top() {
                if (size == 0){     // an if statement for if the stack is empty we can't get anything so we return null
                return null;
                }
                T top = (T) elements[0];        // get's the front element
        
                return top;         // returns front
        }
        
        /**
         * push method
         * adds a element to the top of the stack.
         * @param element
         */
        public void push(T element) {
                size++;      // increments size
                Object [] temp = new Object[size];      // set the length of elements to the newly updated size
        
                if(size == 1){      // if the stack was empty we only need to add this one element which is the paramater
                elements = new Object[size];
                elements[0] = element;
                }
        
                temp [0] = element; // put the param element as the first value in the stack
                for (int i = 1; i < size; i++) {    // for loop that copies the elements to the temp variable that already contains the first element
                temp[i] = elements[i - 1];
                }
                elements = temp; // set temp to elements
        }}
                

