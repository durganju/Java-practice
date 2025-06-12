package java_tasks;

class Task008{
    void accept(){
        System.out.println("accept customer called");
    }
    void display(){
        System.out.println("display customer called");
    }
    public class Test008{
        public static void main(String[] args){
            Task008 cobj = new  Task008();
            cobj.accept();
            cobj.display();
        }
    }
}
