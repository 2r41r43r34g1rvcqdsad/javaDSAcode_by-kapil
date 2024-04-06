import javax.sound.sampled.SourceDataLine;
import javax.swing.text.ParagraphView;

public class output {
    public static void main(String[] args) {
        int [] n = {7,2,5,10,8};
        int end=n.length-1;
        int start =0;
        for(int i =0 ; i<n.length;i++){
            start = Math.max(start,n[i]);// It is like the simple binary search
            end+=n[i];
        
    }
    System.out.println(start);
    System.out.println(end);
    
}
}
