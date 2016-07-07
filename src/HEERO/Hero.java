package HEERO;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Created by Aakif on 7/4/2016.
 */
public class Hero extends ImageView {

    private static final String HERO_IMAGE_LOC =
            "http://icons.iconarchive.com/icons/raindropmemory/legendora/64/Hero-icon.png";
    private static final Image heroImage = new Image(HERO_IMAGE_LOC);

    public Hero(){
        super(heroImage);

    }

}
