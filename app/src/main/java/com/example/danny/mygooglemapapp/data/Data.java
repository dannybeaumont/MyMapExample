package com.example.danny.mygooglemapapp.data;


import com.example.danny.mygooglemapapp.data.Location;
/**
 * Created by Danny on 7/23/2015.
 */
public class Data {
    private String name;
    public Location location;
    private String vicinity;

    //private String lat;
    //private String lng;


    public String getName() {
        return name;
    }


    public String getVicinity() {
        return vicinity;
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
        return "Name: "+name+"\n"+location.toString()+"\nAddress:\n "+getVicinity();

    }
}
