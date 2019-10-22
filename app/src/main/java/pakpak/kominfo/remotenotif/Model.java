package pakpak.kominfo.remotenotif;

import android.graphics.Bitmap;

/**
 * Created by dinaskominfokab.pakpakbharat on 04/05/18.
 */

public class Model {
    String name;
    Bitmap imaBitmap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bitmap getImage() {
        return imaBitmap;
    }

    public void setImage(Bitmap imaBitmap) {
        this.imaBitmap = imaBitmap;
    }
}
