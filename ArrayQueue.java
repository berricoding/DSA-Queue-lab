//Array based ordinary Queue

class ArrayQueue {
public static final int CAPACITY = 1000; // default array capacity
private int[] data; // integer array used for storage
private int f = 0; // front pointer
private int r = -1; // rear pointer
private int sz = 0; // No. of elements in the Queue
private int N; // Queue max. size

public ArrayQueue() {
this(CAPACITY);
} // constructs the queue with default capacity
public ArrayQueue(int capacity) { // constructs stack with given capacity
data = new int[capacity];
N = capacity;
}
public int size() {
return sz;
}
public boolean isEmpty( ) {
return (f > r);
}
public void enqueue(int e) {
    if(r==N-1){
        System.out.println("Sorry,this is overflow");
   
    }else{
          data[++r]= e;
          sz++;
    }
   
    
}
public int peek() {
    if(isEmpty()){
        System.out.println("Sorr,this is underflow");
        return -999;
    }else
    return data[f];
}
public int dequeue() {
   if(isEmpty()){
        System.out.println("Sorry,this is underflow");
        return -1;
   }
   int out = data[f];
   if(f==r){
    f=0;
    r=-1;
   }else{
    f++;
     
   }
   return out;
  
}
public void display(){
    if(isEmpty()){
        System.out.println("Sorry,this is underflow");
    }else {
    System.out.println("AQ list: ");
     for(int i=f; i <=r; i++ ){
     System.out.print(data[i]+"->");
     System.out.print("");
     
     }
System.out.println("");
     
     
    }

}
}