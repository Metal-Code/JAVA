package Interface;

interface camera2
{
    void takeSnap();
    void recordVideo();
    private void playGame()
    {System.out.println("Playing game");}

    default void tempToShowPrivate()
    {
        playGame();
        System.out.println("Using the private method in interface camera to show its working");
    }

    default void record4kVideo()
    {
        System.out.println("Recording in 4k");
    }
}

interface Wifi2
{
    String[] getNetworks();
    void connectToNetwork(String Network);
}

class cellPhone2
{
    void callNumber(int phoneNumber)
    {System.out.println("Calling "+phoneNumber);}

    void pickNumber(int phoneNumber)
    {System.out.println("Connecting...");}

    void takeSnap()
    {System.out.println("Taking the snap");}
}

class smartPhone2 extends cellPhone2 implements camera2, Wifi2
{
    public void takeSnap()
    {System.out.println("Taking the snap");}

    public void recordVideo()
    {System.out.println("Recording the video");}

    public void record4kVideo()
    {System.out.println("Recording in 4k by over-writing the default method in camera interface");}

    public String[] getNetworks()
    {
        System.out.println("Getting the list of networks");
        String[] networkList = {"Tata 5G", "Airtel Extreme", "Jio Fiber"};
        return networkList;
    }

    public void connectToNetwork(String Network)
    {System.out.println("Connecting to "+ Network);}

    public void testMethod()
    {
        System.out.println("Testing the method");
    }

}

public class Polymorphism
{
    public static void main(String[] args)
    {
        //this is a smartphone but must be used as a camera
        camera2 cam = new smartPhone2();
        //Not allowed - almost like dynamic method dispatch
        //cam.getNetworks();

        //also not allowed
        //cam.testMethod();

        smartPhone2 sm = new smartPhone2();
        sm.testMethod();
        sm.getNetworks();
        sm.recordVideo();
        sm.callNumber(7987);
    }
}
