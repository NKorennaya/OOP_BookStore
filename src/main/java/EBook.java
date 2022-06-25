public class EBook extends Book2 {
    String downloadURL;
    public EBook(String name, String authorName, int id, double price, boolean isAvailable, String downloadURL){
        super(name, authorName, id, price, isAvailable);
        this.downloadURL = downloadURL;
    }

    public String getDownloadURL() {
        return downloadURL;
    }

    public void setDownloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
    }
    @Override
    public void printBookDetails(){
        super.printBookDetails();
        System.out.println("URL: " + downloadURL);
    }

}
