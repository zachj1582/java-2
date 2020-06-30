package burger_shop;


final public class Bread {
   private String bread;
   public static final Bread RYE = new Bread("Rye"); 
   public static final Bread SESAMESEED = new Bread("Sesame seed"); 
   public static final Bread SPLITTOP = new Bread("Split top"); 

   public Bread(String bread){
       this.bread=bread;
   }

   public String getBread(){
       return this.bread;
   }


}
