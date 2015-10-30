package com.example.danny.mygooglemapapp.data;


import com.google.gson.JsonObject;

/**
 * Created by Danny on 7/23/2015.
 */
public class Location {
    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getStartLat() {
        return startLat;
    }

    public double getStartLng() {
        return startLng;
    }

    private double lat;
    private double lng;
    private double startLat;

    public void setStartLat(double startLat) {
        this.startLat = startLat;
    }

    public void setStartLng(double startLng) {
        this.startLng = startLng;
    }

    private double startLng;
    public Location(JsonObject location){
        lat = Double.parseDouble(location.get("lat").toString());
        lng = Double.parseDouble(location.get("lng").toString());

    }

    /**
     * Returns a string containing a concise, human-readable description of this
     * object. Subclasses are encouraged to override this method and provide an
     * implementation that takes into account the object's type and data. The
     * default implementation is equivalent to the following expression:
     * <pre>
     *   getClass().getName() + '@' + Integer.toHexString(hashCode())</pre>
     * <p>See <a href="{@docRoot}reference/java/lang/Object.html#writing_toString">Writing a useful
     * {@code toString} method</a>
     * if you intend implementing your own {@code toString} method.
     *
     * @return a printable representation of this object.
     */
    @Override
    public String toString() {
        float[] distance = new float[5];
        android.location.Location.distanceBetween(startLat,startLng,lat,lng,distance);
        return "Distance: "+ (distance[0]/1000)+" KM";
    }
}
