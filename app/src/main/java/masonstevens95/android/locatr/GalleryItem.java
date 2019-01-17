package masonstevens95.android.locatr;

import android.net.Uri;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Mason on 1/30/2018.
 */

public class GalleryItem {

    //required for Gson:
    @SerializedName("title")
    @Expose()
    private String mCaption;
    @SerializedName("id")
    @Expose()
    private String mId;
    @SerializedName("url_s")
    @Expose()
    private String mUrl;
    @SerializedName("owner")
    @Expose()
    private String mOwner;
    @SerializedName("latitude")
    @Expose()
    private double mLat;
    @SerializedName("longitude")
    @Expose()
    private double mLon;

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String owner) {
        mOwner = owner;
    }

    //generates photo page URLs
    public Uri getPhotoPageUri(){
        return Uri.parse("https://www.flickr.com/photos/")
                .buildUpon()
                .appendPath(mOwner)
                .appendPath(mId)
                .build();
    }

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public double getLat() {
        return mLat;
    }

    public void setLat(double lat) {
        mLat = lat;
    }

    public double getLon() {
        return mLon;
    }

    public void setLon(double lon) {
        mLon = lon;
    }

    @Override
    public String toString(){
        return mCaption;
    }
}
