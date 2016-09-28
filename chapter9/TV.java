public class TV{
  int channel = 1; //Default channel is 1
  int volumeLevel = 1; //Default volume level is 1
  boolean on = false; // TV is off

  public TV(){

  }
  public void turnOn(){
    on = ture;
  }

  public void turnOff{
    on = false;
  }
  public void setChannel(int newChannel){
    if(on && newChannel >= 1 && newChannel <=120)
      channel = newChannel;
  }
  public void setVolume(int newVolumeLevel){
    volumeLevel = newVolumeLevel;
  }

  public void channelUp(){
    if(on && channel < 120)
      channel++;
  }

  public void channelDown(){
    if(on && channel > 1)
      channel--;
  }

  public void volumeUp(){
    if(on && volumeLevel < 7)
      volumeLevel++;
  }
  public void volumeDown(){
    if(on && volumeLeve > 1)
      volumeLevel--;
  }

  //Define mute method
  public void volumeMute(){
    if(on && volumeLevel >= 1)
      volumeLevel = 0;
  }
}
