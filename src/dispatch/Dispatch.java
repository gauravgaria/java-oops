package dispatch;

public class Dispatch {

    private int loadNo;
    private String dropNo;
    private String[] images;
    private String barcode;
    private String username;
    private static String _connector = null; // **** has one instance each time this class constructor class it will not be null ***//
  //  private String _connector = null;  // ** Dispatch("Gaurav") constructor stores in _connector -> but when Dispatch(); called again _connector intialize to null
                                       //** But not with static keyword since it has one instance.

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

    public Dispatch(String connector){
        _connector = connector;
    }

    public void setConnection (){
        System.out.println(_connector.toLowerCase());
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
