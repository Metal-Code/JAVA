package Interface;

/*
*
* An interface can have static and default methods.
* Default methods enable us to add new functionality to existing interfaces.
* This feature was introduced in java 8 to ensure backward compatibility while updating an interface
* Class implementing the interface need not implement the default methods.
* Interfaces can also include private methods for default methods to use.
*
* 
*/

interface camera
{
    void takeSnap();
    void recordVideo();
    //so java allows adding a default method in interface to reduce the burden of adding and defining methods in base class
    private void playGame()
    {System.out.println("Playing game");}


    //when the logic of default method gets bigger it can be stored iin private methods
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

interface Wifi
{
    String[] getNetworks();
    void connectToNetwork(String Network);
}

class cellPhone
{
    void callNumber(int phoneNumber)
    {System.out.println("Calling "+phoneNumber);}

    void pickNumber(int phoneNumber)
    {System.out.println("Connecting...");}

    void takeSnap()
    {System.out.println("Taking the snap");}
}

class smartPhone extends cellPhone implements camera, Wifi
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

}

public class InterfaceDefaultMethods
{
    public static void main(String[] args)
    {
        smartPhone sam = new smartPhone();
        String[] ar = sam.getNetworks();

        for(String item:ar)
        {
            System.out.println(item);
        }

        sam.record4kVideo();
        //sam.playGame();
        //will throw an error
        sam.tempToShowPrivate();

    }
}
