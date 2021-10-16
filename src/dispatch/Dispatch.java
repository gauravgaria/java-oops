package dispatch;

public class Dispatch {

    private int loadNo;
    private String dropNo;
    private String[] images;
    private String barcode;
    private String username;

    /*** NOTE: There is always a default constructor but it is not seen, but is there when .java converts to .class file ***/
    public Dispatch(){}

    /*** Use this constructor to initialize the values.***/

    public Dispatch(int loadNo, String dropNo, String[] images, String barcode, String username) {
        this.loadNo = loadNo;
        this.dropNo = dropNo;
        this.images = images;
        this.barcode = barcode;
        this.username = username;
    }

    public int getLoadNo() {
        return loadNo;
    }

    public void setLoadNo(int loadNo) {
        this.loadNo = loadNo;
    }

    public String getDropNo() {
        return dropNo;
    }

    public void setDropNo(String dropNo) {
        this.dropNo = dropNo;
    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
