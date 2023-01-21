package Builder_Pattern;
class phoneBuilder{
    private int Battery;
    private int Camera;
    private int ram;
    public phoneBuilder setCamera(int Camera){
        this.Camera = Camera;
        return this;
    }
    public phoneBuilder setBattery(int Battery){
        this.Battery = Battery;
        return this;
    }
    public phoneBuilder setram(int ram){
        this.ram = ram;
        return this;
    }
    public phone getPhone(){
        return new phone(Battery,Camera,ram);
    }
}