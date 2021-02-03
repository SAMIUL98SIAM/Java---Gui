public class Ac extends Camera implements ExtraFeatures{

    @Override
    void captureImage() {
        System.out.print("Capturing image with dslr");
    }

    @Override
    public void resoulation() {
        System.out.print("4k, 2060p image/videos");
    }

}