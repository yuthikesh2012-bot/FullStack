package Day_4;

interface Camera {
    void takePhoto();
}
interface videoRecorder {
    void recordVideo();
}

public class MultipleInterfaceExample implements Camera, videoRecorder {
    @Override
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording a video...");
    }

    public static void main(String[] args) {
        MultipleInterfaceExample example = new MultipleInterfaceExample();
        example.takePhoto();
        example.recordVideo();
    }
    
    
}
