import javax.swing.text.rtf.RTFEditorKit;

import javafx.scene.paint.LinearGradient;

public class cau_6 {
    public static void main(String[] args) {
        int mang[] = new int [] {5,15,23,2,0,156,-5,66};
        int element = 156;
        System.out.println(tim_vi_tri(mang, element));
        
    }

    public static int tim_vi_tri (int mang[], int element) {
        for ( int i = 0; i < mang.length; i++ ) {
            if ( mang[i] == element ) {
                mang[0] = i;
                break;
            }
        }
        return mang[0];
    }
}

