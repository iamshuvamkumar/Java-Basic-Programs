//Write a Java program to count total number of notes in given note.


class CountNotes{
  public static void main(String[]RK){

  int note= 3570;

  int note1000=0,note500=0,note100=0,note50=0,note20=0,note10=0;
 

   if(note >= 1000)
    {
        note1000 = note/1000;
        note -= note1000 * 1000;
     System.out.println("1000 = "+ note1000);
     
    }
    if(note >= 500){
        note500 = note/500;
        note -= note500 * 500;
    System.out.println("500 = "+ note500);
    }
     if(note >= 100){
        note100 = note/100;
        note -= note100 * 100;
   System.out.println("100 = "+ note100);
    }
   if(note >= 50){
        note50 = note/50;
        note -= note50 * 50;
    System.out.println("50 = "+ note50);
    }
   if(note >= 20){
        note20 = note/20;
        note -= note20 * 20;
    System.out.println("20 = "+ note20);
    }
    if(note >= 10){
        note10 = note/10;
        note -= note10 * 10;
    System.out.println("10 = "+ note10);
    }
    
}
}

