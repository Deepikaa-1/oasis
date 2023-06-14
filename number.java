import java.io.OutputStream;
import java.util.*;
import javax.lang.model.util.ElementScanner14;
import javax.swing.*;

class number{
    public static void main(String[] args){
        number n=new number();
        n.game();
    }
    public void game(){
        Random rand=new Random();
        int a=rand.nextInt(1,101);        
        System.out.println("enter number of trials");
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int count=0;
        int score=b;
        int g=0;
        while(count<b && g!=a){
            String r=JOptionPane.showInputDialog(null,"enter a number","guessing game",3);
            score--;
            g=Integer.parseInt(r);
            JOptionPane.showMessageDialog(null, ""+determine(g,a,count,score));
            count++;
        }
        if(count>b){
            JOptionPane.showMessageDialog(null, "trials are over");            
        }
        String[] response={"yes","no"};
        ImageIcon icon=new ImageIcon("");

        int k=JOptionPane.showOptionDialog(null,
        "do you want to play again?","secrete msg",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        icon,response,0);
        if(k==0)
            game();
        else    
            return;
    }
    public static String determine(int g,int n,int count,int score){
        if(g<=0||g>100)
            return "invallid";
        else if(g<n)
            return "given number is lower";
        else if(g>n)
            return "given number is higher";
        else if(g==n)
            return "correct "+"score is "+score;
        else 
            return "invalid";
    }
}