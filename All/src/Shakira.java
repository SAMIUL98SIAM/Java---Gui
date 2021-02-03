public class Shakira {
    public static void main(String[] args) {
        Camera myCamera ;
        myCamera.captureImage();
        myCamera.setModel("dslr");
        myCamera.captureImage();
        myCamera = new MobileCamera();
        myCamera.setModel("mobile");
        myCamera.captureImage();
    }
}