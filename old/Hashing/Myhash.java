public class Myhash
{
    int[]arr;
    int cap;
    int size;
    Myhash(int cap)
    {
        this.cap=cap;
        size=0;
        for(int i=0;i<cap;i++)
        {
            arr[i]=-1;
        }
    }
    int hash(int key)
    {
        return key%7;
    }
    boolean search(int key)
    {
        int h=hash(key);
        int i=h;
        while(arr[i] != -1)
        {
            if(arr[i] == key)
                return true;
            i+=1%cap;
            if(i==h)
                return false;
        }
    }
    void insert(int key)
    {
        int h=hash(key);
        int i=h;
        while(arr[i] != -1)
        {
            i+=1%cap;
            if(i==h)
            {   
                System.out.println("Hash Table is full!!!");
                return;
            }
        }
        arr[i]=key;
        System.out.println("Key inserted successfully!!!");
    }
    void delete(int key)
    {
        int h=hash(key);
        int i=h;
        while(arr[i] != -1)
        {
            if(arr[i] == key){
                arr[i]=-1;
                System.out.println("key deleted!!!");
                return;
            }
            i+=1%cap;
            if(i==h)
            {
                System.out.println("Key is not present in table!!!");
                return;
            }
        }
    }
}