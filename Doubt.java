import java.util.Scanner;

public class LibraryDemo{
    public static void main(String[] args){
        
            Scanner sc=new Scanner(System.in);
            Library lb[]=new Library[4];
            Library cmp=new Library(4,"tvistro","rnpholx");
            
            for(int i=0;i<lb.length;i++){
               
               int id=sc.nextInt();sc.nextLine();
               String title=sc.nextLine();
               String address=sc.nextLine();
               lb[i]=new Library(id,title,address);
            
               
               
            }
        
        Library lbn=new Library[4];
        lbn=replaceLibraryById(lb,cmp);
    
    
        
        for(int i=0;i<lb.length;i++){
            System.out.println(lb.getId+" "+lb.getTitle+" "+lb.getAddress);
        }
            
    }
    
}



public static Library[] replaceLibraryById(Library[] lbs,Library cmp){
    
    for(int i=0;i<lbs.length;i++){
        if(lbs[i].getId==cmp.getId){
            
            lbs.setid(cmp.getId);
            lbs.setTitle(cmp.getTitle);
            lbs.setAddress(cmp.getAddress);
            return Lbs;
        }
    }
}



class Library{
    
    int id;
    String title;
    String address;
    
    public void  setId(int id){
        this.id=id;
    }
    
    public void  setTitle(String title){
        this.title=title;
    }
    
    public void  setAddress(String address){
        this.address=address;
    }
    
    
    public  int  getid(){
        return this.id;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    
   public  Library(int id,String title,String address){
        
        this.id=id;
        this.title=title;
        this.address=address;
        
    }
}
