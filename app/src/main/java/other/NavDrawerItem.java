package other;

import android.graphics.Bitmap;

/**
 * Created by Zoli on 30. 5. 2015.
 */

    //Trieda, ktora obsahuje objekty pre bocny vysuvny panel. Objekty z tejto triedy su odovzdane
    // do adaptera, ktory naplni recycleview zobrazeny na bocnom paneli.
public class NavDrawerItem {
    private boolean showNotify;
    private String title;
    private Bitmap image;

    public NavDrawerItem() {

    }

    public NavDrawerItem(boolean showNotify, String title, Bitmap image) {
        this.showNotify = showNotify;
        this.title = title;
        this.image =  image;
    }

    public boolean isShowNotify() {
        return showNotify;
    }

    public void setShowNotify(boolean showNotify) {
        this.showNotify = showNotify;
    }

    public String getTitle() {
        return title;
    }

    public Bitmap getImage()
    {
        return image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(Bitmap image){
        this.image = image;
    }
}
